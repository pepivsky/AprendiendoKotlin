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
    val shoe = Shoe("super star", "white shoe", 224324, "Adidas")
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

    //shoe que hereda de product
    val jordan = Shoe("jordan","red shoe", 1233, "Nike")
    println("Shoe: $jordan")

    println(jordan.create()) //metodo que se hereda de la interfaz

}