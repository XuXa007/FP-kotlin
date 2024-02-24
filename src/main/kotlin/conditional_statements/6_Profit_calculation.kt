package conditional_statements

fun main() {
    val losses = readln().toBigDecimal()
    val profit = readln().toBigDecimal()
    println("Ваши потери: $losses, ваша прибыль: $profit")
    if (profit > losses) {
        println("Ваша прибыль составила: ${profit - losses}")
    } else if (losses > profit) {
        println("Ваши убытки составили: ${losses - profit}")
    }
}