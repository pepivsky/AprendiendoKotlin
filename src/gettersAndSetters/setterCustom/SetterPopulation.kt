package gettersAndSetters.setterCustom
/* Ejemplo de setter personalizado
Imagine we want to implement the City class which stores the name of the city and its population.

There are some restrictions. If the number is out of range, the population is corrected like this: zero for negative values and 50 million for greater than 50_000_000.

Finish the implementation of the City class following this logic.
 */
fun main() {
    val city = City("Tula")
    city.population = 60_000_000 // invocando el setter personalizado
    println(city.population)
}

const val ZERO = 0
const val FIFTY_MILLION = 50_000_000

data class City(val name: String) {
    var population: Int = ZERO
        set(value) { // setter personalizado
            field = if (value < ZERO) {
                ZERO
            } else if (value > FIFTY_MILLION) {
                FIFTY_MILLION
            } else value
        }
}