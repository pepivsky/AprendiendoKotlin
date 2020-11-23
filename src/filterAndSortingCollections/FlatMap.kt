package filterAndSortingCollections

fun main() {
    val conferences = listOf(Conference(1,"IA"), Conference(2,"Kotlin Programming"))

    val people = conferences.map { it -> it.people } //Usando map obtengo una lista de lista de personas ya que map devuelve una lista y el atributo de la clase tambien es una lista

    //flat map itera sobre cada elemento de la collecion y obtiene los datos que necesita y los guarda en una coleccion
    val people2 = conferences.flatMap { it -> it.people }
    people2.forEach { println(it.name) } //pepe blanca pepe blanca

    println("people name distinct")
    //usando distinct para devolver el conunto de elementos distintos en la coleccion, es decir si hay repeticiones estas no se muestran
    val people3 = conferences.flatMap { it -> it.people }.distinct() //usando distinct, usa el metodo equals, asi que para que funcione la clase debe ser data class
    people3.forEach { println(it.name) }


}

class Conference (val id: Int, val name: String) {
    val people = listOf(Person("pepe"), Person("Blanca"))
}

data class Person(val name: String)