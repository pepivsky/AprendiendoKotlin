package arrays
/*
Imagine there are three boys in the sports class.

You need to write a program that checks if the boys are arranged in ascending or descending order by height. The program ырщгдв read three integer numbers h1, h2, h3 and to output true or false. If the boys have the same height, they are arranged correctly.

 Report a typo
Sample Input 1:

165
161
158
Sample Output 1:

true
Sample Input 2:

155
165
160
Sample Output 2:

false
Sample Input 3:

161
161
165
Sample Output 3:

true
 */
fun main() {
    val hList = intArrayOf(
        readLine()!!.toInt(),
        readLine()!!.toInt(),
        readLine()!!.toInt(),
    )

    // contentequials compara dos arrays, orden y elementos, si es el mismo devuelve true

    println(
        hList.sortedArray().contentEquals(hList) ||
                hList.sortedArrayDescending().contentEquals(hList)
    )
}