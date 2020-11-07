package studentsProject

fun main() {

}

abstract class  Person(val firstName: String, val lasName: String) {

}

class Student(firstName: String ,lasName: String, val id: Int, var tutor: String) : Person(firstName, lasName) { //hereda de person

    fun enrole(courseName: String) { //Metodo para inscribir un estudiante en un curso
        val course = Courses.allCourses //Unica instancia Object de Courses
            .filter { it.title == courseName }
    }
}