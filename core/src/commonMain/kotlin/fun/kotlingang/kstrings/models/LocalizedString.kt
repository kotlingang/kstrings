package `fun`.kotlingang.kstrings.models


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
}
