package model

class Camera {
    private var isOn: Boolean = false
    private var resolution: Int = 1080
    private var megaPixels: Int = 12
    private var brand: String = "Kanon"
    private var model: String = "T6"

    fun setMegaPixels(megaPixels: Int) {
        this.megaPixels = megaPixels
    }
    fun getMegaPixels(): Int {
        return megaPixels
    }

    fun setBrand(brand: String) {
        this.brand = brand
    }
    fun getBrand(): String {
        return brand
    }

    fun setModel(model: String) {
        this.model = model
    }
    fun getModel(): String {
        return model
    }


    //metodo set
    fun setResolution(resolution: Int) {
        this.resolution = resolution
    }

    //metodo get
    fun getResolution(): Int {
        return resolution
    }

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    //metodo get
    fun getcameraStatus(): String {
        return if (isOn) "Camera is turned" else "Camera is off"
    }
    //metodo set
    /*fun setCameraStatus(onoff: Boolean) {
        isOn = onoff
    }*/
}