import kotlin.math.abs

fun main() {
    val (x1, y1) = readLine()!!.split(" ")
    val (x2, y2) = readLine()!!.split(" ")

    println(if (x1 == x2 || y1 == y2) { //si estan en la misma linea vertical o horizontal
        "YES"
    } else if (abs(x2.toInt() - x1.toInt()) == abs(y1.toInt() - y2.toInt())) { //si se golpean en diagonal
        "YES"
    } else {
        "NO"
    })
}