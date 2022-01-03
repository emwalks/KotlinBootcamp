import java.util.*




fun main() {

    val aLambda: (Int) -> Int = { it / 2 }

    fun mySingleOrderFunc(take: Int): Int {
        return (take/2)
    }

    fun myHigherOrderFun(take: Int, operation: (Int) -> Int) : Int {

        return operation(take)
    }
    var myResult = myHigherOrderFun(4, ::mySingleOrderFunc)
    println(myResult)

    var myLambdaResult = myHigherOrderFun(6, aLambda)
    println(myLambdaResult)

    var myLambdaResultAsALastParameterCall = myHigherOrderFun(8) { it/2 }
    println(myLambdaResultAsALastParameterCall)
}

// filters
val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
fun filters() {

    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it [0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
}
//functions and default values

fun randomDay(): String {
    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eat $food")
    println("Change water? ${shouldChangeWater(day)}")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

private fun isSunday(day: String) = day == "Sunday"

private fun isTooHot(temperature: Int) = temperature > 30

private fun isDirty(dirty: Int) = dirty > 30

// if else loops
fun checkarray(args: Array<String>) {
    if (args.size > 0) {
        for ((index, element) in args.withIndex()) {
            println("Hello, ${element}")
            print(index)
        }
    } else {
        println("Hello, World!")
    }
}

val temperature = 100
val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
//println(message)

