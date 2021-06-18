@file:Suppress("unused", "FunctionName", "MemberVisibilityCanBePrivate")

object Dependencies {
    const val Plugin = "dependencies:dependencies:SNAPSHOT"

    object Kotlin {
        val Plugin = Plugin()
        fun Plugin(version: String = Version.KOTLIN) = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        const val Multiplatform = "org.jetbrains.kotlin.multiplatform"
        const val Jvm = "org.jetbrains.kotlin.jvm"
        const val Js = "org.jetbrains.kotlin.js"
        const val Android = "org.jetbrains.kotlin.android"

        const val Reflection = "org.jetbrains.kotlin:kotlin-reflect:${Version.KOTLIN}"
    }

    object Android {
        const val Plugin = "com.android.tools.build:gradle:${Version.ANDROID_GRADLE_PLUGIN}"
        const val Application = "com.android.application"
        const val Library = "com.android.library"
    }

    object Androidx {
        const val Compose = "androidx.compose.runtime:runtime:${Version.COMPOSE}"
    }

    object MavenPublish {
        const val PluginIn = "maven-publish"
    }

    object Publish {
        const val Plugin = "publish:publish:SNAPSHOT"
    }

    object KVision {
        const val Core = "io.kvision:kvision:${Version.KVISION}"
    }

    object Project {
        const val Core = ":core"
    }
}