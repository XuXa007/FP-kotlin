package `7_сoroutines`

import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date

//fun main() = runBlocking { // this: CoroutineScope
//    launch { // launch a new coroutine and continue
//        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
//        println("World!") // print after delay
//    }
//    println("Hello") // main coroutine continues while a previous one is delayed
//}

fun main(): Unit = runBlocking {
    val time = DateTimeFormatter.ofPattern("HH:mm:ss")

    launch {
        while (isActive) {
            val curTime = LocalTime.now().format(time)
            println(curTime)
            delay(5_000)
        }
    }
}
