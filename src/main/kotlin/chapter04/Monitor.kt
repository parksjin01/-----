package chapter04

class Monitor {
    fun alert(message: String): Unit {
        println("[TV] ${message}")
    }

    fun alert(message: Message): Unit {
        println("[TV] ${message}")
    }
}