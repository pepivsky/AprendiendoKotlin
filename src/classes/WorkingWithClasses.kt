/* Ejemplo de creacion de dos clases con sus propiedades en kotlin
Composition
Please, write these two classes:

OperatingSystem with a single String property name.
DualBoot with two OperatingSystem properties primaryOs and secondaryOs.
All the properties are to support reassignment. You can use whichever default values you want.


 */


// write the classes here
class OperatingSystem {
    var name: String = ""
}

class DualBoot {
    var primaryOs = OperatingSystem()
    var secondaryOs = OperatingSystem()
}