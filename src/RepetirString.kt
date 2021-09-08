/* Ejercicio
Repetitions and templates
Write a program that reads one word and prints it repeatedly as many times as there are letters in it. Use string templates.

Input: a single string.

Output: a single string. Use the following template:

"N repetitions of the word string: ...", where N is the number of letters in the entered word, string is the entered string, and instead of ... there should be the word repetitions.



Sample Input:
four

Sample Output:
4 repetitions of the word four: fourfourfourfour


Sample Input:
seasons

Sample Output:
7 repetitions of the word seasons: seasonsseasonsseasonsseasonsseasonsseasonsseasons
 */


fun main() {
    val word = readLine()!!
    val letters = word.count()
    println("$letters repetitions of the word $word: ${word.repeat(letters)}") // repite el string n veces
}