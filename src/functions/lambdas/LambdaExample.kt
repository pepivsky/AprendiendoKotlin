package functions.lambdas
/*
Ejemplo de creacion y uso de funciones lambda
estas funciones casi siempre son usadas para crear una funcion en tiempo de ejecucion
 */
fun main() {

    // guradando una funcion anonima en una variable
    val mul1 = fun(a: Int, b: Int): Int { // fun(arguments): ReturnType { body }
        return a * b
    }

    // funcion lambda guardada en una variable
    val mul2 = { a: Int, b: Int -> a * b } //  { arguments -> body }

    // llamando la funcion anonima
    println(mul1(2,3))

    // llamando a la funcion lambda
    println(mul2(2,3))

}