package arrays
/* Ejemplo usando contentDeepToString para acceder a los elementos dentro del arreglo y mostrarlos todos como un solo String
Accordance
Create a 2x3 matrix (2-dimensional array) where each element consists of two indices that correspond to it. So elements of this array are strings denoting the indices of each element.

For example, the second element in the first row should be a string "[0][1]".

For a 2x2 array, it might look like that:

[0][0]	[0][1]
[1][0]	[1][1]
You should output a similar matrix, only 2x3, using the function contentDeepToString().


 */
fun main() {
    val matrix = arrayOf(
        arrayOf("[0][0]", "[0][1]", "[0][2]"),
        arrayOf("[1][0]", "[1][1]", "[1][2]"),
    )
    println(matrix.contentDeepToString())
}