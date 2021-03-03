package smartCalculator

/*
Description
Write a program that reads two numbers in a loop and prints the sum in the standard output. If a user enters only a single number, the program should print the same number. If a user enters an empty line, the program should ignore it.

When the command /exit is entered, the program must print Bye! , and then stop.

Input/Output example
The example below shows input and the corresponding output. Your program should work in the same way.

17 9
26
-2 5
3

7
7
/exit
Bye!
 */
fun main() {
    do {
        val input = readLine()
        if (input == "/exit") {
            break
        } else if (input!!.isNotEmpty()){
            val numbers = input.split(" ").map { it.toInt() }.toIntArray()
            println(if (numbers.size == 2) numbers.sum() else numbers.first())
        }
    } while (input != "/exit")
    println("Bye!")
}
