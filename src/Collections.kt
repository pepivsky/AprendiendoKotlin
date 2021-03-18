import java.util.*

fun main() {


    // formas de declarar un Array
    val countries = arrayOf("India", "Mexico", "Colombia", "Argentina")
    val days = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes") //puede ser un array de cualquier tipo ya que no se le esta especificando
    val numbers = intArrayOf(1, 2 , 3, 4) //especificando arreglo de enteeros

    println(countries) //imprime la direccion de memoria

    println(days)
    println(CONSTANTE)

    for (country in countries) {
        println("Paises: $country")
    }

    //promedio de los numeros
    var sum = 0
    for (num in numbers) {
        sum += num
    }

    val promedio = sum / numbers.size
    println("El promedio del arreglo de numeros es: $promedio")



//Convertir un array de tipo objeto a primitivo
    var arrayObject = arrayOf(1,2,3,4) //Array Objeto
    var intPrimitive: IntArray = arrayObject.toIntArray()  //Array primitivo

    //sumar
    val suma = arrayObject.sum()
    println("La suma es: $suma")

    //añadir un elemento más al array
    arrayObject = arrayObject.plus(5)
    for (a in arrayObject) println("Elemento: $a")

    // Colocar al revés un arreglo y asignarlo a una variable
    arrayObject = arrayObject.reversedArray()
    for (a in arrayObject) println("Elemento Reversa: $a")

    // Colocar al revés un arreglo a si mismo
    arrayObject.reverse() //voltea el arreglo pero no retorna nada
    for (a in arrayObject) println("Elemento Reversa: $a")

    //******************** iomprimir indices y valores de una coleccion usando for *****************************
    println()
    for ((index, element) in numbers.withIndex()) {
        println("numero: $element in index: $index")
    }

    //imprimiendo el indice con withIndex
    println("usando withIndex")
    for (i in numbers.withIndex()){
        println(i.index) //tambien se puede obtener de esta manera
    }

    //recorriendoo un treeMap
    var ages = TreeMap<String, Int>() //clave, valor
    //llenando el TreeMap
    ages["Blanca"] = 55
    ages["cynthia"] = 23
    ages["Fabi"] = 22

    for ((name, age) in ages) {
        println("Name:$name age:$age")
    }


}
const val SOME = "some"
class Algo {

}