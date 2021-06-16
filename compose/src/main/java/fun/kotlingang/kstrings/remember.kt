package `fun`.kotlingang.kstrings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember


public val <T : KStrings> T.remember: State<T>
    @Composable get() = remember { state }
