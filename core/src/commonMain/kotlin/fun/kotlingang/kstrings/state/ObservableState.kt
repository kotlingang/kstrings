package `fun`.kotlingang.kstrings.state


public interface ObservableState<T> {
    public val value: T

    public fun observe(onChange: (T) -> Unit)
}
