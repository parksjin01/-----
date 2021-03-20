package chapter02

import java.security.InvalidParameterException

object Customer {

    fun order(menu: String): Unit {

        println("[Order to casher1]")
        Casher.takeOrder(menu, 1000)
        println("-".repeat(100))

        println("[Order to casher2]")
        Casher2.takeOrder(menu, 1000)
        println("-".repeat(100))
    }
}

object Casher {

    fun takeOrder(menu: String, money: Long): Any {
        Pos.insert(menu)
        AccountBook.add(money)
        val coffee: Any = Barista.brew(menu)
        Pos.alarm("${coffee} is ready!!!")
        return coffee
    }
}

object Casher2 {

    var orderHistory: MutableList<String> = mutableListOf()

    fun takeOrder(menu: String, money: Long): Any {
        writeMenu(menu)
        val coffee: Any = Barista.brew(menu)
        AccountBook2.money += money
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

object AccountBook {
    private var money: Long = 0

    fun add(money: Long): Long {
        this.money += money
        return money
    }
}

object AccountBook2 {
    var money: Long = 0
}

object Barista {

    fun brew(menu: String): Any {
        var coffee: Any

        coffee = when (menu) {
            "Espresso", "espresso", "ESPRESSO" -> Espresso
            "Americano", "americano", "AMERICANO" -> Americano
            "Latte", "latte", "LATTE" -> Latte
            "Macchiato", "macchiato", "MACCHIATO" -> Macchiato
            else -> throw InvalidParameterException("Not supported coffee menu")
        }

        return coffee
    }
}

object Pos {

    val history: MutableList<String> = mutableListOf()

    fun insert(menu: String): Unit {
        history.add(menu)
    }

    fun alarm(message: String): Unit {
        Monitor.alert(message)
        Monitor.alert(Message)
        Bot.alert(message)
        Bot.alert(Message)
    }
}

object Monitor {

    fun alert(message: String): Unit {
        println("[TV] ${message}")
    }

    fun alert(message: Message): Unit {
        println("[TV] ${message}")
    }
}

object Bot {

    fun alert(message: String): Unit {
        println("[BOT] ${message}")
    }

    fun alert(message: Message): Unit {
        println("[BOT] ${message}")
    }
}

object Espresso {
    val name: String = "Espresso"
    val price: Int = 1000

    override fun toString(): String {
        return name
    }
}

object Americano {
    val name: String = "Americano"
    val price: Int = 1000

    override fun toString(): String {
        return name
    }
}

object Latte {
    val name: String = "Latte"
    val price: Int = 1000

    override fun toString(): String {
        return name
    }
}

object Macchiato {
    val name: String = "Macchiato"
    val price: Int = 1000

    override fun toString(): String {
        return name
    }
}

object Message {
    override fun toString(): String {
        return "Coffee is ready"
    }
}

fun main() {
    Customer.order("Americano")
    Customer.order("Latte")
    Customer.order("Cappuccino")
}