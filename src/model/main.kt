package model

fun main() {
    //instaancia de la clase camara
    val camera = Camera()
    camera.turnOn() //encendiendo la camara
    camera.turnOff() //apgando la camra
    println(camera.getcameraStatus())

    camera.setResolution(2040)
    println(camera.getResolution())


    val shoe = Shoe()
    shoe.color = "Red"
    shoe.model = "Tenis"
    shoe.size = 32

    println(shoe.color) //Red
    println(shoe.model) //Boots
    println(shoe.size) //34
}