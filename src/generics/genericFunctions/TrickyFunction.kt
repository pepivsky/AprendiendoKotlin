package generics.genericFunctions
// Esta funcion da error porque el compilador no sabe que tipo es T y cual deberia ser el resultado
/*
fun <T> calculateLength(a: T, b: T): Int {
    return a + b
}

fun main() {
    println(calculateLength(1, 2))
}
 */

// si queremos que funcione con enteros se puede hacer lo siguiente, pero harian falta mas validaciones para soportar otros tipos como String
fun <T> calculateLength(a: T, b: T): Int {
    println(a is Int)
    return a.toString().toInt() + b.toString().toInt()
}

fun main() {
    println(calculateLength(1, 2))
}