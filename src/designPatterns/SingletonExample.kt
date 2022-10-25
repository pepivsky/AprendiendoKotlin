package designPatterns

// Singleton example
object Singleton {
    init {
        println("Singleton invoked")
    }
    var property = "I am a var"
    fun printVarName() {
        println(property)
    }
}

fun main() {
    Singleton.printVarName()
}