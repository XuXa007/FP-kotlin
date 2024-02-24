package conditional_statements

fun main() {
    val a = readln().toInt() ?: 0
    val b = readln().toInt() ?: 0
    val res = if (a % 2 == 0 && b % 2 == 0) {
        "true"
    } else if (a % 2 == 0 || b % 2 == 0) {
        "false"
    } else {
        "error"
    }
    println(res)
}