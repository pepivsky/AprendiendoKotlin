package dataClass
/*
Write a data class Student and a function equals().
Two students are equal if they have the same name and the money value < 1500.
 */


// write your data class here
data class Student(val name: String, val money: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (name != other.name) return false
        if (money >= 1500 || other.money >= 1500) return false

        return true
    }

    // otra solucion
    /*
    override fun equals(other: Any?): Boolean = if (other is Student) {
        name == other.name && money < MAX_MONEY
    } else {
        false
    }
     */


}

fun main() {
    val student1 = Student("pepe", 100)
    val student2 = Student("pepe", 1400)
    // deberia dar true
    println(student1 == student2)

}
