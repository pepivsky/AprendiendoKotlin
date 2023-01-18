package defalutArguments

import kotlin.math.absoluteValue

/*
Create a function called tip that calculates the tip.
The function has two parameters bill and percentage and returns the amount of tip.
The tip size varies greatly from country to country,
so 10% of the total amount of a customer’s check is a more or less universal solution.
So, if the percentage is not specified, set it at 10. Return only the integer part of gratuity.
 */
fun main() {
    // funcion  que calcula la propina, sino se le pasa el porcentaje entonces calcula 10% por defecto
    fun tip(bill: Int, percentage: Int = 10) = bill / 100 * percentage

    println(tip(100))
    println(19_000 / 10_000)

    // complete this function, add default values
    fun carPrice(old: Int = 5, kilometers: Int = 100_000, maximumSpeed: Int = 120, automatic: Boolean = false){
        val newCarPrice = 20000
        var secondHandPrice: Int
        if (maximumSpeed < 120) {
            secondHandPrice = newCarPrice - (old * 2000) - ((120 - maximumSpeed) * 100) - ((kilometers / 10_000) * 200)
        }else{
            secondHandPrice =  newCarPrice -  (old * 2000) + ((120 - maximumSpeed).absoluteValue * 100) - ((kilometers / 10_000) * 200)
        }
        if (automatic) {
            secondHandPrice += 1500
        }
        println(secondHandPrice)
    }

    carPrice(0,0,120,false) // 20,000 ok
    carPrice() // 8000 default ok
    carPrice(0,kilometers = 19_999, 120, false)// 19,800 ok
    carPrice(0,20_000, 120, false)// 19,600 ok
    carPrice(0,0, 119, false)// 19,900 ok
    carPrice(0,0, 121, false)// 20,100 ok



}