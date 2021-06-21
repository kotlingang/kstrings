package `fun`.kotlingang.kstrings.builder

import `fun`.kotlingang.kstrings.LocalizedString


public inline fun localizedString (
    default: String, block: LocalizedStringBuilder.() -> Unit = {}
): LocalizedString = LocalizedStringBuilder(default).apply(block).build()
