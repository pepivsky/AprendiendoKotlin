/* Programa que rota una lista hacia la derecha
Circular shift
Write a program that reads an A list of integers and cyclically shifts the elements of the list to the right: A[0] goes to the place of A[1], A[1] becomes A[2], ..., and the last element goes to the place of A[0]).

The first line of the input contains the number of elements in the list.
The other lines contain the elements of the list.

The output contains all the shifted elements of the list in a single line. Separate the elements by a space.


Sample Input:
5
1
2
3
4
5

Sample Output:
5 1 2 3 4

 */

fun main() {
    val size = readLine()!!.toInt()
    val numbers = MutableList(size) { readLine()!!.toInt() }

    val last = numbers.removeAt(numbers.lastIndex)
    numbers.add(0, last)
    println(numbers.joinToString(" "))

}