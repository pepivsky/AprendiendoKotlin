package exercism
/*
Introduction
You work for a company that sells fonts through their website. They'd like to show a different sentence each time someone views a font on their website. To give a comprehensive sense of the font, the random sentences should use all the letters in the English alphabet.

They're running a competition to get suggestions for sentences that they can use. You're in charge of checking the submissions to see if they are valid.

Note
Pangram comes from Greek, παν γράμμα, pan gramma, which means "every letter".

The best known English pangram is:

The quick brown fox jumps over the lazy dog.

Instructions
Your task is to figure out if a sentence is a pangram.

A pangram is a sentence using every letter of the alphabet at least once. It is case insensitive, so it doesn't matter if a letter is lower-case (e.g. k) or upper-case (e.g. K).

For this exercise we only use the basic letters used in the English alphabet: a to z.

link: https://exercism.org/tracks/kotlin/exercises/pangram
 */
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
