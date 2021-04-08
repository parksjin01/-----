package chapter05

interface Casher {

    fun takeOrder(menu: String, money: Long): Any
}