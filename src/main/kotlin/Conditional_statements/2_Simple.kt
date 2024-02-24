package Conditional_statements

fun main() {
    val ageInput = readln()
    val age: Int? = ageInput?.toIntOrNull()
    if (age != null) {
        if (age > 18) {
            println("Вам уже все можно")
        } else if (age == 18) {
            println("Ура, Вам 18 лет!")
        } else {
            println("Вы еще слишком молоды")
        }
    }
}