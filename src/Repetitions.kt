/*
The sequence 1 2 2 3 3 3 ...
Write a program that prints a part of the following sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number of repetitions is equal to the respective number). Input is a positive integer n – the number of the elements of the sequence that the program should print. Output the sequence of numbers, written in a single line, separated by spaces.

For example, if n is 7, the program should output 1 2 2 3 3 3 4 (seven numbers).


Sample Input:
7

Sample Output:
1 2 2 3 3 3 4
 */


fun main() {
    val repetitions = readLine()!!.toInt()
    var count = 0

    for (i in 1..repetitions) {
        repeat(i) {
            if (count == repetitions) { return@repeat }
            print("$i ")
            count++
        }
    }
}