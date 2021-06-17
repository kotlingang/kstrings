package publish

import PublishExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.gradle.util.GUtil.loadProperties


fun Project.configureDefaultPublish() = the<PublishExtension>().apply {
    if(ignore)
        return@apply

    val deployPropertiesFile = rootProject.file("deploy.properties")

    if(deployPropertiesFile.exists()) {
        val properties = loadProperties(deployPropertiesFile)
        server {
            host = properties.getProperty("host")
            properties.getProperty("port")?.toIntOrNull()?.let {
                port = it
            }
            deployPath = properties.getProperty("deployPath")
            username = properties.getProperty("username")
            password = properties.getProperty("password")
        }
        component {
            group = "${project.group}"
            artifactId = project.name
            version = "${project.version}"
            displayName = project.name
        }
    } else {
        System.err.println("$name: There is no deploy.properties file in root dir, so deploy cannot be configured")
        ignore = true
    }
}
