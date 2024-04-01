package `5_functions`

fun roundFourDigitNumber(number: Int): Any {
    return if (number in 1000..9999) {
        val roundedNumber = number.toString().substring(0, 1) + "K"
        roundedNumber
    } else {
        number.toString()
        println(number)
    }
}

fun main() {
    val number = readln().toInt()
    roundFourDigitNumber(number)
}
