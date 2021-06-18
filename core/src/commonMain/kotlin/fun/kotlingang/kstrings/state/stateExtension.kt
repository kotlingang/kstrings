package `fun`.kotlingang.kstrings.state

import `fun`.kotlingang.kstrings.KStrings


/**
 * Object here is always stays same, while only reference reassigned
 */
public val <T : KStrings> T.state: ObservableState<T> get() = object : ObservableState<T> {
    private val mut = MutableObservableState(value = this@state)

    init {
        codeState.observe {
            mut.value = this@state
        }
    }

    override val value: T = this@state

    override fun observe(onChange: UnsubscribeAction.(T) -> Unit) = mut.observe(onChange)
}
