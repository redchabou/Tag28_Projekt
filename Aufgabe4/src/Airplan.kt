class Airplane(val amountTurbines: Int, var flyingSpeed: Double) {
    var isAirborne: Boolean = false

    fun takeOff() {
        if (isAirborne) {
            println("Airplane is already in the air, cannot take off again.")
            return
        }
        isAirborne = true
    }

    fun land() {
        isAirborne = false
    }
}
