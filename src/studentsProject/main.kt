package studentsProject

fun main() {
    //creando un objeto usando el companion object de la clase student, no es necesario instanciarlo
    Student.createPostgraduate("pepe", "paredes")

}
//clase padre abstracta
abstract class  Person(val firstName: String, val lastName: String) {

}

open class Student(firstName: String, lastName: String, val id: Int, var tutor: String) : Person(firstName, lastName) { //hereda de person

    fun enrole(courseName: String) { //Metodo para inscribir un estudiante en un curso
        val course = Courses.allCourses //Unica instancia Object de Courses
            .filter { it.title == courseName }
    }

    //usando companion objects en metodos (similar a metodos estaticos, se definen adentro)
    companion object: XmlSerializer<Student> { //el companion object tambien puede implementar una interfaz o heredar
        // ya que internamente se define una clase estandar, no puede tener un constructor ni ser instanciada
        fun createUndergrduate(name: String, lastName: String): UnderGraduate { //factory method
            return UnderGraduate(name, lastName)
        }
        @JvmStatic //notacion para que funcione como estatico usando Java
        fun createPostgraduate(firstName: String, lastName: String): Postgraduate { //factory method
            return Postgraduate(firstName, lastName)
        }

        override fun toXml(item: Student) { // metodo implementado de la interfaz
            TODO("Not yet implemented")
        }
    }
}
//clases que heredan de student
class UnderGraduate(firstName: String, lastName: String): Student(firstName, lastName, 1,"calvin") {

}

class Postgraduate(firstName: String, lastName: String): Student(firstName, lastName, 2, "mauri") {

}

//definiendo una interfaz
interface XmlSerializer<T> {
    fun toXml(item: T)
}