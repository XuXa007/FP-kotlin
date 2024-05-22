package `5_functions`

fun roundFourDigitNumber(number: Int): Any {
    return if (number in 1000..9999) {
        number.toString().substring(0, 1) + "K"
    } else {
        number.toString()
    }
}

fun main() {
    println(roundFourDigitNumber(2720))
}