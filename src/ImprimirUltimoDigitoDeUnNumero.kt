/* Programa que imprime el ultimo digito de un numero
The last digit of a number
Write a program that reads a number and outputs its last digit.


Sample Input:
425

Sample Output:
5

 */

fun main() {
    val num = readLine()!!.toInt() // 425
    println(num % 10) // imprime el  ultimo digito 5
}

// ejemplo inline
// fun main() = println(readLine()!!.toInt() % 10)