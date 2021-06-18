plugins {
    id(`k-js`)
}

kotlin {
    explicitApi()
    
    js(IR) {
        browser()
    }
}

dependencies {
    api(project(Dependencies.Project.Core))
    implementation(Dependencies.KVision.Core)
}
