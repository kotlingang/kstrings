plugins {
    id(`k-mpp`)
}

kotlin {
    explicitApi()

    jvm()
    js(IR) {
        nodejs()
        browser()
    }

    sourceSets {
        all {
            languageSettings.useExperimentalAnnotation("kotlin.RequiresOptIn")
        }
    }
}
