/*
You want to hack a website and get all available parameters. Print them "key : value". If a parameter doesn't have value, print "not found".

If you find the password (parameter pass), you should print its value after all parameters once again, but with a key password. If a URL does not contain a parameter pass, do not print anything after parameters. But if the pass parameter is present, its value cannot be empty

Note: the order of parameters should be like as in the URL.
Advice: learn the structure of URL.


https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
Sample Output 1:

pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345
Sample Input 2:

https://target.com/index.html?port=8080&cookie=&host=localhost
Sample Output 2:

port : 8080
cookie : not found
host : localhost
 */

fun main() {
    val url = readLine()!!
    val partAfterQuestion = url.substringAfter("?")
    val parts = partAfterQuestion.split("&")
    var againPassword = ""

    parts.forEach {
        val (key, value) = it.split("=")
        println(if (value.isEmpty()) "$key : not found" else "$key : $value")
        if (key == "pass") {
            againPassword = "password : $value"
        }
    }
    if (againPassword.isNotEmpty()) { println(againPassword) }
}