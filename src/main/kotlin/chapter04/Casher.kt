package chapter04

class Casher(val pos: POS, val accountBook: AccountBook, val barista: Barista) {

    fun takeOrder(menu: String, money: Long): Any {
        pos.insert(menu)
        accountBook.add(money)
        val coffee: Any = barista.brew(menu)
        pos.alarm("${coffee} is ready!!!")
        return coffee
    }
}