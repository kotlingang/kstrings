package `fun`.kotlingang.kstrings.state

import `fun`.kotlingang.kstrings.KStrings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember


@Composable
public fun <T : KStrings> T.remember(): State<T>  = remember { composeState }
