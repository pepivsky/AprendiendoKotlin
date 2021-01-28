/* Programa que revisa si un char ingresado es una letra mayuscula o un digito del 1 al 9
Write a program that reads a character and checks if it is a capital letter or a digit from 1 to 9.

The program must print either true or false.

If the input character is '0', the program prints false
 Report a typo
Sample Input 1:

A
Sample Output 1:

true
 */

fun main() {
    val char = readLine()!!.first() //obteniendo el char
    println(char.isUpperCase() || char in '\u0031'..'\u0039') //revisando, el rango de esos codigos es de los numeros,'\u0030'..'\u0039' (0..9)
}