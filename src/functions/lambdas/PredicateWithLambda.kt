package functions.lambdas

/*
usando una lambda como predicado (un predicado es una funcion)
 */

fun main() {

    fun isNotDot(c: Char): Boolean = c != '.' // funcion predicado

    val originalText = "I don't know... what to say..."

    val textWithoutDots = originalText.filter(::isNotDot) // pasando la referencia de la funcion
    val withLambda = originalText.filter({c: Char -> c != '.'}) // pasando la lambda

    // lambda simplificada, esto es permitido cuando la lambda es pasada como el ultimo argumento
    val simpleVersion = originalText.filter { c: Char -> c != '.' }

    // cuando la lambda tiene un solo parametro, este se puede omitir y estara disponible como it
    val finalVersion = originalText.filter { it != '.' }


    println(textWithoutDots)
    println(withLambda)
    println(simpleVersion)
    println(finalVersion)


}