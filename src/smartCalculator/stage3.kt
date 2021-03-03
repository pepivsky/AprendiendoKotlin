package smartCalculator
/*
Description
At this stage, the program should read an unlimited sequence of numbers from the standard input and calculate their sum. Also, add a /help command to print some information about the program. If you encounter an empty line, do not output anything.

Input/Output example
The example below shows input and the corresponding output. Your program should work in the same way.

4 5 -2 3
10
4 7
11
6
6
/help
The program calculates the sum of numbers
/exit
Bye!
 */
fun main() {
    do {
        val input = readLine()
        if (input!!.isNotEmpty()) {
            if (input.first() == '/') {
                when (input) {
                    "/help" -> println("The program calculates the sum of numbers")
                    "/exit" -> break
                }
            } else {
                val numbers = input.split(" ").map { it.toInt() }.toIntArray()
                println(if (numbers.size > 1) numbers.sum() else numbers.first())
            }
        }
    } while (input != "/exit")
    println("Bye!")
}