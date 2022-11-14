// las lambdas son funciones creadas en tiempo de ejecucion


fun main() {
    // funcion predicado
    fun isNotA(c: Char): Boolean = c != 'a'
    val originalText = "I don't know... what to say..."

    // pasandole una funcion normal
    val textWithoutA = originalText.filter(::isNotA)

    // guardando la lambda en una variable y pasandola a la funcion filter
    val myLambda = { c: Char -> c != 'a' }
    val textWithoutA1 = originalText.filter(myLambda)

    // pasando una lambda
    val textWithoutA2 = originalText.filter({ c: Char -> c != 'a' })

    // omitiendo el tipo ya que kotlin lo infiere
    val textWithoutA3 = originalText.filter({ c -> c != 'a' })

    // pasando la lambda afuera de los parentesis porque es el ultimo argumento de la funcion filter
    val textWithoutA4 = originalText.filter() { c ->  c != 'a' }

    // quitando los parentesis porque si estan vacios kotlin permite eliminarlos
    val textWithoutA5 = originalText.filter { c -> c != 'a' }

    // haciendo la lambda mas concisa eliminado el nombre del argumento ya que cuando es solo uno este puede ser omitido y kotlin le asigna el nombre de it
    val textWithoutA6 = originalText.filter { it != 'a' }

    // llamando a las funciones
    println(textWithoutA)
    println(textWithoutA1)
    println(textWithoutA2)
    println(textWithoutA3)
    println(textWithoutA4)
    println(textWithoutA5)
    println(textWithoutA6)
}

