package example.simplelambdas

//https://developer.android.com/codelabs/kotlin-bootcamp-sams#3

val waterFilter = { dirty: Int -> dirty / 2 }

fun main() {
    val result = waterFilter(30)
    println("$result")

    val myFish = listOf<Fish>(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))
    val resultOfFilter = myFish.filter { it.name.contains("i") }.joinToString(", ") { it.name }
    println("${resultOfFilter.trim()}")
}

data class Fish(val name: String)


