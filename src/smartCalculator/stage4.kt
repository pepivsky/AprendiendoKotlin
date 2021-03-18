package smartCalculator
/*
Stage 4/8: Add subtractions
Description
At this stage, your calculator should support the addition + and subtraction - operators.

The program must calculate expressions like these: 4 + 6 - 8, 2 - 3 - 4, and so on. It must support both unary and binary minus operators. If the user has entered several same operators following each other, the program still should work (like Java or Python REPL).

Consider that the even number of minuses gives a plus, and the odd number of minuses gives a minus! Look at it this way: 2 -- 2 equals 2 - (-2) equals 2 + 2.

Modify the result of the /help command to explain these operations.

Decompose your program using methods to make it easy to understand and edit later.

Input/Output example
8
8

-2 + 4 - 5 + 6
3
9 +++ 10 -- 8
27
3 --- 5
-2
14  -   12
2
/exit
Bye!
 */
fun main() {
    do {
        val input = readLine()
        var result = 0
        if (input!!.isNotEmpty()) {
            if (input.first() == '/') {
                when (input) {
                    "/help" -> println("The program calculates the sum of numbers")
                    "/exit" -> break
                }
            } else {
                val numbers = input.split(" ").filter { it != "" }

                result += numbers.first().trim().toInt()
                for (i in numbers.indices) {
                    when {
                        numbers[i].matches(Regex("\\++|^--(--)*\$")) -> { //suma la regex hace match si la longitud de los signos "-" es par, es decir es suma
                            result += numbers[i + 1].toInt()
                        }
                        numbers[i].matches(Regex("^-(--)*\$")) -> { //resta //si la longitud de los signos "-" es impar entonces es resta
                            result -= numbers[i + 1].toInt()
                        }
                    }
                }
                println(result)
            }
        }
    } while (input != "/exit")
    println("Bye!")
}