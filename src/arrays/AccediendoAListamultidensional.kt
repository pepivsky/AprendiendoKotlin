package arrays
/* Programa que imprime las esquinas de una lista multidimensional
Corners
Imagine you have a 2D list inputList. Print all of its corner elements in the following order: left to right and top to bottom.

Print the result for two elements in one line. Use a single space to separate two elements on the same line.

Take a look at the examples below and remember that nested lists can be of different lengths!

Hint

Sample Input 1:

1 0 1
0 0 0
1 0 1
Sample Output 1:

1 1
1 1
Sample Input 2:

V c c V
c c c c
c c c c
V c c V
Sample Output 2:

V V
V V

 */
fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    println("${inputList.first()[0]} ${inputList.first().last()}") // accede a la primera lista y a su primer elemento, accedea a la priera lista y a su ultimo elmento
    println("${inputList.last()[0]} ${inputList.last().last()}")

}