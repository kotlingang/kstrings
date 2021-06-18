package `fun`.kotlingang.kstrings

import `fun`.kotlingang.kstrings.state.MutableObservableState

public open class KStrings {
    public val codeState: MutableObservableState<String?> = MutableObservableState(value = null)
    public var code: String? by codeState::value
}
