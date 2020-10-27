package main.kotlin

fun main() {

    //usando tipos primitivos
    println(1 + 1)

    //usando objetos
    val a = 2
    val b = 3

    println(a.plus(b))
    println(a.javaClass.typeName)

    for (letra in 'a'..'f') {
        println(letra)
    }

    //sentencias de control

    val number = 2

    if (number == 2) { //false
        println("son iguales")
    } else {
        println("son  diferentes")
    }

    //when switch
    when(number) {
        in 1..5 -> println("El numero esta entre 1 y 5")
        in 5..10 -> println("El numero esta entre 5 y 10")
        else -> println("No esta en ningun rango")
    }

    //bucles while y do while
    //while
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    //do while
    val isTrue = false
    do {
        println("entrando en el ciclo")
    } while (isTrue)


    var f = 1
    while (f <= 10){
        println("Contador while: $f")
        f = f.inc()
    }

}