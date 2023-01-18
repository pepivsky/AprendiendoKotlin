package oop.overriding

open class Me {
    open fun returnName(name: String): String = "My name is $name"
}

open class ActuallyMe : Me() {
    override fun returnName(name: String): String = "Actually, my name is $name"
}

/* version con errores

private class Me {
    open fun returnName(name: String): String = "My name is $name"
}

open class ActuallyMe : Me() {
    fun returnName(name: String): String = "Actually, my name is $name"
}


 */