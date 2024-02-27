package conditional_statements


fun main() {
    val num1 = 2
    val num2 = 6

    println("У вас есть числа: $num1 и $num2")
    println("1.Добавить" + "\n" + "2.Отнять" + "\n" + "0.Ничего")
    val a = readln()
    when (a) {
        "0" -> println("Выход")
        "1" -> println("Получилось: $num1+$num2 = ${num1 + num2}")
        "2" -> println("Получилось: $num1-$num2 = ${num1 - num2}")
    }
}