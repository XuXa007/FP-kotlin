package Baze
fun main() {
    val input = readln()
    val res = input.toInt().let {
        it + it * 2
    }
    println("$res")
}