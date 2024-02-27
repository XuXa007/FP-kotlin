package conditional_statements

fun main() {
    val ageInput = readln()
    val age: Int = ageInput.toInt()
    if (age > 18) {
        println("Вам уже все можно")
    } else if (age == 18) {
        println("Ура, Вам 18 лет!")
    } else {
        println("Вы еще слишком молоды")
    }
}