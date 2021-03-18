/* Programa que las letras que no estan palabra dada
Beyond the word
Write a program that reads a word and prints all the letters that aren't present in this word.

Only lowercase letters are counted.


Sample Input:
hello

Sample Output:
abcdfgijkmnpqrstuvwxyz


Sample Input:
kotlin

Sample Output:
abcdefghjmpqrsuvwxyz
 */
fun main(args: Array<String>) {
    val word = readLine()

    for (letter in 'a'..'z') {
        if (word!!.contains(letter)) { //revisa si la paalabra contiene la letra actual, si es asi omite la iteracion, sino la imprime
            continue
        } else {
            print(letter)
        }
    }
}