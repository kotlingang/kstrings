pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

rootProject.name = "kstrings"

includeBuild("buildUtils/dependencies")
includeBuild("buildUtils/configuration")
includeBuild("buildUtils/publish")

include("core")
include("compose")
include("kvision")
