package defalutArguments
/*
magine you have three functions that calculate the value of a polynomial of varying degrees.

fun polynom(x: Int, c: Int) = c
fun polynom(x: Int, c: Int, b: Int) = b * x + c
fun polynom(x: Int, c: Int, b: Int, a: Int) = a * x * x + b * x + c
Create a function called polynomial that can replace all these functions.
 */
fun main() {
    // respuesta
    fun polynomial(x: Int = 0, c: Int = 0, b: Int = 0, a: Int = 0) = a * x * x + b * x + c
    // aqui se puede llamar a la funcion omitiendo los argurmentos que ya tienen un valor por defecto
}