package library_functions

fun main(args: Array<String>) {

}

/***
 * Example 1
 */
fun withExample1(): WebServiceObj {
    val memoryObj = MemoryObj("OnePlus 7", 300.0, "CellPhone")
    return with(memoryObj) {
        return@with WebServiceObj(
                orderId = 1234,
                productName = this.productName,
                value = this.value,
                category = this.category
        )
    }
}

data class MemoryObj(val productName: String, val value: Double, val category: String)
data class WebServiceObj(val orderId: Long, val productName: String, val value: Double, val category: String)
/***
 * Example 1 end
 * ======================================================================================
 */
