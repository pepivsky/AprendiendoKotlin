package model

class Camera {
    private var isOn: Boolean = false
    private var resolution: Int = 1080

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