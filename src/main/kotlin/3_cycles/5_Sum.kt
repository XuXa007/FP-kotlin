package `3_cycles`

fun main() {
    var a = 0
    for (i in 0..100 step 4 ) {
//        if (i % 4 == 0) {
        println(i)
            a += i
//            println(a)
//        }
    }
    println(a)
}