package functions

fun findCountLetter(str: String) {
    val trimmedSentence = str.trim()
    val words = trimmedSentence.split(Regex("\\s+"))
    println(words.size)
}
fun main() {
    val str = "Hi,  how are you?"
    findCountLetter(str)
}