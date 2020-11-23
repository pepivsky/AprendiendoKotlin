package filterAndSortingCollections

//filtrando y ordenando colecciones
fun main() {
    val enteros = listOf(1, 2, 4, 5, 6)

    //usando filter para filtrar los datos, recibe un predicado
    val smallInts = enteros.filter { it < 4 } //se guardan los elemtnos menores que 4

    println(smallInts) //1,2

    //****usando Map****
    //map transforma los datos para obtener unos nuevos, puede aplicarse a la misma lista
    val squaredInts = enteros.map { it * it }

    for (i in squaredInts) println(i)

    //podemos usar filter y map juntos
    val squaredSmallInts = smallInts.filter { it > 5 }.map { it * it } //filtra y transforma los datos
    println(squaredInts)

    //lista de objetos de filterAndSortingCollections.Meeting
    val meetings = listOf(Meeting(1, "Board filterAndSortingCollections.Meeting"), Meeting(2, "Comitee filterAndSortingCollections.Meeting"))

    val titles = meetings.map { reunion -> reunion.title } //devuelve los strings de los titulos  (transforma los mmeting en Strings)
    println(titles)

    //filtra los datos y despues los transforma, solo los empiezan con B y transforma a Sgring (terminamos con una lista de Strings)
    val someTitles = meetings.filter { it -> it.title.startsWith("B") }.map { m -> m.title }
    println(someTitles) //Board filterAndSortingCollections.Meeting

}
//clase filterAndSortingCollections.Meeting (reunion)
class Meeting(val id: Int, val title: String)