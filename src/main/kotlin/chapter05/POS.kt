package chapter05

class POS {
    val monitor: Display = Monitor()
    val bot: Display = Bot()

    val history: MutableList<String> = mutableListOf()

    fun insert(menu: String): Unit {
        history.add(menu)
    }

    fun alarm(message: String): Unit {
        monitor.alert(message)
        bot.alert(message)
    }

}