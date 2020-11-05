import java.math.BigInteger
//para optimizar las llamadas de funciones recursivas se antepone la palabra clave tailrec, el
//siguiente ejemplo lo demuestra
fun main() {
    //println(fib(10_000, BigInteger("1"), BigInteger("0"))) //llena el stack y causa error

    println(fibMejorado(10_000, BigInteger("1"), BigInteger("0")))
}
//funcion que calcula el numero de fibonacci recursivamente
fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}
//funcion con tailrec (recursividad de cola) internamente se convierte en un bucle para ser mas rapido
tailrec fun fibMejorado(n: Int, a: BigInteger, b: BigInteger): BigInteger {//tailrec optimiza la recursividad para ser mas veloz y no llena el stack(no causa error)
    return if (n == 0) b else fibMejorado(n - 1, a + b, a)
}
