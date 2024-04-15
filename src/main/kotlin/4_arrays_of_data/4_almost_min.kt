package `4_arrays_of_data`

import java.util.*
import kotlin.math.min

//fun main() {
//    val scanner = Scanner(System.`in`)
//
//    val input = scanner.nextLine()
//    val arr1 = input.split(",").map { it.toInt() }.toIntArray()
//    arr1.sort()
//    if (arr1[0] != arr1[1]) {
//        println(arr1[1])
//    } else {
//        var count = 1
//        while (count != arr1.size) {
//            if (arr1[count - 1] != arr1[count]) {
//                println(arr1[count])
//                break;
//            }
//            count++
//        }
//    }
//}

fun main() {
    val input = readlnOrNull()
    val elements = input?.split(", ")?.map { it.toInt() } ?: emptyList()

    val secondSmallest = elements.sorted().distinct()[1] // distinct - удаляет все дубликаты
    println(secondSmallest)
}
