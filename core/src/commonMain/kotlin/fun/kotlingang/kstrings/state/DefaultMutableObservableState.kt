package `fun`.kotlingang.kstrings.state

import `fun`.kotlingang.kstrings.sync.platformSynchronized
import kotlin.properties.Delegates


internal class DefaultMutableObservableState<T>(value: T) : MutableObservableState<T> {
    private val observers = mutableListOf<UnsubscribeAction.(T) -> Unit>()

    override var value: T by Delegates.observable(value) { _, _, value ->
        platformSynchronized(lock = this) {
            for (observer in observers) observer (
                {
                    platformSynchronized(lock = this) {
                        observers -= observer
                    }
                },
                value
            )
        }
    }

    override fun observe(onChange: UnsubscribeAction.(T) -> Unit): UnsubscribeAction {
        platformSynchronized(lock = this) {
            observers += onChange
        }
        return UnsubscribeAction {
            platformSynchronized(lock = this) {
                observers -= onChange
            }
        }
    }
}
