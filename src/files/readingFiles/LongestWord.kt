package files

import java.io.File
// Download it and write a Kotlin program that finds the longest word in this file.
fun main() {
    val fileName = "src/words_sequence.txt"
    val file = File(fileName)
    var longest = Int.MIN_VALUE
    if (file.exists()) {
        // compare wiht previous longest, if is longer the is new longest value
        file.forEachLine { if (it.length > longest) { longest = it.length } }
    }
    println(longest)
}