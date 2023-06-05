package exercism

import java.util.*

object ResistorColor {

    private val mapColors = mapOf(
        "black" to 0,
        "brown" to 1,
        "red" to 2,
        "orange" to 3,
        "yellow" to 4,
        "green" to 5,
        "blue" to 6,
        "violet" to 7,
        "grey" to 8,
        "white" to 9,
    )

    fun colorCode(input: String) = mapColors[input.lowercase(Locale.getDefault())] ?: 0

    fun colors() = mapColors.keys.toList()
}
