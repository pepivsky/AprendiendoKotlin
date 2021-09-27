
/*
The index of the first max
Write a program that reads a list of integers and finds the index of the first maximum in the list.

The first line contains the number of elements in the list. The other lines contain the elements of the list. There is at least one element in the list.

Output a single integer value, which is the index of the first maximum.


Sample Input:
5
2
5
3
4
5

Sample Output:
1

 */

fun main() {
    val numbers = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(numbers.indexOf(numbers.maxOrNull())) // obtiene el indice del primer maximo
}