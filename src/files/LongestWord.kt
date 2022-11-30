package files

import java.io.File

fun main() {
    val fileName = "src/words_sequence.txt"
    val file = File(fileName)
    var longest = Int.MIN_VALUE
    if (file.exists()) {
        file.forEachLine { if (it.length > longest) { longest = it.length } }
    }
    println(longest)
}