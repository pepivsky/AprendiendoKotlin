package exercism
/*
Instructions
Your task is to convert a number into a string that contains raindrop sounds corresponding to certain potential factors. A factor is a number that evenly divides into another number, leaving no remainder. The simplest way to test if a one number is a factor of another is to use the modulo operation.

The rules of raindrops are that if a given number:

has 3 as a factor, add 'Pling' to the result.
has 5 as a factor, add 'Plang' to the result.
has 7 as a factor, add 'Plong' to the result.
does not have any of 3, 5, or 7 as a factor, the result should be the digits of the number.
Examples
28 has 7 as a factor, but not 3 or 5, so the result would be "Plong".
30 has both 3 and 5 as factors, but not 7, so the result would be "PlingPlang".
34 is not factored by 3, 5, or 7, so the result would be "34".

link: https://exercism.org/tracks/kotlin/exercises/raindrops
 */
object Raindrops {
    private const val PLONG = "Plong"
    private const val PLING = "Pling"
    private const val PLANG = "Plang"

    fun convert(n: Int): String {
        var result = ""
        if (n % 3 == 0) {
            result += PLING
        }
        if (n % 5 == 0) {
            result += PLANG
        }
        if (n % 7 == 0) {
            result += PLONG
        }
        return if (result.isEmpty()) "$n" else result
    }
}

// otra solucion
fun convert(num: Int): String = buildString {
    if (num % 3 == 0) append("Pling")
    if (num % 5 == 0) append("Plang")
    if (num % 7 == 0) append("Plong")
    if(isEmpty()) append(num)
}
