plugins {
    id(dependenciesPlugin)
}


allprojects {
    group = AppInfo.PACKAGE
    version = AppInfo.VERSION

    repositories {
        mavenCentral()
    }
}
