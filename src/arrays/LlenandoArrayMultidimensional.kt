package arrays
/* Programa que llena un array multidimensional
Cube of zeros
Create a 3x3x3 three-dimensional array that contains elements of type Int and is filled with zeros (0).

Print it using the function contentDeepToString().
 */
fun main() {
    val matrix = Array(3) { Array(3) { Array(3) { 0 } } }
    println(matrix.contentDeepToString())
}