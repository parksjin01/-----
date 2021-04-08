package chapter05

class AccountBook {

    private var money: Long = 0

    fun add(money: Long): Long {
        this.money += money
        return money
    }
}