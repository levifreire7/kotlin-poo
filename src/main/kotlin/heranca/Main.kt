package heranca
open class Base {
    val x = 10
}

class Derived() : Base() {
    fun foo(){
        println("x is equal to $x")
    }
}

fun main() {
    val programmer = Programmer("Levi", "IT", 3000F)
    programmer.doProgram()
    val salesman = Salesman("Milena", "Sales", 3500F)
    salesman.fieldWork()

}