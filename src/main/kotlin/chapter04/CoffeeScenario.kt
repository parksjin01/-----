package chapter04

fun main() {
    val pos: POS = POS()
    val accountBook: AccountBook = AccountBook()
    val barista: Barista = Barista()

    val casher1: Casher = Casher(pos, accountBook, barista)
    val casher2: Casher2 = Casher2(barista, accountBook)

    val customer: Customer = Customer()

    customer.order(casher1, "Americano")
    customer.order(casher2, "Americano")

    customer.order(casher1, "Latte")
    customer.order(casher2, "Latte")

    customer.order(casher1, "Cappuccino")
    customer.order(casher2, "Cappuccino")
}