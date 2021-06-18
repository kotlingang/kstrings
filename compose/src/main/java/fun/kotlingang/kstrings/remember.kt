package `fun`.kotlingang.kstrings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember


@Composable
public fun <T : KStrings> T.remember(): State<T>  = remember { composeState }
