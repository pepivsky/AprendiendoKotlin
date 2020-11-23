//la funcion apply recibe un objeto y retorna el mismo
// por eso es util para para modificar los objetos
data class Circle (var radius: Int, var color: String)

fun main() {
    //instancia de la clase Circle
    val circle = Circle(2, "red").also(::println) //also es una funcion de orden superior que reibe otra funcion

    //modificando sus propiedades
    circle.radius = 3
    circle.color = "blue"

    println(circle)

    //modificando el objeto usando apply
    circle.apply {
        radius = 2
        color = "green"
    }.also (::println)

    /*********Usando with**********/

    with(circle) {
        radius = 10
        color = "black"
    }
    println(circle)
}

