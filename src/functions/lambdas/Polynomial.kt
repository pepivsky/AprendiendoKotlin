package functions.lambdas
/*
Write a lambda expression that calculates a * (x * x) + b * x + c
a⋅x
2
 +b⋅x+c
, where a, b, c are variables and x is the lambda parameter. The lambda is to have the (Int) -> Int type. Note that variables a, b, c are already declared.


 */
fun main() {

    val (a,b,c) = listOf(1,2,3)
    val lambda: (Int) -> Int = { x: Int -> a * (x * x) + b * x + c }

    // tambien se puede remplazar x por it ya que la lambda tiene solo un argumento
    // val lambda: (Int) -> Int = { a * it * it + b * it + c }
}