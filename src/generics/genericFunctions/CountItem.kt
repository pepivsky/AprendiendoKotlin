package generics.genericFunctions

/*
Define a generic function countItem() that counts how many times the argument item passed to the function occurs in List. Below you can see the parameter names and types the function accepts and its result type. You do not need to output anything.

Input:

list: List<T>, item: T

Output:

Int
 */


fun <T> countItem(list: List<T>, item: T): Int {
    var times = 0
    list.forEach {
        if (it == item) { times++ }
    }
    return times
}

// otra solucion
fun <T> countItem2(list: List<T>, item: T) = list.count { it == item }


fun main() {
    val list = listOf("a","b","c","c")
    println(countItem(list, "c"))
    println(countItem2(list, "c"))

}