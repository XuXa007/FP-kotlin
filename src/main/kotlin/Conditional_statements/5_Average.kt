package Conditional_statements

import java.io.IOException
import java.lang.Exception

fun main() {
    val input = readln()
    try {
        val a = readln()
//        val a = input
    } catch (e: Exception) {
        println("Ошибка")
    }


//    val num = input.split(" ").mapNotNull { it.toIntOrNull() }
//    if (num.toHashSet().size == num.size) {
//        println(num.toHashSet().size)
//        println(num.size)
//        println("Все числа уникальны: $num")
//    } else {
//        println(num.toHashSet().size)
//        println(num.size)
//        println("Ошибка: обнаружены одинаковые числа.")
//    }
}
