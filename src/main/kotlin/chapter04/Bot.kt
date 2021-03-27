package chapter04

class Bot {

    fun alert(message: String): Unit {
        println("[BOT] ${message}")
    }

    fun alert(message: Message): Unit {
        println("[BOT] ${message}")
    }
}