package cinemaproject

/* Stage 3 del programa del cinema
Stage 3/5: Tickets
Description
When choosing a ticket you are guided not only by your space preference but also by your finances. Let's implement the opportunity to check the ticket price and see the reserved seat.

Objectives
Read two positive integer numbers that represent the number of rows and seats in each row and print the seating arrangement like in the first stage. Then, read two integer numbers from the input: a row number and a seat number in that row. These numbers represent the coordinates of the seat according to which the program should print the ticket price. The ticket price is determined by the same rules as the previous stage:

If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. Please note that the number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the rest 5 rows.
After that, the program should print out all the seats in the screen room as shown in the example and mark the chosen seat by the B symbol. Finally, it should print the ticket price and stop. Note that in this project, the number of rows and seats won't be greater than 9.

Examples
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1

Enter the number of rows:
> 7
Enter the number of seats in each row:
> 8

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

Enter a row number:
> 3
Enter a seat number in that row:
> 6

Ticket price: $10

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S B S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S
Example 2

Enter the number of rows:
> 8
Enter the number of seats in each row:
> 9

Cinema:
  1 2 3 4 5 6 7 8 9
1 S S S S S S S S S
2 S S S S S S S S S
3 S S S S S S S S S
4 S S S S S S S S S
5 S S S S S S S S S
6 S S S S S S S S S
7 S S S S S S S S S
8 S S S S S S S S S

Enter a row number:
> 6
Enter a seat number in that row:
> 5

Ticket price: $8

Cinema:
  1 2 3 4 5 6 7 8 9
1 S S S S S S S S S
2 S S S S S S S S S
3 S S S S S S S S S
4 S S S S S S S S S
5 S S S S S S S S S
6 S S S S B S S S S
7 S S S S S S S S S
8 S S S S S S S S S
 */
/*
const val CONST_FRONT_HALF = 10
const val CONST_BACK_HALF = 8
fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val cols = readLine()!!.toInt()
    val total = rows * cols
    var resultTotal = calculateTotal(rows, cols, total)
    val grid = Array(rows) { CharArray(cols) { 'S' } }

    println()
    printSeats(grid) // imprime
    println()


    println("Enter a row number:")
    val seatRow = readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val seatCol = readLine()!!.toInt()

    val ticketPrice = calculateTicketPrice(row = seatRow, col = seatCol, total, rows, cols)
    println()
    println("Ticket price: \$$ticketPrice")
    println()

    asignSeat(seatRow, seatCol, grid)
    printSeats(grid)
    println()
}

fun asignSeat(seatRow: Int, seatCol: Int, array: Array<CharArray>) {
    val row = seatRow - 1
    val col = seatCol - 1
    array[row][col] = 'B'
}


fun calculateTicketPrice(row: Int, col: Int, total: Int, rows: Int, cols: Int): Int {
    var cost = 0
    val CONST_ONE_TICKET = 1
    val trueRow = row - 1
    cost = if (total < 60) {
        CONST_ONE_TICKET * CONST_FRONT_HALF
    } else if (rows % 2 == 0) {
        val half = (rows / 2) - 1
        if (trueRow in 0..half) CONST_ONE_TICKET * CONST_FRONT_HALF else CONST_ONE_TICKET * CONST_BACK_HALF

    } else { // si es impar
        val half = (rows / 2) - 1
        if (trueRow in 0..half) CONST_ONE_TICKET * CONST_FRONT_HALF else CONST_ONE_TICKET * CONST_BACK_HALF
    }
    return cost
}

fun calculateTotal(rows: Int, cols: Int, total: Int): Int {

    val result = if (total < 60) { // si es menor que 60
        total * CONST_FRONT_HALF
    } else if (rows % 2 == 0) { // si las filas son un numero par
        val half = rows / 2
        half * cols * CONST_FRONT_HALF + half * cols * CONST_BACK_HALF
    } else { // si las filas son un numero impar
        val half = rows / 2
        val backHalf = half + 1
        //println("front half:$half, backHalf:$backHalf")
        half * cols * CONST_FRONT_HALF + backHalf * cols * CONST_BACK_HALF
    }
    return result
}


fun printSeats(grid: Array<CharArray>) {
    val rows = grid.size
    val cols = grid[0].size

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
}*/
