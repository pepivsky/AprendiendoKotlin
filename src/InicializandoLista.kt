/*
Initializing a list
Create a mutable list of integers named numbers with 100 elements. Its first element must be 1, the tenth must be 10, and the hundredth one must be 100. All other elements must be equal to 0.

Use the provided code template.
 */

fun main() {
    val numbers = MutableList(100) { 0 } // inicializando una lista mutable con ceros
    numbers[0] = 1
    numbers[9] = 10
    numbers[99] = 100
    // do not touch the lines below
    println(numbers.joinToString())
}