

fun main() {

    //Por defecto Kotlin no permite que las excepciones se lancen
    //por defecto no se puede igualar una variable con nulll

    //para permitir un valor nulo se usa ?
    var noNulo: String?
    noNulo = null
    var longitud = noNulo?.length
    println(longitud) //imprime nulo y no lanza la exepcion

    //operdor double bang !!
    //permite que se lance la exepcion que va a ocurrir y permite cacharla con try catch
    //println(longitud!!) //fuerza a que la expecion salga

    try { //se coloca en try catch para que el programa no se detenga
        println(longitud!!)
    }catch (e: NullPointerException) {
        println("No se permiten valores nulos")
    }

    //*********************
    //operador elvis ?: permite evaluar  una variable, si es null devuelve lo que le incdiquemos
    println(longitud ?: 0) //si el valor es nulo entonces devuelve 0

    //ejemplo
    var teclado: String? = null
    var longitudTeclado: Int = teclado?.length ?: 0 //si es nulo le asigna 0
    println("longitud teclado = $longitudTeclado")

    //manera tradicional son usar elvis
    if (noNulo != null) {
        println(noNulo.length)
    } else {
        println(0)
    }



    var a = true
    var b = "b"
    var c = "c"
    var v = if (a) b else c
    println(v)

    val listWithNulls: List<Int?> = listOf(1, null, null, 4) //lista con nuos
    println("Lista con nulos: $listWithNulls") /*Imprimimos la lista que contiene valores nulos*/

    //filtrando los datos y guaardando lo que no sea nulo en la lista nueva
    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println("Lista sin nulos: $listWithoutNulls") /*Imprimimos la lista filtrada*/

    //llamada segura sin tener que cambiar una funcion
    class Reunion {

    }
    val reunion: Reunion? = null
    fun pay(reunion: Reunion) {
        println("Reunion $reunion")
    }
    reunion?.let {  //agregando el "?" y la funcion let se comprueba si reunion es diferente de null se llama a la funcion pay, de lo contrario no se llama nada, podemos usar let cuando queremos evitar cambiar la firma de la funcion
        pay(reunion)
    }

}