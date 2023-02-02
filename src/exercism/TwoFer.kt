package exercism
/* Problem
Instructions
Two-fer or 2-fer is short for two for one. One for you and one for me.

Given a name, return a string with the message:

One for name, one for me.
Where "name" is the given name.

However, if the name is missing, return the string:

One for you, one for me.
Here are some examples:

Name	String to return
Alice	One for Alice, one for me.
Bob	One for Bob, one for me.
One for you, one for me.
Zaphod	One for Zaphod, one for me.
 */

fun twofer(name: String = " "): String {
    return if (name == " ") "One for you, one for me." else "One for $name, one for me."
}

// otra solucion
fun twofer2(name: String = "you") = "One for $name, one for me."


fun main() {
    println(twofer()) // "One for you, one for me."
    println(twofer("Alice")) // "One for Alice, one for me."
}