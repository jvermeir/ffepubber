class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "ajggj, ${platform.name}!"
    }
}