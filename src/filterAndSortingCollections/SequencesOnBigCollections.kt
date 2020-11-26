package filterAndSortingCollections
/*
asSequence, usando secuencias, las secuencias son mas eficientes que las listas, es mejor usar secuencia cuando tenemos muchos elementos que recorrer, especialmente para filtrar
las secuencias solos eejecutan al ser utilizadas, en cambio al aplicar filter y map sin ser secuencia se ejecuta siempre
 */
fun main() {
    val humans = listOf(Human(1,"Roberta"), Human(2,"Fatima"))

    val names = humans //no estamos usando esta lista pero igualemnte se ejecutan las opereaciones
        .filter { println("filter $it"); it.name.endsWith("a") } // se ejecuta un  filter y un map pr cada objeto (4 veces)
        .map { println("map $it"); it.name }

    println("usando una secuencia") //es mas eficiente
    val names2 = humans //usando asSequence no sucede nada hasta que names2 sea llamada
        .asSequence()
        .filter { println("filter $it"); it.name.endsWith("a") } // se ejecuta un  filter y un map pr cada objeto (4 veces)
        .map { println("map $it"); it.name }

    for (name in names2) println(name)

}

class Human(val id: Int, val name: String)