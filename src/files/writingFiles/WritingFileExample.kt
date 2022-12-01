package files.writingFiles

import java.io.File

fun main() {
    val workingDirectory = System.getProperty ("user.dir")
    // separator
    val separator = File.separator
    val fileName = "${workingDirectory}${separator}my_new_file.txt"
    val file = File(fileName)
    file.writeText("Hello world from file")
}