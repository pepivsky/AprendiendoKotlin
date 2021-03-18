

fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()

    //if como expresion
    println(if (h in a..b) { //if puede ser evaluado dentro de  una funcion ya que en Kotlin es una expresion
        "Normal"
    } else if (h < a) {
        "Deficiency"
    } else {
        "Excess"
    })

    //usando if como expresion sencilla, si se coloca mas de una sentencia es necesario usar llaves
    val r = if (a > b) "A es mayor que b" else "b es mayor" //cuando se usa asi debe tener un else

}