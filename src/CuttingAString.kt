/* Programa que corta un string a la mitad usando substring
Write a program that reads a string,
 and then outputs the string without its
 middle character when the length is odd,
 and without the middle 2 characters when the length is even

 */
const val CONSTANTE = "Algo"
fun main() {
    val word = readLine()!!
    if (word.length % 2 == 0) { //par
        val start = word.substring(0, word.length / 2 - 1)
        val end = word.substring(word.length / 2 + 1)
        println("$start$end")
    } else { //impar
        val start = word.substring(0, word.length / 2)
        val end = word.substring(word.length / 2 + 1)
        println("$start$end")
    }
}