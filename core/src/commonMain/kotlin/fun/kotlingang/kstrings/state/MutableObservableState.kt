package `fun`.kotlingang.kstrings.state


public interface MutableObservableState<T> : ObservableState<T> {
    override var value: T

    override fun observe(onChange: UnsubscribeAction.(T) -> Unit): UnsubscribeAction
}

@Suppress("FunctionName")
public fun <T> MutableObservableState (
    value: T
): MutableObservableState<T> = DefaultMutableObservableState(value)
