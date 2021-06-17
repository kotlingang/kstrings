open class PublishExtension {
    var ignore: Boolean = false

    class ServerConfig internal constructor() {
        var host: String? = null
        var port: Int = 22
        var username: String? = null
        var password: String? = null
        var deployPath: String? = null
    }

    internal val server = ServerConfig()
    fun server(block: ServerConfig.() -> Unit) {
        server.apply(block)
    }

    class ComponentConfig internal constructor() {
        var group: String? = null
        var artifactId: String? = null
        var version: String? = null
        var displayName: String? = null
        var description: String? = null
        var name: String = "kotlin"
    }

    internal val component = ComponentConfig()
    fun component(block: ComponentConfig.() -> Unit) {
        component.apply(block)
    }
}