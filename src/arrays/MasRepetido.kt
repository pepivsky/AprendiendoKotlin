package arrays
/*
There is a program that reads an unbounded sequence of words from the input. It stops reading when the next word that appears in the input is stop. Print the word that occurs most frequently in the input. If some words appeared equally frequently, then print the first one. If stop is the first word then print null.

P.S. don't count stop word.

Sample Input 1:

wash
letter
next
wash
stop
Sample Output 1:

wash
 */


// programa que devuelve la palabra mas repetida de un map

fun main() {
    val words = mutableMapOf<Int, String>()
    var i = 0
    var max = 0
    var key = 0
    do {
        val word = readLine()!!
        if (word == "stop") { break }
        words[i] = word
        val count = words.count { it.value == word }
        max = if (count > max) {
            key = i
            count
        } else max
        i++
    } while (word != "stop")
    print(if (max == 1) words[0] else words[key])

}