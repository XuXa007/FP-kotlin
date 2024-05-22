package `7_сoroutines`

import kotlinx.coroutines.*
import java.beans.beancontext.BeanContext
import java.sql.Blob
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

// Job - объект результат создания кор
// диспачеры!!
// Structured concurrency

//suspend fun main(): Unit = coroutineScope {
//    launch {
//        delay(1000)
//        println("T1")
//    }
//    launch {
//        delay(500)
//        println("T2")
//    }
//}

//suspend fun main(): Unit = coroutineScope {
//    val text1: Deferred<String> = async {
//        delay(1000)
//        "t1"
//    }
//
//    val t2: Deferred<String> = async {
//        delay(2000)
//        "t2"
//    }
//
//    var res = text1.await() + t2.await()
//    println(res)
//}

//fun main(): Unit = runBlocking {
//    val text1: Deferred<String> = async {
//        delay(1000)
//        "t1"
//    }
//
//    val t2: Deferred<String> = async {
//        delay(2000)
//        "t2"
//    }
//
//    val res = text1.await() + t2.await()
//    println(res)
//}


//suspend fun main(): Unit = coroutineScope {
//    val job1  = launch {
//        delay(1000)
//        println("Text1")
//    }
//    val job2 = launch {
//        delay(2000)
//        println("Text2")
//    }
//
//    job1.join()
//    job2.join()
//
//    println(job1.isActive)
//    println(job1.isCompleted)
//    println(job2.isCompleted)
//
//}


//suspend fun main(): Unit = coroutineScope {
//    val job1 = launch {
//        repeat(10) {i ->
//            delay(100)
//            println(i)
//        }
//    }
//    delay(390)
//    job1.cancelAndJoin()
//    println("camsel")
//    println(job1.isCancelled)
//}

//suspend fun main(): Unit = coroutineScope {
//    val res: Deferred<String> = async {
//        delay(2000)
//        "as res"
//    }
//
//    delay(1000)
//    res.await()
//    res.cancel()
//}

fun main() = runBlocking {
//    repeat(100_000) { // launch a lot of coroutines
//        launch {
//            delay(5000L)
//            print(".")
//        }
//    }
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    job.join() // waits for job's completion
    println("main: Now I can quit.")
}


