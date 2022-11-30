package files

import java.io.File

fun main() {
    val fileName = "src/text.txt"
    val file = File(fileName)
    if (file.exists()) {
        println(file.readText().split(' ').count())
    }
}
