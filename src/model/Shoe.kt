package model
//clase que usa los get y set provistos por Kotlin
class Shoe {
    var size: Int = 34 //valor mínimo
        //get y set provistos por kotlin (deben implementarse debajo de la declaracionnde la propiedad)
        set(value) {  //value el valor que viene por parametro
            field = if (value >= 34) value else 34 //validacion. Si el valor es >= 34 entonces se le asigna a size, sino se le asigna 34
            //field es una variable temporal
        }
        get() = field //Sin validacion el get es redundante

    var color: String = "white"

    var model: String = "Boots" //Rechaza Tenis
        set(value) {
            field = if (value.equals("Tenis")) "Boots" else value
        }
        get() = field //En este caso el get es redundante
}