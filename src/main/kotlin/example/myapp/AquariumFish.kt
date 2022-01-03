package example.myapp

private object GoldColor: FishColor {
    override val color: String = "gold"

}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Shark :  FishColor, FishAction {
    override val color: String = "gold"

    override fun eat() {
        println("eat fish")
    }


}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor {

}