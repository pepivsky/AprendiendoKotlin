/*
Celsius to Fahrenheit
Write a program that reads a temperature in Celsius (°C) and shows its equivalent in Fahrenheit temperature (°F).

Use this formula:

fahrenheit = celsius * 1.8 + 32

Sample Input:
32.9

Sample Output:
91.22


Sample Input:
0

Sample Output:
32.0


 */

fun main() {
    val celsius = readLine()!!.toDouble()
    println(celsius * 1.8 + 32) // formula que convierte a farenheit
}