package cinemaproject

/*
const val CONST_FRONT_HALF1 = 10
const val CONST_BACK_HALF1 = 8
fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val cols = readLine()!!.toInt()
    val total = rows * cols
    val grid = Array(rows) { CharArray(cols) { 'S' } }
    var selection = -1

    while (selection != 0) {
        showMenu()
        selection = readLine()!!.toInt()
        when (selection) {
            1 -> printSeats(grid)
            2 -> {
                val rowAndColumn = buyTicket()
                val seatRow = rowAndColumn.first()
                val seatColumn = rowAndColumn.last()
                val ticketPrice = calculateTicketPrice(row = seatRow, total, rows)

                println()
                println("Ticket price: \$$ticketPrice")
                println()

                asignSeat(seatRow, seatColumn, grid)
            }
        }
    }
}
fun buyTicket(): List<Int> {
    println("Enter a row number:")
    val row = readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val column = readLine()!!.toInt()
    return listOf(row, column)
}
fun showMenu() {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("0. Exit")
}
fun asignSeat1(seatRow: Int, seatCol: Int, array: Array<CharArray>) {
    val row = seatRow - 1
    val col = seatCol - 1
    array[row][col] = 'B'
}
fun calculateTicketPrice(row: Int, total: Int, rows: Int): Int {
    val CONST_ONE_TICKET = 1
    val trueRow = row - 1

    return if (total < 60) {
        CONST_ONE_TICKET * CONST_FRONT_HALF
    } else if (rows % 2 == 0) {
        val half = (rows / 2) - 1
        if (trueRow in 0..half) CONST_ONE_TICKET * CONST_FRONT_HALF else CONST_ONE_TICKET * CONST_BACK_HALF
    } else { // si es impar
        val half = (rows / 2) - 1
        if (trueRow in 0..half) CONST_ONE_TICKET * CONST_FRONT_HALF else CONST_ONE_TICKET * CONST_BACK_HALF
    }
}
fun printSeats1(grid: Array<CharArray>) {
    val rows = grid.size
    val cols = grid[0].size

    println()
    println("Cinema:")
    for (i in 0..cols) {
        if (i == 0) print("  ") else print("$i ")
    }
    println()
    for (i in 0 until rows) {
        print("${i + 1} ") // imprime los numeros de las filas
        for (j in 0 until cols) {
            print("${grid[i][j]} ") // imprime la matriz
        }
        println()
    }
    println()
}*/
