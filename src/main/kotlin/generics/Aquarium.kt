package generics

// The T here is of type Any? by default
// class Aquarium<T>(val waterSupply: T)

// Now T is a generic constraint - can't be null

// This is a more defined generic constraint by having a specific type
// what's the difference between specifying the type in the parameter val waterSupply?
class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
//        fun waterSupplyStillNeedsProcessing(): String =  "water supply needs processing first"
//        check(!waterSupply.needsProcessing, ::waterSupplyStillNeedsProcessing)
        // written using trailing closure syntax
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println(println("adding water from $waterSupply"))
    }
}

// open for subclassing
open class WaterSupply (var needsProcessing: Boolean)

// Subclasses
class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}


fun genericsExample() {
    // here I have used named argument at the call site
    // could be written as val aquarium = Aquarium(TapWater())
    // or with the explicit type val aquarium = Aquarium<TapWater>(TapWater())
    val aquarium = Aquarium(waterSupply = TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
}

/*
//now can no longer supply a string to watersupply parameter
fun genericsExample2() {
    val aquarium2 = Aquarium("string")
    println(aquarium2.waterSupply)
}

 */

/*
fun genericsExample3() {
//    val aquarium3 = Aquarium(null) // now we get a compilation error
    if (aquarium3.waterSupply == null) {
        println("waterSupply is null")
    }
}
*/

fun genericsExample4() {
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}

fun main() {
 genericsExample4()
}





