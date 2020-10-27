package model
//clase que usa los get y set provistos por Kotlin
class Shoe {
    var size: Int = 34 //valor mínimo
        set(value) {
            field = if (value >= 34) value else 34 //
        }
        get() = field //En este caso el get es redundante

    var color: String = "white"

    var model: String = "Boots" //Rechaza Tenis
        set(value) {
            field = if (value.equals("Tenis")) "Boots" else value
        }
        get() = field //En este caso el get es redundante
}