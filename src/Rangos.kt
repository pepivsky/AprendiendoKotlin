fun main() { //operadores rango
    //variable con un rango de 1 a 100
    val unoACien = 1..10
    println(unoACien.javaClass.kotlin)

    for (i in unoACien) {
        println(i)
    }

    //rangos con letras
    val aToC = 'A'..'D'
    for (letra in aToC) {
        println(letra)
    }

    //tambien se puede hacer asi
    for (letras in 'x'..'z') {
        println(letras)
    }

    //iterar de forma inversa
    println("iterando de forma inversa")
    for (letras in 'z' downTo 'w') {
        print("$letras ")
    }

}