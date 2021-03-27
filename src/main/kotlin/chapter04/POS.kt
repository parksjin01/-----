package chapter04

class POS {
    val monitor: Monitor = Monitor()
    val bot: Bot = Bot()

    val history: MutableList<String> = mutableListOf()

    fun insert(menu: String): Unit {
        history.add(menu)
    }

    fun alarm(message: String): Unit {
        monitor.alert(message)
        bot.alert(message)
    }

}