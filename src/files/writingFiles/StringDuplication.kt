package files.writingFiles

import java.io.File

fun main() {
    val fileName = "src/files/writingFiles/duplication_file.txt"
    val file = File(fileName)
    println("enter text to duplicate")
    val textToWrite = readln().repeat(2)

    file.writeText(textToWrite)
}