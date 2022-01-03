package generics

class Aquarium {
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

