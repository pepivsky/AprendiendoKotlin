package generics
/*
Imagine you have a service which helps people to move from one place to another.
You have boxes for packaging different types of furniture:
ArmchairBox for an armchair, FridgeBox for a fridge,
but it's not convenient because boxes differ only in volume.
Create a universal class Box, which contains furniture of some type and the volume of a box.
Add a primary constructor for initializing furniture and volume, which is Int.
Complete the methods getBoxVolume() and getFurnitureFromBox() for getting both fields of Box.
 */
fun main() {
    val fridge = Fridge()
    val armchair = Armchair()

    val box1 = Box<Fridge>(fridge,23)
    println(box1.getBoxVolume())
    println(box1.getFurnitureFromBox())


    val box2 = Box<Armchair>(armchair,24)
    println(box2.getBoxVolume())
    println(box2.getFurnitureFromBox())



}

// implement primary constructor and methods
class Box<T>(val furniture: T, val volume: Int) {
    fun getBoxVolume() = volume
    fun getFurnitureFromBox() = furniture
}

// Don't change classes below
class Fridge
class Armchair