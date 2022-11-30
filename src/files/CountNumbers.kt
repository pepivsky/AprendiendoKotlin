package files

import java.io.File
import java.lang.NumberFormatException

fun main() {
    val fileName = "src/words_with_numbers.txt"
    val file = File(fileName)
    var numbers = 0
    if (file.exists()) {
        file.forEachLine {
            try {
                it.toInt()
                numbers++
            } catch (e: NumberFormatException) {
                //numbers--
            }
            //println(it)
        }
    }

    println(numbers)
}