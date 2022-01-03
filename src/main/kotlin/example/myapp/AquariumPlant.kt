package example.myapp

open class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "red"    // OK
fun AquariumPlant.isBig() = size > 50         // gives error

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val plant = GreenLeafyPlant(size = 10)
//plant.print()
//println("\n")
val aquariumPlant: AquariumPlant = plant
//aquariumPlant.print()  // what will it print?

//Output
//⇒ GreenLeafyPlant
//AquariumPlant
// Commentary
// plant.print() prints GreenLeafyPlant.
// You might expect aquariumPlant.print() to print GreenLeafyPlant, too, because it was assigned the value of plant.
// But the type is resolved at compile time, so AquariumPlant gets printed.