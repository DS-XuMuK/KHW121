fun main() {
    val amount = 12500_00
    val fee = if ((amount * 0.0075).toInt() > 3500) (amount * 0.0075).toInt() else 3500
    println("Transfer fee is $fee")
}