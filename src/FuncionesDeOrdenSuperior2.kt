
val action = { println("Hola mundo!")}  //funcion de orden superior almacenada en una variable (en esta Kotlin infiere los tipos de datos)
val calc = {x: Int, y: Int -> x * y} //esta funcion recibe dos enteros y devuelve un entero

//val calc: (Int, Int) = {x, y -> x * y} //especifianco los tipos de datos de la funcion en la declaracion

fun doSomething(func: () -> Unit) {
    func()//ejecutando la funcion recibida
}

fun main() {
    doSomething(action)
    //doSomething(calc) calc da error porque devuelve uin entero y en doSomething especificamos que pide un funcion sin valor de retorno
}