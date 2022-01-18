/*
Programa que devuelve un boolean dependiendo del valor ingresado
Lie detector
Let's write a lie detector program! The program should take a string as an input, convert it to a boolean value, and return it as the result.

Input: String.

Output: Boolean value.


Sample Input:
0

Sample Output:
false


Sample Input:
tRUe

Sample Output:
true


 */
fun main() = println(readLine().toBoolean()) // to bolean devuelve true si se le pasa "1" o "true" y false con "0" y "false", la funcion es ignore case