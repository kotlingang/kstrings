package `fun`.kotlingang.kstrings.state

import `fun`.kotlingang.kstrings.KStrings
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.neverEqualPolicy


public val <T : KStrings> T.composeState: State<T>
    get() = object : MutableState<T> by mutableStateOf(value = this@composeState, policy = neverEqualPolicy()) {
        init {
            codeState.observe {
                component2()(this@composeState)
            }
        }
    }
