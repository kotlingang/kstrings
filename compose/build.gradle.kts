plugins {
    id(`k-android-library`)
    id(publishPlugin)
}

publish {
    component {
        name = "release"
    }
}

android {
    kotlinOptions.freeCompilerArgs += "-Xexplicit-api=strict"

    compileSdk = Version.COMPILE_SDK

    defaultConfig {
        targetSdk = Version.COMPILE_SDK
        minSdk = Version.MIN_SDK
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.COMPOSE
        kotlinCompilerVersion = Version.KOTLIN
    }

    dependencies {
        api(project(Dependencies.Project.Core))
        implementation(Dependencies.Androidx.Compose)
    }
}
