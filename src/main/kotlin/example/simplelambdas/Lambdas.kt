package example.simplelambdas

val waterFilter = { dirty: Int -> dirty / 2 }

fun main() {
    val result = waterFilter(30)
    println("$result")
}