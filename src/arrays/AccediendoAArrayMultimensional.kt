package arrays
/*
Corners
You already have a 2D array inputArray. Print all of its corners in the following order: left to right and top to bottom.

Print the result for two elements in the line. Use a single space to separate two elements on the same line.

Take a look at the examples below, and remember that nested arrays can be of different lengths!

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
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }

    println("${inputArray[0].first()} ${inputArray[0].last()}")
    println("${inputArray.last().first()} ${inputArray.last().last()}")
}