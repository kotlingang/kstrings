package `fun`.kotlingang.kstrings

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf


public val <T : KStrings> T.state: State<T>
    get() = object : MutableState<T> by mutableStateOf(value = this@state) {
        init {
            codeState.observe {
                component2()(this@state)
            }
        }
    }
