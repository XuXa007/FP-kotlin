package conditional_statements


fun main() {
    println("Введите 3 числа")
    val n1 = readln().toInt() //2
    val n2 = readln().toInt() // 3
    val n3 = readln().toInt() // 1

    when {
        (n2 > n3 && n2 < n1 || n2 > n1 && n2 < n3) -> println(n2)
        (n1 > n3 && n1 < n2 || n1 > n2 && n1 < n3) -> println(n1)
        (n3 > n2 && n3 < n1 || n3 > n1 && n3 < n2) -> println(n3)

        else -> {
            when {
                (n1<n2 && n1<n3) -> println(n1)
                (n2<n3 && n2<n1) -> println(n2)
                (n3<n1 && n3<n2) -> println(n3)
            }
        }

    }

}

