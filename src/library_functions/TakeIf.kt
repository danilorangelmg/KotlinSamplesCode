package library_functions

fun main(args: Array<String>) {
    takeifExample1()
}

/***
 * Example 1
 */
fun takeifExample1() {
    val condition = false
    val testTakeIf = TestTakeIf(true)
    testTakeIf.takeIf {
        it.flagValue == condition
    }?.apply {
        stringObjec = "Value with condition true"
    }.also {
        //process if condition true
        processObj(it)
    }
}

fun processObj(testTakeIf: TestTakeIf?) {
    //or any action
    println("${testTakeIf?.stringObjec}")
}

data class TestTakeIf(val flagValue: Boolean, var stringObjec: String = "without Value")
/***
 * Example 1 end
 * ======================================================================================
 */

/***
 * Example 2
 */
fun takeIfExample2() {
    val condition = true
    val viewState= if (condition) View.GONE else View.VISIBLE
    val test = TestExample2()

    test.apply {
        visibility = viewState
    }.takeIf {
        it.visibility == View.VISIBLE
    }?.apply {
        outputProperty = "With value"
    }

    println("${test.outputProperty}")
}

enum class View()  {
    GONE,
    VISIBLE,
    NaV
}

class TestExample2() {
    var visibility: View = View.NaV
    var outputProperty: String = "Without value"
}
/***
 * Example 2 end
 * ======================================================================================
 */
