fun main() {
    val eagle = Eagle(7.0)
    val penguin = Penguin(8.0)
    val owl = Owl(6.0)

    println("Eagle is : ${eagle.weight} Kg")
    println("Eagle can fly: ${eagle.canFly}")
    println("Penguin is: ${penguin.weight} Kg")
    println("Penguin can fly: ${penguin.canFly}")
    println("Owl is: ${owl.weight} Kg")
    println("Owl can fly: ${owl.canFly}")



    eagle.makeNoise()
    penguin.makeNoise()
    owl.makeNoise()

    eagle.fly()
    penguin.waddle()
    owl.hoot()

}