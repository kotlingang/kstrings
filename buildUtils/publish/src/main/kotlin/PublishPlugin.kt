import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.the


class PublishPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(Dependencies.MavenPublish.PluginIn)
        val publish = target.extensions.create<PublishExtension>(name = "publish")

        target.afterEvaluate {
            // Otherwise, there is no release component in android
            afterEvaluate block@ {
                if (publish.ignore)
                    return@block

                if (publish.server.host == null ||
                    publish.server.deployPath == null
                ) {
                    error(
                        """
                    Provide credentials to connect with server by sftp as following:
                    publish {
                        server {
                            host = ...
                            deployPath = ...
                            // Optional
                            username = ...
                            password = ...
                            port = ... // default 22
                        }
                    }
                """.trimIndent()
                    )
                }

                if (publish.component.version == null ||
                    publish.component.group == null ||
                    publish.component.artifactId == null
                ) {
                    error(
                        """
                    Provide publication data as following:
                    publish {
                        component {
                            group = ...
                            artifactId = ...
                            version = ...
                            name = ... (Component name, usually "kotlin" for Kotlin projects)
                            // Optional 
                            displayName = ... (Name for pom.xml)
                            description = ...
                        }
                    }
                """.trimIndent()
                    )
                }

                project.the<PublishingExtension>().apply {
                    publications {
                        create<MavenPublication>(name = publish.component.artifactId!!) {
                            group = publish.component.group!!
                            artifactId = publish.component.artifactId!!
                            version = publish.component.version!!

                            pom {
                                publish.component.displayName?.let(name::set)
                                publish.component.description?.let(description::set)
                            }

                            if (components.asMap.containsKey(publish.component.name))
                                from(components[publish.component.name])
                            else
                                System.err.println(
                                    "Trying to create component from ${publish.component.name}, " +
                                            "but this component not found in project ${project.name}"
                                )
                        }
                    }

                    repositories {
                        maven {
                            name = "sftpRepo"

                            url = uri(
                                "sftp://${publish.server.host}:${publish.server.port}/${publish.server.deployPath}"
                            )

                            credentials {
                                username = publish.server.username
                                password = publish.server.password
                            }
                        }
                    }
                }
            }
        }
    }
}
