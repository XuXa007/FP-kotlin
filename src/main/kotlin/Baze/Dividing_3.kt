package Baze

fun main() {
    println("Введить 4-х значное число:")
    val input = readLine()

    if (input?.length == 4) {
        println(input.toList().joinToString (", "))
    }
}
