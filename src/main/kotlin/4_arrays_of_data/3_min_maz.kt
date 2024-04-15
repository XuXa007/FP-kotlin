package `4_arrays_of_data`

import java.util.*


//fun main() {
//    val scanner = Scanner(System.`in`)
//
//    val input = scanner.nextLine()
//    val elements = input.split(", ").map { it.toInt() }.toIntArray()
//
//    println("min: " + elements.minOrNull())
//    println("max: " + elements.maxOrNull())
//}

/*
8, 21, 5, 90, 11, 0
*/

fun main() {
    val array = mutableListOf<Int>()

    val input = readlnOrNull()
    val elements = input?.split(", ")?.mapNotNull { it.toIntOrNull() }
    if (elements != null) {
        array.addAll(elements)
    }

    println("Минимальный элемент: ${array.minOrNull()}")
    println("Максимальный элемент: ${array.maxOrNull()}")

}