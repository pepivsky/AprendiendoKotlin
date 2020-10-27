fun main() {
    println("Hello Kotlin!")
    var a = 2
    var b = 3

    println(a.plus(b))
    val nombre = "pepe"
    println("tu nombre es $nombre")

    //raw String
    val textoLargo = """
       ** Hola
       ** Pepe
       ** Jose
    """.trimMargin()

    println(textoLargo)
    println(textoLargo.trimMargin("** ")) //trim margin le quita los asteriscos

    //escapar en las cadenas
    //\t : Tabula
    //\b : Retrocede el cursor de texto 1 carácter
    //\n : Crea un salto de linea
    //\r : Mueve el cursor de texto al inicio de la linea en la que está
    //\’, ", \ y $ : Te permite usar los caracteres que hay luego del \ dentro de las comillas sin conflictos


}