package conditional_statements


fun main() {
    println("Введите 3 числа")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    when {
        (n2 > n3 && n2 < n1 || n2 > n1 && n2 < n3) -> println(n2)
        (n1 > n3 && n1 < n2 || n1 > n2 && n1 < n3) -> println(n1)
        (n3 > n2 && n3 < n1 || n3 > n1 && n3 < n2) -> println(n3)

        else -> {
            when {
                (n1 < n2 && n1 < n3) -> println(n1)
                (n2 < n3 && n2 < n1) -> println(n2)
                (n3 < n1 && n3 < n2) -> println(n3)
                (n1 == n2 && n2 == n3) -> println("они равны")
                else -> {
                    when {
                        (n1 == n2) -> println(n1)
                        (n2 == n3) -> println(n2)
                        (n1 == n3) -> println(n3)
                    }
                }
            }
        }
    }
}

