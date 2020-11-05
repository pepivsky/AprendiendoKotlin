package recipesmaker

fun main() {

    var response: Int

    //mensaje bienvenida
    println(":: Bienvenido a Recipe Maker ::")

    do {
        println("""
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
            
        """.trimIndent())

        response = readLine()?.toInt() ?: 3

        when (response) {
            1 -> println("Haciendo receta")
            2 -> println("Viendo mis recetas")
        }

    } while (response != 3)

    println(response)




}