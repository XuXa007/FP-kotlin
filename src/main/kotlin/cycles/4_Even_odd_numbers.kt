package cycles

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Введите число: ")
    val input = scanner.nextBigInteger()

    val str = input.toString()
    var even = 0
    var odd = 0

    for (char in str) {
        val digit = char.toString().toInt()
        if (digit % 2 == 0) {
            even++
        } else {
            odd++
        }
    }

    println("четных цифр: $even")
    println("нечетных цифр: $odd")

    scanner.close()

}