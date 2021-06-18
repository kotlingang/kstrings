package `fun`.kotlingang.kds.state

import `fun`.kotlingang.kstrings.KStrings
import `fun`.kotlingang.kstrings.state.state
import io.kvision.state.ObservableState


public val <T : KStrings> T.kvisionState: ObservableState<T> get() =
    object : ObservableState<T> {
        override fun getState(): T = this@kvisionState

        override fun subscribe(observer: (T) -> Unit): () -> Unit =
            with(state.observe { observer(it) }) {
                { unsubscribe() }
            }
    }
