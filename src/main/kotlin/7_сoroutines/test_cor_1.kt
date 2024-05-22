package `7_сoroutines`

import kotlinx.coroutines.delay
import kotlinx.coroutines.*
import kotlinx.coroutines.runBlocking
import java.util.Random
fun main() : Unit = runBlocking{
//    launch {
//        val res = doWorld("Hello")
//        println(res)
//    }

//    repeat(100) {
//        launch {
//            val res = doWorld(it.toString())
//            println(res)
//        }
//    }

//    val coroutines: List<Deferred<String>> = List(100)  {
//        async {
//            doWorld(it.toString())
//        }
//    }
//    coroutines.forEach{ println(it.await()) }

//    val coroutines: List<Deferred<String>> = List(100) {
//        async(start = CoroutineStart.LAZY) {
//            doWorld(it.toString())
//        }
//    }
//    coroutines.forEach { println(it.await()) }

//    val coroutines: List<Deferred<String>> = List(100) {
//        async(start = CoroutineStart.DEFAULT) {
//            doWorld(it.toString())
//        }
//    }
//    coroutines.forEach {
////        println(it.cancel())
//        (it.cancelAndJoin())
//    }

    val coroutines: List<Job> = List(100) {
        launch (start = CoroutineStart.DEFAULT){
            doWorld(it.toString())
        }
    }
    coroutines.forEach { it.cancel("Cansel by hand") }
}

suspend fun doWorld(name: String): String {
    delay(Random().nextInt(5000).toLong())
    return "Done: $name"
}