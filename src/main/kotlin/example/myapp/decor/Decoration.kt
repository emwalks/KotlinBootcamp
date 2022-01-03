package example.myapp.decor

data class Decoration(val rocks: String) { }

data class Decoration2(val rocks: String,
                       val wood: String,
                       val diver: String){
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

    val d4 = Decoration2("crystal", "wood", "diver")
    println(d4)

    // Assign all properties to variables.
    val (rock, wood, diver) = d4
    println(rock)
    println(wood)
    println(diver)



}