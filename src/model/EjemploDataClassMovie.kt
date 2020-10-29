package model
//data class, clase de datos, equivalente a POJO en Java
//La ventaja de usar Data Class es que Kotlin nos provee automáticamente los siguientes miembros de todas las propiedades declaradas en el constructor primario:

//equals()/hashCode()
//toString() de la forma "User(name=John, age=42)"
//componentN() functions correspondiente a las propiedades en su orden de declaración.
//copy()
data class EjemploDataClassMovie(val title: String, val director: String, val duration: Int) //metodo constructor primario