package functions

fun roundFourDigitNumber(number: Int): String {
    return if (number in 1000..9999) {
        val roundedNumber = number.toString().substring(0, 1) + "K"
        roundedNumber
    } else {
        number.toString()
    }
}

fun main() {
    val number = readln().toInt()
    val roundedNumber = roundFourDigitNumber(number)
    println("Округленное число: $roundedNumber")
}
