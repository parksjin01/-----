package chapter05

class Casher2(val barista: Barista, val accountBook: AccountBook): Casher {

    private var orderHistory: MutableList<String> = mutableListOf()

    override fun takeOrder(menu: String, money: Long): Any {
        writeMenu(menu)
        val coffee: Any = barista.brew(menu)
        accountBook.add(money)
        notifyCoffeeReady(menu)
        return coffee
    }

    fun writeMenu(menu: String): Unit {
        orderHistory.add(menu)
    }

    fun notifyCoffeeReady(menu: String): Unit {
        println("[Casher] ${menu} is ready!!!")
    }
}