//funcion de orden superior que recibe otra funcion
fun calculadora(a: Int, b: Int, c: Int, funcion: (Int, Int, Int) -> Int): Int {
    return funcion(a, b, c) //pasando los parametros a la funcion
}
//funciones de una sola linea
fun sumar(a: Int, b: Int, c: Int) = a + b + c

fun restar(a: Int, b: Int, c: Int) = a - b - c

fun multplicar(a: Int, b: Int, c: Int) = a * b * c


fun main() {
    //llamando a la funcion superior y pasandole otra funcion
    println("la suma es: ${calculadora(2, 3, 4, ::sumar)}")
    println("la resta es: ${calculadora(2, 4, 5, ::restar)}")
    println("la multiplicacion es: ${calculadora(2, 2, 2, ::multplicar)}")


}