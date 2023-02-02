package exercism

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter



/* Problem
Instructions
Given a moment, determine the moment that would be after a gigasecond has passed.

A gigasecond is 10^9 (1,000,000,000) seconds.


 */
const val GIGASECOND_IN_SECONDS = 1_000_000_000L
class Gigasecond(localDate: LocalDateTime) {
    // calculando la nueva fecha sumandole los segundos de gigasecond
    var date: LocalDateTime = localDate.plusSeconds(GIGASECOND_IN_SECONDS)

    // segundo constructor, llama al constructor principal pasandole un localDate transfomado a LocalDateTime
    constructor(localDate: LocalDate) : this(localDate.atStartOfDay()) {
        date = localDate.atStartOfDay().plusSeconds(GIGASECOND_IN_SECONDS)
    }
}


fun main() {
    // probando la solucion
    val gigaSecond = Gigasecond(LocalDate.of(2011, Month.APRIL, 25))
    val gigaSecond2 = Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0))

    println(gigaSecond.date)
    println(gigaSecond2.date)

}