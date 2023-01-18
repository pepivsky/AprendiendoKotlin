package generics.genericFunctions
/*
You have a generic class Box that stores a value of some type.
Define an extension function guessBox() that prints the following line :
"In this box you have: ITEM" , where ITEM is the content of the box.


 */
data class Box<T>(val item: T) {}

// define the function
fun <T> Box<T>.guessBox()  {
    println("In this box you have: ${this.item}")
}

// otra solucion
//fun <T> Box<T>.guessBox() = println("In this box you have: ${this.item}")

fun main() {
    val box = Box<String>("kotlin")
    box.guessBox()
}