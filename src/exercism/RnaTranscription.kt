package exercism

fun transcribeToRna(dna: String) =
    buildString {
        dna.forEach { char ->
            append(
                when (char) {
                    'C' -> 'G'
                    'G' -> 'C'
                    'T' -> 'A'
                    'A' -> 'U'
                    else -> char
                }
            )
        }
    }

// otra solucion
fun transcribeToRna2(dna: String): String = dna.map{
    when(it) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else ->it
    }
}.joinToString(separator="")
