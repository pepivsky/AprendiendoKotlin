package generics.genericFunctions

class ListUtils {
    companion object Info {

        // define info method here
        fun <T> info(list: List<T>) = list.toString()

        /* otra solucion
        fun <T> info(list: List<T>): String {
            return list.toString()
        }
         */
    }
}

fun main() {
    val list = listOf(1,2,3,4,5)
    println(ListUtils.info(list))
}