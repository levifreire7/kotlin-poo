package heranca

open class Employee(name: String, salary: Float) {
    init {
        println("Name is $name")
        println("Salary is $salary")
    }
}

class Programmer(name: String, dept: String, salary: Float) : Employee(name, salary) {
    init {
        println("Name $name of department $dept with salary $salary.")
    }

    fun doProgram(){
        println("Programming is my passion.")
    }
}

class Salesman(name: String, dept: String, salary: Float) : Employee(name, salary) {
    init {
        println("Name $name of department $dept with salary $salary.")
    }

    fun fieldWork(){
        println("Travelling is my hobby.")
    }
}