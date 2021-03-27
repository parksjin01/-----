package chapter04

class Customer {

    fun order(casher: Casher, menu: String): Unit {
        println("[Order to casher1]")
        casher.takeOrder(menu, 1000)
        println("-".repeat(100))
    }

    fun order(casher: Casher2, menu: String): Unit {
        println("[Order to casher2]")
        casher.takeOrder(menu, 1000)
        println("-".repeat(100))
    }
}