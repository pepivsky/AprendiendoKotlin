package model
//open para permite que esta clase pueda ser heredada
//las clases y metodo estan cerrados por defecto
abstract class Product(var name: String, var description: String, var sku: Int) {
//no se puede creaar una instancia de una clase abstracta
    override fun toString(): String {
        return "Name: $name \nDescription: $description \nSKU: $sku"
    }

    /*open fun create(): String { //los metodos tambien deben ser open para poder sobreescribiros
        return "Create"
    }*/

    //convirietiendo a metodos abstractos
    abstract fun create(): String //metodo abstracto sin implementacion

    abstract fun read(): String

    abstract fun update(): String

    abstract fun delete(): String


}