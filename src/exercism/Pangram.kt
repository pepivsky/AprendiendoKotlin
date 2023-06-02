package exercism

object Pangram {

    fun isPangram(input: String): Boolean {
        val letters = ('a'..'z').toList().toTypedArray()
        var flag = true
        letters.forEach {
            if (!input.contains(it, ignoreCase = true)) {
                flag = false
                return@forEach
            }

        }
        return flag
    }

    // solucion usando set
    fun isPangram2(input: String): Boolean {
        val letters = ('a'..'z').toSet()
        println(letters)
        return letters.all { input.contains(it, ignoreCase = true) }
    }

    // otra solucion
    fun isPangram3(str: String) = ('a'..'z').all { str.contains(it, ignoreCase = true) }

}
