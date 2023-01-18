package functions.lambdas
/*
Write a lambda expression that accepts two long arguments as range borders and returns the multiplication of all the numbers in this range (inclusively). Guaranteed that 0 <= left border <= right border. If left border == right border then the result is any border.

Note that you don't need to write in one line, you can use loops.
 */
fun main() {
    val lambda: (Long, Long) -> Long = { start: Long, end: Long ->
        var result: Long = 1
        for (i in start..end) {
            result *= i
        }
        result
    }

    println(lambda(1, 3))
}