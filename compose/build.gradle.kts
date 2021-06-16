plugins {
    id(`k-android-library`)
}

android {
    kotlinOptions.freeCompilerArgs += "-Xexplicit-api=strict"

    compileSdk = Version.COMPILE_SDK

    defaultConfig {
        targetSdk = Version.COMPILE_SDK
        minSdk = Version.MIN_SDK
    }

    dependencies {
        api(project(Dependencies.Project.Core))
        implementation(Dependencies.Androidx.Compose)
    }
}
