//ejemplo de difefentes maneras en las que se puede inicializar un array
fun main() {
    //En Kotlin podria llegar a ser confuso crear un array ya que disponemos de varias maneras, veamos cuales son:

    val intArray1 = arrayOf(1, 1) //crea un array y lo inicializa con dos elementos

    var intArray2 = emptyArray<Int>() //crea un array vacio

    var intArray3 = arrayOf<Int>() //crea un array vacio

    val intArray4 = IntArray(2) //crea un array de tamaño 2, el array contendra el valor por defecto del tipo de dato asignado en cada indice, (0 para numeros)

    var arrayCities = arrayOf("Paris", "CDMX", "Beijing") //arrayOf
    arrayCities += "Moscow" //agregando un nuevo elemento al array

    println(arrayCities.joinToString()) //imprimiendo el array con joinToString (devuelve una representacion en String)
}