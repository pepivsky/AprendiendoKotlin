package oop

/*

 */

// write here
open class Animal // clase padre de toda la jerarquia

open class Mammal : Animal()// el constructor vacio se puede omitir en la declaracion de la clase
open class Fish : Animal() // hereda de animal
open class Bird : Animal()

class Lion : Mammal()

class Salmon : Fish()
class Carp : Fish()

class Eagle : Bird()