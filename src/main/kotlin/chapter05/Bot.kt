package chapter05

class Bot: Display {

    override fun alert(message: String): Unit {
        println("[BOT] ${message}")
    }

    override fun alert(message: Message): Unit {
        println("[BOT] ${message}")
    }
}