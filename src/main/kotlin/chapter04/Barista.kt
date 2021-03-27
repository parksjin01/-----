package chapter04

import chapter04.Coffee
import java.security.InvalidParameterException

class Barista {

    fun brew(menu: String): Coffee {
        var coffee: Coffee

        coffee = when (menu) {
            "Espresso", "espresso", "ESPRESSO" -> Coffee("Espresso", 1000)
            "Americano", "americano", "AMERICANO" -> Coffee("Americano", 1000)
            "Latte", "latte", "LATTE" -> Coffee("Latte", 1000)
            "Macchiato", "macchiato", "MACCHIATO" -> Coffee("Macchiato", 1000)
            else -> throw InvalidParameterException("Not supported coffee menu")
        }

        return coffee
    }
}