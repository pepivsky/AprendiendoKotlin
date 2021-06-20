package arrays

/* Programa que revisa si un array contiene dos numeros dados
Write a program that reads an unsorted array of integers and two numbers: P and M. The program needs to check whether P and M occur in the array.

The first line contains the size of an array.
The next N lines contain elements of the array.
The last line contains two integer numbers P and M, separated by one space character.

If both numbers occur in the array you need to print YES, otherwise NO.


Sample Input:
3
1
3
2
2 3

Sample Output:
YES


Sample Input:
3
1
2
3
3 4

Sample Output:
NO


 */

fun main(args: Array<String>) {
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    var containsP = false
    var containsM = false

    for (i in numbers.indices) {
        numbers[i] = readLine()!!.toInt()
    }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }
    numbers.forEach { number ->
        if (number == p) {
            containsP = true
        }
        if (number == m) {
            containsM = true
        }
    }
    println(if (containsM && containsP) "YES" else "NO")
}

// otra solucion
/*fun main() {
    val arr = Array(readLine()!!.toInt()) { readLine()!!.toInt() } // llenando un arreglo, el primer readline es el tamano y el segundo va llenando el array
    val nums = readLine()!!.split(' ').map { it.toInt() } // llena otro array desde una cadena de texto, separa los elementos por un espacio y con el map los transforma a int
    print(if (nums[0] in arr && nums[1] in arr) "YES" else "NO")
}*/
