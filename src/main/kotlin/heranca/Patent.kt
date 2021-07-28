package heranca

open class Patent {
    constructor(name: String, id: Int) {
        println("execute super constructor $name: $id")
    }
}

class Child : Patent {
    constructor(name: String, id: Int, dept: String) : super(name, id) {
        println("execute child class constructor with property $name, $id, $dept")
    }
}

fun main() {
    val child = Child("Song", 2352, "Music")
}

