package files

import java.io.File
/*
Download it and write a Kotlin program that counts the number of words in this file.
 */
fun main() {
    val fileName = "src/text.txt"
    val file = File(fileName)
    if (file.exists()) {
        // split by space and count elements and print
        println(file.readText().split(' ').count())
    }
}
