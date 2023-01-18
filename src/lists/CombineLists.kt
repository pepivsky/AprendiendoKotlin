package lists

/* programa que combina dos listas en una lista mutable
Add them all
You are given two lists of integers. Combine these lists and return the result.

Sample Input:
0 1 2 3
4 5 6

Sample Output:
0 1 2 3 4 5 6
 */
fun solution(first: List<Int>, second: List<Int>): MutableList<Int> = (first + second).toMutableList()

fun main() {
    val first = listOf(1,2,3)
    val second = listOf(4,5,6)

    println(solution(first, second))
}