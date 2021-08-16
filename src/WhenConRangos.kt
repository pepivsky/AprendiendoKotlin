
/*
Each gamer has an army of units. Write a program that classifies the army of your enemies in accordance with these rules:

Units:  Category
less than 1: no army
from 1 to 4: few
from 5 to 9: several
from 10 to 19: pack
from 20 to 49: lots
from 50 to 99: horde
from 100 to 249: throng
from 250 to 499: swarm
from 500 to 999: zounds
1000 and more: legion
The program should read the number of units and output the corresponding category.


 */

fun main() {
    val numUnits = readLine()!!.toInt()
    println(
        when (numUnits) { // when como expresion usando rangos
            in Int.MIN_VALUE..0 -> "no army"
            in 1..4 -> "few"
            in 5..9 -> "several"
            in 10..19 -> "pack"
            in 20..49 -> "lots"
            in 50..99 -> "horde"
            in 100..249 -> "throng"
            in 250..499 -> "swarm"
            in 500..999 -> "zounds"
            in 1000..Int.MAX_VALUE -> "legion"
            else -> "unknown"
        }
    )
}

/*
Solucion con inline function
fun main() = when (readLine()!!.toInt()) {
    in Int.MIN_VALUE..0 -> "no army"
    in 1..4 -> "few"
    in 5..9 -> "several"
    in 10..19 -> "pack"
    in 20..49 -> "lots"
    in 50..99 -> "horde"
    in 100..249 -> "throng"
    in 250..499 -> "swarm"
    in 500..999 -> "zounds"
    in 1000..Int.MAX_VALUE -> "legion"
    else -> "impossible" }.let(::print)
 */