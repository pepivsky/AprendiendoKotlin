/* Ejemplo usando tyr catch con return
Converter to Double
Consider a function that takes a string and converts it to a double. If the input string is empty or has a wrong format, a runtime exception occurs and the program fails.

Fix the function so that it catches any exceptions and returns the default value 0 (zero) if an exception occurred.


Sample Input:
123.0

Sample Output:
123.0


Sample Input:
d
 */

fun main() {
    println(convertStringToDouble(readLine()!!))
}

fun convertStringToDouble(input: String): Double {
    return try { input.toDouble() } catch (e: Exception) { return 0.0 }
}