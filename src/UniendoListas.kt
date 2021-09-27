
/* Ejemplo uniendo dos listas
Adding lists
Concatenate two lists firstList and secondList and print the result.

In the example below, each line corresponds to a separate list. Elements are separated by spaces.

Hint

Use the function joinToString().

Sample Input:
valar morghulis
valar dohaeris

Sample Output:
valar, morghulis, valar, dohaeris

 */

fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    // do not touch the lines above
    // write your code here
    println((firstList + secondList).joinToString())
}