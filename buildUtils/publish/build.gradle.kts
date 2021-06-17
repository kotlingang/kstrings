plugins {
    `kotlin-dsl`
    id("dependencies")
}

group = "publish"
version = "SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
}

gradlePlugin {
    plugins.register("publish") {
        id = "publish"
        implementationClass = "PublishPlugin"
    }
}

dependencies {
    implementation(Dependencies.Plugin)
}
