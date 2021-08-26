/* ejemplousando labels y resolviendo un problema
Write a program that reads a word and prints the number of characters that appear in it only once.


Sample Input:
abracadabra

Sample Output:
2
 */
fun main() {
    val word = readLine()!!
    val appearOnce = mutableListOf<Char>()
    var counter = 0

    loop@ for (i in word) { // label que marca el ciclo
        for (j in word) {
            if (j == i) {
                counter++

            }
            if (counter > 1) {
                counter = 0
                continue@loop // label que hace un continue al ciclo marcado
            }
        }
        if (counter == 1) {
            appearOnce.add(i)
            counter = 0
        }
    }
    println(appearOnce.size)
}