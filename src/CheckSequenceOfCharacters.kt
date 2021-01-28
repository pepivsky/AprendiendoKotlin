/* Programa que revisa si tres caracteres ingresados son consecutivos (en el orden del alfabeto)
Sequence
Write a program that reads three characters and checks if they are ordered according to the Unicode table, and if each next character immediately follows the previous one (i.e. 'a', 'b', 'c' or 'x', 'y', 'z') according to the alphabet.

The program must print either true or false.


Sample Input:
a
b
c

Sample Output:
true


Sample Input:
c
b
a

Sample Output:
false


Sample Input:
a
b
d

Sample Output:
false


Sample Input:
x
y
z

Sample Output:
true
 */
fun main() {
    val char1 = readLine()!!.first()
    val char2 = readLine()!!.first()
    val char3 = readLine()!!.first()

    println(char1 + 1 == char2 && char2 + 1 == char3) //al sumarle uno a un caracter se obtiene el siguiente (en el orden del alfabeto)
}