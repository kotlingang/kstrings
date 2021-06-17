package `fun`.kotlingang.kstrings.builder

import `fun`.kotlingang.kstrings.models.LocalizedString
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


public class LocalizedStringBuilder(private val default: String) {
    private val variants = mutableMapOf<String, String>()

    public fun value(value: String): CodeDelegate = CodeDelegate(value)

    @PublishedApi
    internal fun build(): LocalizedString = LocalizedString(default, variants)

    public inner class CodeDelegate internal constructor(private val value: String) {
        public operator fun provideDelegate (
            thisRef: Any?, property: KProperty<*>
        ): ReadOnlyProperty<Any?, Unit> {
            variants[property.name] = value
            return ReadOnlyProperty { _, _ -> }
        }
    }
}

public inline fun localizedString (
    default: String, block: LocalizedStringBuilder.() -> Unit = {}
): LocalizedString = LocalizedStringBuilder(default).apply(block).build()
