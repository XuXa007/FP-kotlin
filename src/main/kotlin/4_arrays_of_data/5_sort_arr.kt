package `4_arrays_of_data`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val arr1 = input.split(", ").map { it.toInt() }.toIntArray()
//    val arr1 = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
//    for (i in arr1.sorted()) print("$i ")
//    println()
    println(arr1.sorted().joinToString())

}
//decimalDigitValue