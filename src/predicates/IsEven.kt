package predicates

/*
ejemplo de predicado que revisa si un numero es par o o no,
se usa para filtrar una lista  con solo los numeros pares
 */

fun isEven(num: Int): Boolean = num % 2 == 0
// otra forma de declarar el predicado
// val isEven: (Int) -> Boolean = { it % 2 == 0 }


fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    val newList = nums.filter { isEven(it) }
    println(newList) // [2, 4, 6]

    val newList2 = nums.filter { num: Int -> num == 2 } // pasandole una lambda directamente
    println(newList2)

}