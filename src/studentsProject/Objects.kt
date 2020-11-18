package studentsProject

class Course(val id: Int, val title: String) {

}

/*
En realidad un object no es más que un tipo de datos con una única implementación.
object tambien puede implementar una interfaz o heredar
ya que internamente se define una clase estandar, no puede tener un constructor ni ser instanciada
 */
object Courses {
    var allCourses = arrayListOf<Course>() //lista de objetos Curso, es statica ya accesible desde las demas clases

    fun initializeList() { //nicializa la lista con un elemento
        allCourses.add(Course(1, "Kotlin Fundamentals")) //
    }

}