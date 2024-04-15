package `5_functions`

fun findCountLetter(str: String): Int {
    val delimiters = arrayOf(" ", ",", ";", ".", "!", "?", ":", "-", "\n", "\t", "\r")
    val words = str.split(*delimiters)
    val filteredWords = words.filter { it.isNotBlank() }
    return filteredWords.size
}
fun main() {
//    val str = "Hi,  how are you?"
    val str = readln()
    println("Количество слов в строке: ${findCountLetter(str)}")
}
/*
Создайте функцию, которая принимает строку и подсчитывает количество слов в этой строке. Слова разделены пробелами или другими символами-разделителями (например, запятая или точка с запятой). Убедитесь, что функция правильно обрабатывает случаи с лишними пробелами или разделителями. Практическая работа №4: Подсчет количества слов в строке
*/