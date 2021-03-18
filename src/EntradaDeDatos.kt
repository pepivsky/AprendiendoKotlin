/* Usando String templates para crear un string con formato de fecha
Date and time formatting
You need to write a program that prints date and time in a special format. Hours, minutes and seconds are split by a colon, and day, month and year are split by a slash. Take a look at the examples below.


Sample Input:
23 59 59
12 12 2018

Sample Output:
23:59:59 12/12/2018


Sample Input:
1 2 3
4 5 2018

Sample Output:
1:2:3 4/5/2018
 */
fun main() {
    //podemos usar readline o scanner oara ingresar datos desde la consola

    val (second, minute, hour) = readLine()!!.split(" ") //pidiendo tres variables que vienen en una misma linea, separadas por un espacio
    val (day, month, year) = readLine()!!.split(" ")

    println("$second:$minute:$hour $day/$month/$year")

}