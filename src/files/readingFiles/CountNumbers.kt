package files

import java.io.File
import java.lang.NumberFormatException
// Download it and write a Kotlin program that counts only numbers in this file.
fun main() {
    val fileName = "src/words_with_numbers.txt"
    val file = File(fileName)
    var numbers = 0
    if (file.exists()) {
        file.forEachLine {
            try {
                // if can convert to int then is a number and sum one to numbers variable
                it.toInt()
                numbers++
            } catch (e: NumberFormatException) {
                //do nothing
            }
            //println(it)
        }
    }

    println(numbers)
}