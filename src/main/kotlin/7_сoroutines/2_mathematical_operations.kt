package `7_сoroutines`

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// сумма арифметической прогрессии n/2 * (2a * (n-1) * d)
fun main():Unit = runBlocking {
    launch{
        val n = 10
        val a = 1
        val d = 2
        val sum = solve(n,a,d)

        println("first: $n and arithmetic progression: $sum")
    }
}

suspend fun solve(n: Int, a: Int, d: Int): Int {
    delay(5_00)
    return n / 2 * (2 * a + (n - 1) * d)
}

//fun main() = runBlocking { // this: CoroutineScope
//    launch { doWorld() }
//    println("Hello")
//}
//suspend fun doWorld() {
//    delay(1000L)
//    println("World!")
//}