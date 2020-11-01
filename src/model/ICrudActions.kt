package model

//interface para  reutiliozar los comportamientos comunes de product
interface ICrudActions {

    //estos son metodos abstractos, en una interface no es necesario agregar la palabra abstract
    fun create(): String //metodo abstracto sin implementacion

    fun read(): String

    fun update(): String

    fun delete(): String

    fun saludar(mensaje: String) {
        println("Este es tu mensaje: $mensaje ")
    }
}