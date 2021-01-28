fun main() {
    //obtener un char desde la entrada estandar usando readline
    val char = readLine()!!.first()
    val char2 = readLine()!!.first()

    println(char.equals(char2, true)) //comparar los chars usando equals y pasandole el parametro true para que ignore si es mayuscula o minuscula
}