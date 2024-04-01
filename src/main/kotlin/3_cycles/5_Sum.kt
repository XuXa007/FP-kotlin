package `3_cycles`

fun main() {
    var a = 0
    for (i in 1..100) {
        if (i % 4 == 0) {
            a += i
//            println(a)
        }
    }
    println(a)
}