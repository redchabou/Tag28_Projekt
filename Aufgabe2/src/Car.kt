class Car {

    // hier ist das gleiche wie bei der Aufgabe 1, aber die Methoden würden anderes gestellt,
    // ein mal mit Text ausgabe, und einmal mit if Statement.
    var color: String
    var speed: Int

    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
    }

    fun showOff() {
        println(
            "Mein Auto ist das coolste! Es ist " + color +
                    " und " + speed + " kmh schnell!"
        )
    }

    fun drive() {
        if (speed > 130) {
            println("Du wurdest geblitzt!")
        } else {
            println("Du wurdest nicht geblitzt.")
        }
    }
}