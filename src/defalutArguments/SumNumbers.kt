package defalutArguments
/*
Create a function called sum5 that can sum from 2 to 5 numbers.


 */
fun main() {
    // esta funcion puede sumar desde 2 a 5 numeros
    // en esta funcion se pueden omitir loas argumentos que ya tiene un valor por defecto
    fun sum5(a1: Int = 0, a2: Int = 0, a3: Int = 0, a4: Int = 0, a5: Int = 0) = a1 + a2 + a3 + a4 + a5
}