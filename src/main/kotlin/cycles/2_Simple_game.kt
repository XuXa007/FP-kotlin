package cycles

import kotlin.random.Random

fun main() {
    val randomInt = (1..9).random()
    println(randomInt)
    print("Write number: ")
    while (readln().toInt() != randomInt) {
        print("Again: ")
    }
    println("Yes")

//    var input = readln().toInt()
//    while (input.equals(randomInt)) {
//        print("Again: ")
//        input = readln().toInt()
//    }
//    println("Yes")
}