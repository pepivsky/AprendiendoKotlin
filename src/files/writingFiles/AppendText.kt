package files.writingFiles

import java.io.File

fun main() {
    // file path
    val fileName = "my_new_file.txt"
    // write in new line
    File(fileName).appendText("\n text added")
}