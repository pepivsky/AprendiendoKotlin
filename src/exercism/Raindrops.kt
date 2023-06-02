package exercism

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
