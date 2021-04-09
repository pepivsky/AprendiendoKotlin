package arrays
/* Programa que imprime el acaracter previo al que se le da
Previous character
Write a program that reads four characters and prints the previous character in the Unicode table for each of them.


Sample Input:
b
c
d
e

Sample Output:
a
b
c
d
 */
fun main() {
    val charArray = CharArray(4) { readLine()!!.first() } // llena un array de chars con 4 elementos
    charArray.forEach { println(it - 1) }// recorre el array e imprime sus elementos

    /* solucion simplificada, se omite la declaracion de una variable
    CharArray(4) { readLine()!!.first() }.forEach { println(it - 1) }
     */
}