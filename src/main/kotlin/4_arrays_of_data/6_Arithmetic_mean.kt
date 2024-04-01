package `4_arrays_of_data`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextLine()
    val arr1 = input.split(", ").map { it.toInt() }
    val mean = arr1.sum().toDouble() / arr1.size
    println(arr1.filter { it > mean })
}