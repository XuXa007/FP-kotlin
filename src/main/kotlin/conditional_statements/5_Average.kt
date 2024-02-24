package conditional_statements


fun main() {
    println("Введите 3 числа")
    val n1 = readln()?.toInt()
    val n2 = readln()?.toInt()
    val n3 = readln()?.toInt()

    if (n1!=null && n2!=null && n3!=null) {
        val res = findAverage(n1, n2, n3)
        println("Averange: $res")
    }
}

fun findAverage(n1: Int, n2: Int, n3: Int) {
    println("Error")
}
