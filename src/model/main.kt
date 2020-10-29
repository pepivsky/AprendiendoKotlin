package model

fun main() {
    //instaancia de la clase camara
    val camera = Camera()
    camera.turnOn() //encendiendo la camara
    camera.turnOff() //apgando la camra
    println(camera.getcameraStatus())

    camera.setResolution(2040)
    println(camera.getResolution())

    //usando los metodos get y set provistos por Kotlin
    val shoe = Shoe()
    shoe.color = "Red"
    shoe.model = "Tenis"
    shoe.size = 32

    println(shoe.color) //Red
    println(shoe.model) //Boots
    println(shoe.size) //34

    //usando la data Class
    val movie = EjemploDataClassMovie("Amelie", "Calvin", 120) //pasando datos al constructor
    println("duration: ${movie.duration} minutos")
    println(movie)
}