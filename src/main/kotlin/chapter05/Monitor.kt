package chapter05

class Monitor: Display {
    override fun alert(message: String): Unit {
        println("[TV] ${message}")
    }

    override fun alert(message: Message): Unit {
        println("[TV] ${message}")
    }
}