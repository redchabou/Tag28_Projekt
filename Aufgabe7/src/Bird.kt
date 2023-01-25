open class Bird(val weight: Double, val canFly: Boolean) {
    fun makeNoise() {
        println("  ")
    }
}

class Penguin(weight: Double) : Bird(weight, false) {
    fun waddle() {
        println("this is Penguin's noise")
        println("I wish I coul'd fly! but waddling is also funny :) ")
    }
}

class Eagle(weight: Double) : Bird(weight, true) {
    fun fly() {
        println("this is Eagle's noise")
        println("yahoooooooo .. I can fly so high!")
    }
}

class Owl(weight: Double) : Bird(weight, true) {
    fun hoot() {
        println("Hooting is my noise as an Owl.")
        println("I can fly all day.")
    }
}

