package lists
/*
Banana!
You are given a MutableList of strings and a String in the input. Replace the occurrences of the given String in the MutableList with Banana.


Sample Input:
Sometimes you have to shake up your life
shake

Sample Output:
Sometimes you have to Banana up your life



 */
fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    val replacement = "Banana"
    strings.replaceAll { if (it == str) replacement else it }
    return strings
}

fun solution2(strings: MutableList<String>, str: String) = strings.replaceAll { if (it == str) "Banana" else it }

fun solution3(strings: MutableList<String>, str: String): MutableList<String> {
    // put your code here
    strings.forEachIndexed { index, word -> if (word == str) strings[index] = "Banana" }
    return strings
}


fun main() {

}