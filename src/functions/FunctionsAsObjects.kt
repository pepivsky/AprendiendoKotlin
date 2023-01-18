package functions

//
fun sum(a: Int, b: Int): Int = a + b




fun main() {
    // referencia de funcion como objeto, guardada en la variable
    val sumObject = ::sum

    // declarando el tipo explicitamente
    val sumObjectWithType: (Int, Int) -> Int = ::sum

    // usando la suma guardada en la variable sumObject
    println(sumObject(1,2))


    // funcion que retorna otra funcion
    fun getRealGrade(x: Double) = x
    fun getGradeWithPenalty(x: Double) = x - 1

    fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
        if (isCheater) {
            return ::getGradeWithPenalty
        }

        return ::getRealGrade
    }

    // guardando la referencia de la funcion resultado en una variable
    val wantedFunction = getScoringFunction(false) // ::getRealGrade
    // usando la funcion guardada en la variable
    println(wantedFunction(9.0))


    // funcion que recibe otra funcion
    fun applyAndSum(a: Int, b: Int, transformation: (Int) -> Int): Int {
        return transformation(a) + transformation(b)
    }
    // funciones que va a recibir
    fun same(x: Int) = x
    fun square(x: Int) = x * x
    fun triple(x: Int) = 3 * x

    // llamando a la funcion
    println(applyAndSum(1, 2, ::same))    // returns 3 = 1 + 2
    println(applyAndSum(1, 2, ::square))  // returns 5 = 1 * 1 + 2 * 2
    println(applyAndSum(1, 2, ::triple))  // returns 9 = 3 * 1 + 3 * 2

    // ejemplo de uso de un predicado,
    // un predicado es una funcion que toma un arguemnto y regresa un boolean
    fun isNotDot(c: Char): Boolean = c != '.'

    // usando el predicado en la funcion filter que recibe un predicado
    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter(::isNotDot)
    println(textWithoutDots)

}