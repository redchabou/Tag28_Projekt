fun main() {
    val airplane = Airplane(4, 400.0)
    println("Airplane is airborne: ${airplane.isAirborne}")

    airplane.takeOff()
    println("Airplane is airborne: ${airplane.isAirborne}")

    airplane.land()
    println("Airplane is airborne: ${airplane.isAirborne}")

    airplane.takeOff()
    println("Airplane is airborne: ${airplane.isAirborne}")

    airplane.takeOff()
    println("Airplane is airborne: ${airplane.isAirborne}")
}
