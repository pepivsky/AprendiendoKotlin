package recipesmaker

import kotlin.system.exitProcess

fun main() {

    //val response: Int
    //mensaje bienvenida

    val menu = """
            :: Bienvenido a Recipe Maker ::
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
            
        """.trimIndent()

    /*var response: Int = readLine()?.toInt() ?: 3
    when(response) {
        1 -> makeRecipe()
        2 -> viewRecipes()
        3 -> exitProcess(0)

    }*/

    do {
        println(menu)
        val response = readLine()?.toInt() ?: 3

        when (response) {
            1 -> makeRecipe()
            2 -> println("Viendo mis recetas")
            3 -> exitProcess(0)
            //!in 1..3 -> println("\"$response\" no es una opción válida, vuelve a intentarlo\n")
            //else -> println("\"$response\" no es una opción válida, intenta nuevamente :)")
        }

    } while (response != 3)
    println("Saliendo... vuelve pronto :)")
    //println(response)
}

//funcion para hacer una receta
fun makeRecipe() {
    val ingredientes: Set<String> = setOf("Agua", "Leche", "carne", "Verduras", "Fruta", "Cereal", "Huevos", "Aceite")
    println("Haciendo receta")
    println("Selecciona por categoría el ingrediente que buscas")

    for ((index, element) in ingredientes.withIndex()) {
        println("${index + 1}. $element")
    }

    val responseMakeRecipe = readLine()?.toInt() ?: 0

    when(responseMakeRecipe) {
        0 -> exitProcess(0)
    }

}
//funcion ver mis recetas
fun viewRecipes() {
    println("ver mis recetas")
}