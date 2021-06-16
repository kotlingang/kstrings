package `fun`.kotlingang.kstrings.delegate

import `fun`.kotlingang.kstrings.KStrings
import `fun`.kotlingang.kstrings.builder.LocalizedStringBuilder
import `fun`.kotlingang.kstrings.models.LocalizedString
import kotlin.reflect.KProperty


public inline fun KStrings.string (
    default: String, block: LocalizedStringBuilder.() -> Unit = {}
): LocalizedStringDelegate {
    val string = LocalizedStringBuilder(default).apply(block).build()
    return LocalizedStringDelegate(strings = this, string)
}

public class LocalizedStringDelegate (
    private val strings: KStrings,
    private val string: LocalizedString
) {
    public operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        string[strings.code]
}
