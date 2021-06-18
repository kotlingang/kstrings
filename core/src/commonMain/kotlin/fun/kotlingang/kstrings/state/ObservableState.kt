package `fun`.kotlingang.kstrings.state


public fun interface UnsubscribeAction {
    public fun unsubscribe()
}

public interface ObservableState<T> {
    public val value: T

    public fun observe(onChange: UnsubscribeAction.(T) -> Unit): UnsubscribeAction
}
