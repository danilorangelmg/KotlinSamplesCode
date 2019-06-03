package library_functions

fun main(args: Array<String>) {
    letExample2()
}

/**
 * Example 1
 */
fun letExample1() {
    val string: String? = "value"
    string?.let { stringNonNull -> println("$stringNonNull") }
    string?.let { println("$it") }
}
/***
 * Example 1
 * ======================================================================================
 */

/**
 * Example 2
 */
fun letExample2() {
    //step by step
    val list = mutableListOf<String>("Value 1", "Value 2", "Value 3")
    list.let {
        println(list.toString())
        it.add("Value 4")
        it.toMutableList() //pass to next let
    }.let {
        println(list.toString())
        it.removeAt(2)
        it.toMutableList() //pass to next let
    }.let {
        println(list.toString())
    }
}

/***
 * Example 2
 * ======================================================================================
 */

