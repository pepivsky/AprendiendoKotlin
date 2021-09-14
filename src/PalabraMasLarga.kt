
/*
The longest word
In the given string find the first longest word and output it.

Input data

Given a string in a single line. Words in the string are separated by a single space.

Output data

Output the longest word. If there are several such words, you should output the one that occurs first.


Sample Input:
one two three four five six

Sample Output:
three

 */

fun main() {
    val words = readLine()!!.split(" ")
    var longest = ""
    var max = 0
    var length: Int

    for (word in words) {
        length = word.length
        if (length > max) { // si es mas grande entonces es el nuevo max
            max = length
            longest = word
        }
    }
    println(longest)
}
// ***** otra solucion *****
/*
 val words = readLine()!!.split(" ")
 println(words.maxByOrNull { it.length }) // devuelve el primer elemento con el valor mas grande
 */
