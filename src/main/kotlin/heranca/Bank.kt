package heranca

abstract class Bank {
    abstract fun simpleInterest(p: Int, r: Double, t: Int): Double
}

class SBI : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p * r * t) / 100
    }
}

class PNB : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p * r * t) / 100
    }
}

fun main() {
    var sbi = SBI()
    val sbiint = sbi.simpleInterest(1000, 5.0, 3)
    println("SBI interest is $sbiint")

    var pnb = PNB()
    val pnbint = pnb.simpleInterest(1000, 4.5, 3)
    println("PNB interest is $pnbint")
}