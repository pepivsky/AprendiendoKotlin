/*
Write a program that reads two numbers and prints their sum. The examples below demonstrate what the result should look like.

Input: two numbers of the Int type;

Output: a single string. Use the following template:

n1 + n2 = sum, where n1 and n2 are the input numbers, and sum is their sum.
 */

fun main() {
    val (num1, num2) = List(2) { readLine()!! }.map { it.toInt() } // establece el valor de las dos variables desde el scanner y despues cad una la transforma a entero
    println("$num1 plus $num2 equals ${num1 + num2}")
}