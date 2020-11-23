package recipesmaker.model

object Frutas {
    val listFrutas = listOf("Fresa", "Platano", "Uvas", "Manzana", "Naranja", "Pera", "Cereza")
    fun showFrutasList() {
        listFrutas.forEachIndexed { index, item -> println("${index + 1}.$item") }
    }
}

object Cereales {
    val listCereales = listOf("Avena", "Trigo", "Arroz", "Maiz")

    fun showCerealesList() {
        listCereales.forEachIndexed { index, item -> println("${index + 1}.$item") }
    }
}

object Verduras {
    val listVerduras = listOf("Lechuga", "Tomate", "Chile")

    fun showVerdurasList() {
        listVerduras.forEachIndexed { index, item -> println("${index + 1}.$item") }
    }
}

object Aceites {
    val listAceites = listOf("Oliva", "Girsaol", "Palma")

    fun showAceitesList() {
        listAceites.forEachIndexed { index, item -> println("${index + 1}.$item") }
    }
}

object Carnes {
    val listCarnes = listOf("Pollo", "Cerdo", "Res")

    //mostrar lista carnes
    fun showCarnesList() {
        listCarnes.forEachIndexed { index, item -> println("${index + 1}.$item") }
    }
}