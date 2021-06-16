package `fun`.kotlingang.kstrings.annotations


@RequiresOptIn (
    message = """
        This API may be used to customize the library, but should not be used by end user directly
    """
)
public annotation class DelicateKStringsApi
