fun main() {
    //Em kotlin todas las cosas pueden ser una expresion

    // Expresiones y valores
    var x = 5
    //poniendo una expresion en el print
    println("X es igual a 5? ${x==5}") //true ()

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x") //reemplazando una cadena por otra con un metodo
}