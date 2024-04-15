import java.awt.Shape

fun main() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // Локальный возврат внутри лямбды
        print(it)
    }
    print(" выполнится с использованием явной метки(lit@)")
    println()
//    foo()
    val x = 1
    val validNumbers = 5..9
    when (x) {
        in 1..10 -> print("x находится в диапазоне от 1 до 10")
        in validNumbers -> print("x допустим")
        !in 10..20 -> print("x находится вне диапазона от 10 до 20")
        else -> print("ни одно из вышеуказанных условий не выполнено")
    }
    println()
    for (i in 1 until 10) {
        // i в интервале [1, 10), при этом 10 исключается
        println(i)
    }
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // Локальный возврат внутри лямбды
        print(it)
    }
    print(" выполнится с использованием неявной метки(forEach@)")
}

