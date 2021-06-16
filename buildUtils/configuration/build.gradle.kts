plugins {
    `kotlin-dsl`
    id("dependencies")
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(Dependencies.Self)

    implementation(Dependencies.Android.Plugin)

    // Used to prevent classpath conflicts
    compileOnly(Dependencies.Kotlin.Plugin(version = "1.4.20"))
    runtimeOnly(Dependencies.Kotlin.Plugin)
}

gradlePlugin {
    plugins.register("k-mpp") {
        id = "k-mpp"
        implementationClass = "KotlinMultiplatformConfiguration"
    }
    plugins.register("k-jvm") {
        id = "k-jvm"
        implementationClass = "KotlinJvmConfiguration"
    }
    plugins.register("k-js") {
        id = "k-js"
        implementationClass = "KotlinJvmConfiguration"
    }
    plugins.register("k-android-library") {
        id = "k-android-library"
        implementationClass = "KotlinAndroidLibraryConfiguration"
    }
}
