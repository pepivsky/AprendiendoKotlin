/*
You need to write a program that prints date and time in a special format. Hours, minutes and seconds are split by a colon, and day, month and year are split by a slash. Take a look at the examples below.

Report a typo
Sample Input 1:

23 59 59
12 12 2018
Sample Output 1:

23:59:59 12/12/2018
Sample Input 2:

1 2 3
4 5 2018
Sample Output 2:

1:2:3 4/5/2018
 */


fun main() {
    val (second, minute, hour) = readLine()!!.split(" ") // asignar tres variables desde una linea, separados por un espacio
    val (day, month, year) = readLine()!!.split(" ")

    println("$second:$minute:$hour $day/$month/$year")
}