@file:JvmName("ClaseKotlinFun") //notacion que modifica el nombre de la clase que se usa desde Java
package interoperabilidad


fun displayGreeting(message: String) {
    println("$message kotlin")
}

@JvmOverloads //notacion que permite el uso de parametros por defecto generando sobrecarga para Java
fun display(message: String, num: Int = 1) { //funcion con parametro por defecto
    println("$message $num")
}