package example.simplelambdas

//https://developer.android.com/codelabs/kotlin-bootcamp-sams#3

val waterFilter = { dirty: Int -> dirty / 2 }

fun main() {
    val result = waterFilter(30)
    println("$result")

    val myFish = listOf<Fish>(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))
    val resultOfFilter = myFish.filter { it.name.contains("i") }.joinToString(", ") { it.name }
    println("${resultOfFilter.trim()}")

    fishExamples()
}

data class Fish(val name: String)

// https://developer.android.com/codelabs/kotlin-bootcamp-sams#4

fun fishExamples() {
    val fish = Fish("splashy")
    with(fish.name) {
        println(this.capitalize())
    }
}


