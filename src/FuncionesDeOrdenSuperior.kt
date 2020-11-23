//Las funciones de orden superior son aquelllas  que reciben otra funcion como parametro
//en Kotlin estas funciones pueden:

//*ser almacenadas en colecciones
//*pasarse como parametros de otra funcion

//funcion de orden superior que recibe otra funcion y esa funcion recibe dos enteros, se indica antes de la flecha, y despues de la flecha va el tipo de dato que regresa
fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int {
    return fn(v1, v2)
}
//funciones de una sola linea
fun sumar(x1: Int, x2: Int) = x1 + x2

fun restar(x1: Int, x2: Int) = x1 - x2

fun multiplicar(x1: Int, x2: Int) = x1 * x2

fun dividir(x1: Int, x2: Int): Int { // las otras funciones son lo mismo que esta pero simplificadas
    return x1 / x2
}


fun main(parametro: Array<String>) {

    val resu1 = operar(10, 5, ::sumar) //llamando a la funcion de orden superior y asignando el valor a una variable
    println("La suma de 10 y 5 es $resu1")

    val resu2 = operar(5, 2, ::sumar)
    println("La suma de 5 y 2 es $resu2")

    println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}") //llamando directamente a al funcion

    println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")

    println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")
}