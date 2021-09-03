/*
A simple calculator
Write a simple calculator that reads three values from the line: the first number, the operator and the second number.

The program should apply the operation to the numbers and output the result. Note that the numbers are long.

The calculator must support:

addition: +
subtraction: -
integer division: /
multiplication: *
If a user performs the division and the second number is 0, output Division by 0!

If the input operator is not in the list, output Unknown operator.


Sample Input:
10000000000 + 20000000000

Sample Output:
30000000000


Sample Input:
3000 / 0

Sample Output:
Division by 0!


Sample Input:
10000 ! 300

Sample Output:
Unknown operator

 */

fun main() {
    val (firstNumS, operator, secondNumS) = readLine()!!.split(" ") // leyendo desde una unica linea de texto
    val firstNum = firstNumS.toLong()
    val secondNum = secondNumS.toLong()
    println(
        when (operator) {
            "+" -> firstNum + secondNum
            "-" -> firstNum - secondNum
            "*" -> firstNum * secondNum
            "/" -> if (secondNum == 0L) "Division by 0!" else firstNum / secondNum
            else -> "Unknown operator"
        }
    )
}