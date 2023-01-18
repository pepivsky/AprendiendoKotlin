package functions.lambdas
/*
Write a lambda expression that takes two integer arguments and returns the greatest of them.

 */
fun main() {
    val lambda: (Int, Int) -> Int = { a: Int, b: Int -> maxOf(a, b) }
    // otras soluciones
    val lambda2: (Int, Int) -> Int = { a: Int, b: Int -> if (a > b ) a else b }
    val lambda3: (Int, Int) -> Int = { a: Int, b: Int -> Math.max(a, b) }

    println(lambda(1,2))
    println(lambda2(1,2))
    println(lambda3(1,2))
}