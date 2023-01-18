package functions.lambdas
/*
ejemplo capturando variables dentro de una lambda
se dice que una lambda captura una variable cuando se usa una variable de afuera, esta variable puede ser
modificada desde adentro y fuera de la lambda y estos cambios se veran reflejados
 */
fun main() {
    var count = 0

    val changeAndPrint = {
        ++count
        println(count)
    }

    println(count)    // 0
    changeAndPrint()  // 1
    count += 10
    changeAndPrint()  // 12
    println(count)    // 12
}