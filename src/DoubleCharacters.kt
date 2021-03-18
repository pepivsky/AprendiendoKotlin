//programa que lee un string y devulve un otro con los caracteres duplicados
/*
Sample Input:
The

Sample Output:
TThhee
 */
fun main() {
    val str1 = readLine()!!
    var str2 = ""

    for (ch in str1) { //por cada carater del strin original le agrega dos al nuevo
        str2 += ch
        str2 += ch
    }
    println(str2)
}