package `1_baze`

val days = 2642
fun main() {
    val years: Int = days / 365
    val weeks: Int = (days % 365) / 7
    val day: Int = (days % 365) % 7

    println("Лет: $years, недель: $weeks, дней: $day")
}

