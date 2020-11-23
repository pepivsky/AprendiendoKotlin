package recipesmaker

import recipesmaker.model.*
import kotlin.system.exitProcess

fun main() {

    //val response: Int
    //mensaje bienvenida

    val menu = """
            ***** Selecciona la opción deseada *****
            1. Hacer una receta o agregar ingredientes
            2. Ver mis recetas
            3. Salir
            
        """.trimIndent()

    /*var response: Int = readLine()?.toInt() ?: 3
    when(response) {
        1 -> makeRecipe()
        2 -> viewRecipes()
        3 -> exitProcess(0)

    }*/

    println(":::::::: Bienvenido a Recipe Maker ::::::::")
    do {
        println(menu)
        val response = readLine()?.toInt() ?: 3

        when (response) {
            1 -> makeRecipe()
            2 -> viewRecipes()
            3 -> println()
            else -> println("\"$response\" no es una opción válida, intenta nuevamente :)")
        }

    } while (response != 3)
    println("Saliendo... vuelve pronto :)")
    //println(response)
}

//funcion para hacer una receta
fun makeRecipe() {
    val ingredientes: Set<String> =
        setOf("Agua", "Leche", "Carnes", "Verduras", "Frutas", "Cereales", "Huevo", "Aceites")
    println("Haciendo receta")
    println("Selecciona por categoría el ingrediente que buscas")

    for ((index, element) in ingredientes.withIndex()) {
        println("${index + 1}. $element")
    }

    val responseMakeRecipe = readLine()?.toInt() ?: 0

    when (responseMakeRecipe) {
        0 -> exitProcess(0)
        1 -> {
            println("***Agua***")
            val cantidad = getCantidadUnidades()
            addToRecipe("Agua", cantidad)

        }
        2 -> {
            println("***Leche***")
            val cantidad = getCantidadUnidades()
            addToRecipe("Leche", cantidad)
        }
        3 -> {
            println("***Carnes***")
            //mostrar la lista de carnes
            Carnes.showCarnesList()

            //obtener ingrediente
            val ingrediente = getIngrediente(Carnes.listCarnes)

            //pedir kilogramos
            val cantidadCarne = getCantidadKG()

            //agregando al mapReceta
            addToRecipe(ingrediente, cantidadCarne)


        }
        4 -> {
            println("***Verduras***")
            //mostrar la lista de carnes
            Verduras.showVerdurasList()

            //obtener ingrediente
            val ingrediente = getIngrediente(Verduras.listVerduras)

            //pedir kilogramos
            val cantidad = getCantidadKG()

            //agregando al mapReceta
            addToRecipe(ingrediente, cantidad)
        }
        5 -> {
            println("***Frutas***")
            //mostrar la lista de carnes
            Frutas.showFrutasList()

            //obtener ingrediente
            val ingrediente = getIngrediente(Frutas.listFrutas)

            //pedir kilogramos
            val cantidad = getCantidadKG()

            //agregando al mapReceta
            addToRecipe(ingrediente, cantidad)
        }
        6 -> {
            println("***Cereales***")
            //mostrar la lista de carnes
            Cereales.showCerealesList()

            //obtener ingrediente
            val ingrediente = getIngrediente(Cereales.listCereales)

            //pedir kilogramos
            val cantidad = getCantidadKG()

            //agregando al mapReceta
            addToRecipe(ingrediente, cantidad)
        }

        7 -> {
            println("***Huevo***")
            val cantidad = getCantidadUnidades()
            addToRecipe("Huevo", cantidad)
        }

        8 -> {
            println("***Aceites***")
            //mostrar la lista de carnes
            Aceites.showAceitesList()

            //obtener ingrediente
            val ingrediente = getIngrediente(Aceites.listAceites)

            //pedir kilogramos
            val cantidad = getCantidadML()

            //agregando al mapReceta
            addToRecipe(ingrediente, cantidad)
        }
    }

}
//get input
fun getIngrediente(list: List<String>): String {
    println("Selecciona un ingrediente")
    val seleccionI = readLine()?.toInt()
    val ingrediente = list[seleccionI?.minus(1)!!]
    println("Seleccionaste $ingrediente")
    return ingrediente
}
fun getCantidadKG(): String {
    println("Ingresa la cantidad que deseas en kg(ejemplo: \"1.5\")")
    val cantidad = readLine() ?: "0"
    return cantidad + "kg"
}

fun getCantidadML(): String {
    println("Ingresa la cantidad que deseas en ml(ejemplo: \"1.5\")")
    val cantidad = readLine() ?: "0"
    return cantidad + "ml"
}

fun getCantidadUnidades(): String {
    println("Ingresa la cantidad que deseas en unidades(ejemplo: \"3\")")
    val cantidad = readLine() ?: "0"
    return cantidad
}


//funcion ver mis recetas
fun viewRecipes() {
    println("***ver mis recetas***")
    if (Receta.recetaMap.isEmpty()) {
        println("Lista vacia :(  agrega ingredientes")
    } else {
        Receta.recetaMap.forEach{ println("${it.key} = ${it.value}") }
    }
    //Receta.recetaMap.forEach{ println(it) }

}

//agregar a la receta
fun addToRecipe(ingrediente: String, cantidad: String) {
    Receta.recetaMap.put(ingrediente, cantidad)
    println("Ingrediente agregado :)")
}

class Receta {
    companion object {
        val recetaMap = mutableMapOf<String, String>()//map mutable vacio
    }
}