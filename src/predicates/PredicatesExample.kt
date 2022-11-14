package predicates

fun main(args: Array<String>) {
    // ejemplo de uso de un predicado,
    // un predicado es una funcion que toma un arguemnto y regresa un boolean
    fun isNotDot(c: Char): Boolean = c != '.'

    // usando el predicado en la funcion filter que recibe un predicado
    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter(::isNotDot)
    println(textWithoutDots)

}