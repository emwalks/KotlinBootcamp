package example.annotations

// reflection import not working as expected
// import kotlin.reflect.full.*


class Plant {
    fun trim() {}
    fun fertilise() {}

//    fun printAllFunctions(vararg declaredFunction: () -> Unit ) {
//        println("Functions in class include $declaredFunction")
//    }
}

fun testAnnotations() {
    //  Use ::class to get information about a class at runtime.
    val classObj = Plant::class
  //  for (m in classObj.declaredMemberFunctions) {
   //     println(m.name)
 //  }
}

fun main () {
    testAnnotations()
}