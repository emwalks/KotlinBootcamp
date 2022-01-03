package generics

class Aquarium<T>(val waterSupply: T)

fun genericsExample() {
    // here I have used named argument at the call site
    // could be written as val aquarium = Aquarium(TapWater())
    // or with the explicit type val aquarium = Aquarium<TapWater>(TapWater())
    val aquarium = Aquarium(waterSupply = TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
}

fun genericsExample2() {
    val aquarium2 = Aquarium("string")
    println(aquarium2.waterSupply)
}

fun genericsExample3() {
    val aquarium3 = Aquarium(null)
    if (aquarium3.waterSupply == null) {
        println("waterSupply is null")
    }

}

fun main() {
    genericsExample3()
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





