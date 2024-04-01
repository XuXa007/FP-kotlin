package `4_arrays_of_data`
fun main() {
    val num2 = readln().toInt()
    val num1 = readln().toInt()
//    val num2 = 5
//    val num1 = 8
    search(num1, num2)

}

fun search(num1: Int, num2: Int) {
    val numList = mutableListOf<Int>()
    if (num1 > num2) {
        for (i in num2..num1) {
            numList.add(i)
        }
        println("Введенные числа: $num2 и $num1")
    } else {
        for (i in num1..num2) {
            numList.add(i)
        }
        println("Введенные числа: $num1 и $num2")
    }
    for (i in numList) print("$i ")
}