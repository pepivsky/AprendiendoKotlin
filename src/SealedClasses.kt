/*
Las clases selladas (sealed class) en Kotlin son aquellas empleadas para construir una herencia cerrada
 en la que el compilador conoce cuáles son las únicas clases hijas, ya que no puede haber otras.

 ventajas
 La más importante es que cada subclase puede tener sus propios valores y sus propios métodos, a diferencia de los enumerados, cuyos elementos siguen todos la misma estructura.

Además, los enumerados solamente pueden tener una instancia, mientras que las subclases de clases selladas pueden tener varias instancias, cada una con su estado,
 o una si la definimos como object.
 */
fun main() {
    //val personEvent = PersonEvent() //una clase sellada no puede ser instanciada
    val event = PersonEvent.Awake()
    event.handlePersonEvent(event) //imprime Awake


}

sealed class PersonEvent() {
    //clases que solo pueden heredar de PersonEvent (se deben especificar dentro de la superclase)
    class Awake(): PersonEvent()
    class Asleep(): PersonEvent()
    class Eating(val food: String): PersonEvent()

    //metodo que maneja un PersonEvent
    fun handlePersonEvent(event: PersonEvent) {
        when(event) {
            is Awake -> println("Awake")
            is PersonEvent.Asleep -> println("Asleep") //tambien se puede llamar con la sintaxis punto
            is Eating -> println(event.food)
        }
    }
}