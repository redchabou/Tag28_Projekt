class Car {
    var color: String
    var speed: Int

    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
    }

    fun paint(color: String) {
        this.color = color
    }

    fun tune() {
        speed = speed + 10
    }


}