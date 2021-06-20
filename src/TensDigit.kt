
/* Programa que imprime las decenas de un numero
The number of tens
There is a non-negative integer N (0 ≤ N ≤ 1000000). Find the number of tens in it (next to the last digit of the number). If there is only one digit, you can consider that the number of tens equals zero.


Sample Input:
173

Sample Output:
7


 */

fun main(args: Array<String>) {
    val number = readLine()!!.toInt() // 173
    println(number % 100 / 10) // seria 7.5 pero lo imprime como int entocnes da 7
}