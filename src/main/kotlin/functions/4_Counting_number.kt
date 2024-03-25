package functions

fun findCountLetter(str: String) {
    val trimmed = str.trim()
    val words = trimmed.split(Regex("\\s+"))
//    split(Regex("\\s+")) строка будет разделена на подстроки по символам (пробел или знаками)
    println(words.size)
}
fun main() {
    val str = "Hi,  how are you?"
    findCountLetter(str)
}