import kotlin.math.sqrt

fun main() {
    val a = 4.0
    //llamando una funcion de kotlin
    println(sqrt(a))

    val numbers = intArrayOf(1, 2, 3, 5, 6)
    println("El promedio de los numeros es: ${promedioNumbers(numbers)}")
    println(evaluar(num = 2))

    //********************** funciones lambda ****************
    fun random(): Int {
        return (Math.random() * 100).toInt()
    }

    val random1 = random()
    val random2 = { random() } //funcion lambda, la funcion se almacena en la variable random2

    println(random1) //98
    println(random2) //() -> kotlin.Int
    //El primer resultado en el número aleatorio el segundo es una función que no está ejecutada aún. Para ejecutarla habría que hacer:

    println(random2())

    //Funcion lambda
    var saludo = { println("Hola mundo") }
    saludo()
    //otra lambda
    var suma = { a: Int, b: Int -> a + b } //de lado izquierdo van los parametros y de lado derecho las instrucciones
    var resultadoSuma = suma(2, 3)
    println(resultadoSuma)

    //imprimiendo directamente usando la variable que contiene la funcion
    println(suma(5, 5))
    //imprimiendo directamente usando una lambda
    println({ a: Int, b: Int -> a + b }(1, 1))
    println({ x: Int, y: Int -> x * y }(3, 2))

    //otra ejemplo
    val calcularNumber = { n: Int ->
        when (n) {
            in 1..3 -> println("EL numero esta entre 1 y 3")
            in 4..7 -> println("El numero esta entre 4 y 10")
            in 8..10 -> println("El numero esta entre 8 y 10")
        }
    }

    //println(calcularNumber(5))
    calcularNumber(5)//llamando a la lambda


}

//funcion que retorna algo
fun promedioNumbers(numbers: IntArray): Int {
    return numbers.sum() / numbers.size
}

//funcion con parametros por defecto
fun evaluar(
    caracter: Char = '=',
    num: Int = 2
): String { //si no se especifica un parametro, este tomara el valor por defecto
    return "$num es $caracter"
}

//una funcion lambda se puede

