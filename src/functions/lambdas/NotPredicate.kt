package functions.lambdas
/*
Suppose you have a predicate originalPredicate: (Char) -> Boolean and you want to have the opposite predicate.
Write a predicate notPredicate that takes a Char variable and returns the opposite of originalPredicate from that variable.


 */

fun main() {
    fun predicate(c: Char): Boolean = c != '.'

    val notPredicate: (Char) -> Boolean = { c: Char -> !predicate(c) } // niega el primer predicado

    // version simplificada ya que tiene un solo argumento podemos usar it
    val notPredicate2: (Char) -> Boolean = { !predicate(it) } // niega el primer predicado


}