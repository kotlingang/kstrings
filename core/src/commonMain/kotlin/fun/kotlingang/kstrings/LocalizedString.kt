package `fun`.kotlingang.kstrings

import kotlin.reflect.KProperty


public typealias LocalizeVariants = Map<String, String>

public class LocalizedString (
    private val default: String,
    private val variants: LocalizeVariants
) {
    public operator fun get(code: String?): String {
        return variants.getOrElse (
            key = code ?: return default
        ) { default }
    }

    public operator fun LocalizedString.getValue (
        thisRef: KStrings, property: KProperty<*>
    ): String = this[thisRef.code]
}
