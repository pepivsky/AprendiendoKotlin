package classes
/*
Ejemplo de como crear una clase con un setter privado
 */
// you do not need to understand how it works, ignore it
class Pirate (name : String) {
    var name: String = name
        private set
}
// Do not touch the lines above

fun main() {
    // fix the declaration below
    var captain = Pirate("Hector Barbossa")
    println(captain.name)

    //captain.name = "Jack Sparrow"// this is impossible. setter private

    // put your code here
    captain = Pirate("Jack Sparrow")
    println(captain.name)
}

// otra solucion
// se puede hacer que la propiedad name no se pueda modificar desde afuera con una data class, ya que val no puede ser reasignado
// entonces no deja simplemente cambiar el nombre, hay que crear otro objeto
/*
// you do not need to understand how it works, ignore it
data class Pirate(val name: String)
// Do not touch the lines above

fun main() {
    // fix the declaration below
    var captain = Pirate("Hector Barbossa")
    println(captain.name)
    // put your code here
    captain = Pirate("Jack Sparrow")
    println(captain.name)
}



 */