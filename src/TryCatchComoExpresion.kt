/* Ejercicio arregla el codigo
Fix the code
The code below should print the last character in the string inputString. However, this code contains a certain number of mistakes, and it also throws StringOutOfBoundsException.

Fix the code below so that it prints the last character in the string inputString and doesn't throw an exception.


Sample Input:
lorem

Sample Output:
m


Sample Input:
ipsum

Sample Output:
m
 */

fun main() {
    val inputString = readLine()!!
    // try catch como expresion
    val lastIndexChar = try { inputString[inputString.length - 1] } catch (e: StringIndexOutOfBoundsException) { "" }
    println(lastIndexChar)
}