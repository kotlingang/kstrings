pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

//rootProject.name = [name]
rootProject.name = "kstrings"

includeBuild("buildUtils/dependencies")
includeBuild("buildUtils/configuration")

include("core")
include("compose")
