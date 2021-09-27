
/*
Playing with numbers
You have a mutable list of integers numbers. Add the sum of all list elements to the beginning of the list. Then delete the penultimate item in the list. It is guaranteed that the length of the array is greater than 2.


Sample Input:
8 11 1 2 3

Sample Output:
25 8 11 1 3

 */

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here
    val sum = numbers.sum()
    numbers.add(0, sum) // agrega un elemento en el indice espercificado
    numbers.removeAt(numbers.lastIndex - 1) // elimina un elemento en el indice especificado


    // do not touch the lines below
    println(numbers.joinToString(" "))
}