package cycles

import java.util.*

fun main() {
    val input = readln().toInt()
    var even = 0
    var odd = 0
    for (i in 1..input) {
        if (i%2 == 0) {
            even += 1
        } else {
            odd++
        }
    }
    println("Odd numbers is ${odd}")
    println("Even numbers is ${even}")
}