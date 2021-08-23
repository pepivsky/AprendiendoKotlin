/* ejercicio para encontrar la cantidad de triples en un arreglo
Triples
Write a program that reads an array of integers and outputs the number of triples in the array.

A triple is three consecutive integers in ascending order — 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not.

The first line contains the size of the array.
The rest of the lines contain elements of the array.

Output a single integer value that is the number of triples in the array.

In the example below, there are two triples: 4,5,6 and 5,6,7.


Sample Input:
6
1
2
4
5
6
7

Sample Output:
2
 */


fun main() {
    val array = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() } // declarando y llenando un array con una lambda
    var counterTriples = 0

    for (index in 1 until array.size - 1) {
        if (array[index - 1] == array[index] - 1 && array[index + 1] == array[index] + 1) { // si el elemento anterior al actual es igual al actual menos 1 y el siguiente es igual al actual mas 1 entonces es un triple
            counterTriples++
        }
    }
    println(counterTriples)
}