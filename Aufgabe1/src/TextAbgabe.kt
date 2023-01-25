fun main() {

    //hier haben wir einen Objekt von Klasse Car gemacht.
    // und hat diesem Objekt die Methoden und Constructor von Basis Class vererbt.

    var car: Car = Car("weiss", 150)

    car.paint("schwarz")
    car.tune()

    println(car.color)
    println(car.speed)
}