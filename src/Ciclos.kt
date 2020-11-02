fun main() {
    // for y foreach
    val daysOfWeek = listOf<String>("Domingo","Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado")

    // Forma tradicional de recorrer un objeto
    for (day in daysOfWeek) {
        println(day)
    }

    // Forma para recorrer con índices de la lista
    // Cuando se utiliza el método withIndex() la lista pasa a convertirse en un objeto Iterable<T>
    for ((index, day) in daysOfWeek.withIndex()) {
        println("$index: $day")
    }

    // Utilizando foreach para recorrer el contenido de una lista una lista
    daysOfWeek.forEach { println(it) }

    //break y continue
    for (i in 0..4) {
        for (j in 0..2) {
            println("i: $i j:$j")
            if (j == 1) break //el break rompe el ciclo mas cercano
        }
    }

    println("*********************")

    //podemos romper todo el ciclo usando labels
   cicloExterno@ for (i in 0..4) {
        for (j in 0..2) {
            println("i: $i j:$j")
            if (j == 1) break@cicloExterno //usando labels podemos controlar mas los ciclos
        }
    }
}