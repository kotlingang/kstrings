plugins {
    id(`k-mpp`)
}

kotlin {
    explicitApi()

    jvm()
    js {
        nodejs()
        browser()
    }

    sourceSets {
        all {
            languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
        }
    }
}
