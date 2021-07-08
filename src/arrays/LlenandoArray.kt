package arrays
/*
Read two lines, each on a separate line, and print whether they are equal or not.

 Report a typo
Sample Input 1:

Right answer
Right answer
Sample Output 1:

true
Sample Input 2:

Line
The same line
Sample Output 2:

false
 */
fun main() {
    val (firstWord, secondWord) = List(2) { readLine()!! } // pedir dos valores , uno por linea de texto
    println(firstWord == secondWord)
}