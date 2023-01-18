package lists
/*
You are given a MutableList of strings and an Integer in the input. Remove an element at the index of the specified integer.

Sample Input 1:

a b c d
2
Sample Output 1:

a b d
 */

fun solution(elements: MutableList<String>, index: Int): MutableList<String> {
    // put your code here
    elements.removeAt(index)
    return elements
}

fun main() {
    val list = mutableListOf("a","b","c")
    val newList = solution(list,0)
    println(newList)
}