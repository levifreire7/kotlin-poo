package heranca

open class Bird {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}

class Parrot : Bird() {
    override var color = "Green"
    override fun fly() {
        super.fly()
        println("Parrot is flying...")
    }
}

class Duck : Bird() {
    override var color = "White"
    override fun fly() {
        super.fly()
        println("Duck is flying...")
    }
}

fun main() {
    val p = Parrot()
    p.fly()
    println(p.color)

    val d = Duck()
    d.fly()
    println(d.color)
}