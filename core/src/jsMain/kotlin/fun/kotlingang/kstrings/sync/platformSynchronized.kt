package `fun`.kotlingang.kstrings.sync


internal actual inline fun <T> platformSynchronized(lock: Any, crossinline block: () -> T) = block()
