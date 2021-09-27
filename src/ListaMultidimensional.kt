/* Programa que crea una lista multidimensional de 3x3x3 y la imprime
Cube of zeros
Create a 3x3x3 three-dimensional list that contains elements of type Int and is filled with zeros (0).

Print it.
 */

fun main() { // lista de 3x3x3
    val list = listOf(
        listOf(listOf(0, 0, 0), listOf(0, 0, 0), listOf(0, 0, 0)),
        listOf(listOf(0, 0, 0), listOf(0, 0, 0), listOf(0, 0, 0)),
        listOf(listOf(0, 0, 0), listOf(0, 0, 0), listOf(0, 0, 0))
    )
    println(list)
}

/* Otra solucion
fun main() {
    // write your code here
    val lista = MutableList(3) { MutableList(3) { MutableList(3) { 0 } } }
    println(lista)
}
 */