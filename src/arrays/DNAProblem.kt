package arrays
/*
Compression algorithm
Upon learning that DNA is not a random string, freshmen of the Bioinformatics Institute from the informatics group suggested using a compression algorithm that compresses repeated characters in a string.

Encoding is performed as follows:
The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the same characters of the input string are replaced by the symbol and the number of its repetitions in this string.

Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. The encoding must be case sensitive.

Note, string can be empty or contain only a single character.


Sample Input:
aaaabbcaa

Sample Output:
a4b2c1a2


Sample Input:
abc

Sample Output:
a1b1c1


Sample Input:
aaaaa

Sample Output:
a5
 */
fun main() {
    val dna = readLine()!!.toCharArray()
    var counter = 1

    if (dna.size == 1) { // si el tamano es 1 entonces solo lo imprime y el codigo siguiente no se ejecuta
        println("${dna.first()}$counter")
        return
    }

    for (i in 0 until dna.lastIndex) {
        if (dna[i] == dna[i + 1]) { // si el siguiente es igual
            counter++
            if (i == dna.lastIndex - 1) {
                print("${dna[i]}$counter")
            }
        } else { // si es diferente
            print("${dna[i]}$counter")
            counter = 1
            if (i == dna.lastIndex - 1) {
                print("${dna[i + 1]}$counter")
            }
        }
    }
}