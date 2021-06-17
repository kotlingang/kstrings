plugins {
    `kotlin-dsl`
    id("dependencies")
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(Dependencies.Plugin)
    implementation(Dependencies.Publish.Plugin)

    implementation(Dependencies.Android.Plugin)

    api(Dependencies.Kotlin.Plugin)
}

gradlePlugin {
    plugins.register("configuration") {
        id = "configuration"
        implementationClass = "unused.GradlePlugin"
    }
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
