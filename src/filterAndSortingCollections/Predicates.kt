package filterAndSortingCollections

fun main() {
    var ints = listOf(1, 2, 3, 4, 5)

    //preguntar si todos los elementos son mayores que 3
    var largeInts = ints.all { it > 3 } //false
    println(largeInts)

    //preguntar si algun elemento de la lista es > 3
    largeInts = ints.any{it > 3} //true
    println(largeInts)

    //obtener el numero de elementos mayores que 3
    var numberOfLargeInts = ints.count { it > 3 }//2
    println(numberOfLargeInts)

    //variable que almacena un predicado
    val greatherThanThree = {v: Int -> v > 3}//es necesario especificar el tipo de dato que maneja

    //usando la variable con el predicado
    //devolver la primera ocurrencia que hace match con el predicado
    val foundInt = ints.find(greatherThanThree)//se tienen que usar parentesis en lugar de llaves
    println(foundInt)//4

}