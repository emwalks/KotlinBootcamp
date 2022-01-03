package example.myapp

open class AquariumPlant(val color: String, private val size: Int)

// these are extension functions
fun AquariumPlant.isRed() = color == "red"    // OK
//fun AquariumPlant.isBig() = size > 50         // gives error - can't access a private  property in an extension

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

// these are extension functions
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val plant = GreenLeafyPlant(size = 10)
//plant.print()
//println("\n")
val aquariumPlant: AquariumPlant = plant
//aquariumPlant.print()  // what will it print?

// this is an extension property
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

// function that takes a nullable receiver
// This is indicated with a question mark ? after the type, before the dot.
// Inside the body, you can test if this is not null by using question mark-dot-apply ?.apply.
// extension function on a nullable receiver
fun AquariumPlant?.pull() {
    println("function has been called")
    this?.apply {
        println("removing $this")
    }
}

//val plant: AquariumPlant? = null
// plant.pull()
// => Even though plant is null, the function pull() still runs however thhe inner apply { } does not execute

//Output
//⇒ GreenLeafyPlant
//AquariumPlant
// Commentary
// plant.print() prints GreenLeafyPlant.
// You might expect aquariumPlant.print() to print GreenLeafyPlant, too, because it was assigned the value of plant.
// But the type is resolved at compile time, so AquariumPlant gets printed.

