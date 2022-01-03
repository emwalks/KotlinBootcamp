package example.annotations

import example.myapp.plant

class Annotations {
}

class Plant {
    fun trim() {}
    fun fertilise() {}

    fun printAllFunctions(vararg declaredFunction: () -> Unit ) {
        println("Functions in class include $declaredFunction")
    }
}

fun main () {
    val plant = Plant()
    plant.printAllFunctions({ plant.trim() }, { plant.fertilise() })
}