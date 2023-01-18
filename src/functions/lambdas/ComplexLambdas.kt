package functions.lambdas
/*
usando filter para filtrar un string y pasandole una lambda como argumento
elimina todos los numeros menores a 5
 */
fun main() {

    val originalText = "I don't know... what to say...4"

    val textWithoutSmallDigits = originalText.filter {// lambda con mas de una linea de codigo
        val isNotDigit = !it.isDigit()
        val stringRepresentation = it.toString()

        isNotDigit || stringRepresentation.toInt() >= 5 // la ultima linea es tratada como el valor de retorno
    }

    // lambda con un valor de retorno pronto
    // se usa la qualified return syntax
    val textWithoutSmallDigits2 = originalText.filter {
        if (!it.isDigit()) {
            return@filter true
        }

        it.toString().toInt() >= 5
    }

    println(textWithoutSmallDigits)
    println(textWithoutSmallDigits2)




}