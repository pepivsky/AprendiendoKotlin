//las funciones infijas se
/*
para que una funcion pueda ser infija debe cumplir 4 condiciones
1- debe ser funcion miembro de una clase o una extension function
2- debe tener un solo parametro
3- el prametro no puede tener un valor por defecto
4 - debe tener la palabra reservada infix
 */
fun main() {
//llamando a la funcion infix
    val resultadoResta = 20 restar 2
    println(resultadoResta)

    //llamando a la funcion infija de tipo miembro de clase
    val ejemplo = Ejemplo()
    val nombre = "Jose"
    println(ejemplo saludar nombre)
}

//creando funcion infija
infix fun Int.restar(num: Int): Int = this - num //estaes una funcion de extension

class Ejemplo() {
    infix fun saludar(name: String): String {
        return "Hola $name"
    }
}