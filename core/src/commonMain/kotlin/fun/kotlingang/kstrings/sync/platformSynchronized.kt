package `fun`.kotlingang.kstrings.sync


internal expect inline fun <T> platformSynchronized(lock: Any, crossinline block: () -> T): T
