class Person {
    var age: Int

    constructor(age: Int) {
        this.age = age
    }

    fun birthday(){
        age = age + 1
    }

    fun isUnderage() : Boolean {
        return(age < 18)
    }
}