package example.myapp

import example.myapp.decor.makeDecorations

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}


fun main() {
    makeFish()
    makeDecorations()
}

val typeInferredDouble = 3.14159

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasSpacesInline(): Boolean = find { it == ' ' } != null

