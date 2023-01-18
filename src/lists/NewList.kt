package lists
/* creando una nueva lista a partir de otra,
en cuanto a rendimiento add es la mejor opcion ya que no crea una nueva lista, simplemente agrega los elementos
.toMutableList tambien crea una nueva lista

 */
fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    // put your code here
    val finalList = mutableListOf<Int>()
    finalList.addAll(numbers)
    finalList.add(number)
    return finalList
}

// otra solucion con buen rendimiento
fun solution2(numbers: List<Int>, number: Int): MutableList<Int> {
    // put your code here
    val finalList = mutableListOf<Int>()
    finalList += numbers // plusAssign in mutableList doesnt create a new list, only add elements
    finalList += number
    return finalList
}

fun main() {
    val list = listOf(1,2,3)

    println(solution(list,4))
    println(solution2(list,4))
}