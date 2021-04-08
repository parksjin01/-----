package chapter05

interface Display {
    fun alert(message: String): Unit

    fun alert(message: Message): Unit
}