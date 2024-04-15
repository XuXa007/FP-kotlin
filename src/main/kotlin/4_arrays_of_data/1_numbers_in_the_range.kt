package `4_arrays_of_data`

fun main() {
    val num2 = readln().toInt()
    val num1 = readln().toInt()

    val numList = if (num1 > num2) {
        (num2..num1).toList()
    } else {
        (num1..num2).toList()
    }

    println("Введенные числа: $num1 и $num2")
    println("Массив: ${numList.joinToString()}")
}