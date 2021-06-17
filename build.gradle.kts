import publish.configureDefaultPublish

plugins {
    id(dependenciesPlugin)
    id(configurationPlugin)
    id(publishPlugin)
}

publish {
    ignore = true
}

allprojects {
    group = AppInfo.PACKAGE
    version = AppInfo.VERSION

    repositories {
        mavenCentral()
        google()
    }

    apply(plugin = publishPlugin)
    configureDefaultPublish()
}
