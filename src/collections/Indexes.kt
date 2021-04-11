package collections
/* Programa que imprime los indices de las ocurrencias de un string en la lista
Indexes
In the input, you are given a List of products that you put on the shelf and a String that represents a specific product. Print out this product's position on the shelf. Note that products may repeat.


Sample Input:
Mustard Cheese Eggs Cola Eggs
Eggs

Sample Output:
2 4
 */
fun main() {
    val lista = listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    solution(lista, "Eggs")
}

fun solution(products: List<String>, product: String) {
    val indicesList = mutableListOf<Int>()
    products.forEachIndexed { index, prod -> if (prod == product) indicesList.add(index) }
    println(indicesList.joinToString(" "))
}