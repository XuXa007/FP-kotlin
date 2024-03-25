package functions

fun main() {
    var number = readln().toInt()
    while (number != 123) {
        val choice = pluralYear(number)
        println(choice)
        number = readln().toInt()
    }
}

fun pluralYear(choice: Int): String {
    return if (choice % 10 == 1 && choice % 100 != 11) {
        "$choice год"
    } else if (choice % 10 in 2..4 && (choice % 100 < 10 || choice % 100 >= 20)) {
        "$choice года"
    } else {
        "$choice лет"
    }
}
