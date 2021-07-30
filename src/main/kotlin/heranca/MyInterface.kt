package heranca

interface MyInterface {
    fun doSomething() {
        println("MyInterface is doing some work")
    }

    fun absMethod()
}

interface MyInterface2 {
    fun doSomething() {
        println("MyInterface2 is doing some work")
    }

    fun absMethod() {
        println("MyInterface2 absMethod")
    }
}

class C : MyInterface {
    override fun absMethod() {
        println("MyInterface absMethod implementation")
    }
}

class D : MyInterface, MyInterface2 {
    override fun doSomething() {
        super<MyInterface>.doSomething()
        super<MyInterface2>.doSomething()
    }

    override fun absMethod() {
        super.absMethod()
    }
}

fun main() {
    val d = D()
    val c = C()
    d.doSomething()
    d.absMethod()
    c.doSomething()
    c.absMethod()
}