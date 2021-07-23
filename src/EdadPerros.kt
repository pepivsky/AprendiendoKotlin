import kotlin.math.ln




fun main() {
    // ingresa la edad del perro
    val edad = readLine()!!.toDouble()
    val edadPerro = (ln(edad) * 16 + 31).toInt()
    println("edad de perro es = $edadPerro anios")
}