package chapter05

class Customer {

    fun order(casher: Casher, menu: String): Unit {
        println("[Order to casher]")
        casher.takeOrder(menu, 1000)
        println("-".repeat(100))
    }
}