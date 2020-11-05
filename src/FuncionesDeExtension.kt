//las funciones de extension nos ayudan a extender la funcionalidad de una clase sin necesidad de accedera su codigo
fun main() {
    //llamando a la funcion de extension
    println("Hola a todo el mundo que programa en Kotlin :)".quitarEspaciosEnBlanco())
    println("Hola a todo el mundo que programa en Kotlin :)")
    //llamando a otra funcion de extension
    var resultado = 5.sumar(2)
    println(resultado)

}

//declarando una extension fucntion
//funciona como si la fcuncion estuviera incluida en la clase String
fun String.quitarEspaciosEnBlanco(): String { //funcion extension de la clase String
    var regex = Regex("\\s+") //expresion regular
    return regex.replace(this,"") //this es el receptor(es el texto al que se le pasa la funcion)
}

//otra funcion de extension
fun Int.sumar(num: Int): Int = this + num