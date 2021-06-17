package `fun`.kotlingang.kstrings.delegate

import `fun`.kotlingang.kstrings.KStrings
import `fun`.kotlingang.kstrings.models.LocalizedString
import kotlin.reflect.KProperty


public operator fun LocalizedString.getValue(thisRef: KStrings, property: KProperty<*>): String =
    this[thisRef.code]
