package `7_сoroutines`

import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.system.measureTimeMillis

// Функция, выполняющая задачу: генерация случайного числа и проверка на четность


//suspend fun performTask(index: Int): Pair<Int, Boolean> {
//    val randomNumber = Random.nextInt()
//    val isEven = randomNumber % 2 == 0
//    return Pair(index, isEven)
//}
//
//fun main() = runBlocking {
//    val results = mutableMapOf<Int, Boolean>()
//    val timeTaken = measureTimeMillis {
//        // Запускаем 100,000 корутин
//        coroutineScope {
//            repeat(100_000) { index ->
//                launch {
//                    val result = performTask(index)
//                    results[result.first] = result.second
//                }
//            }
//        }
//    }
//    val successfulTasks = results.count { it.value }
//    println("Number of successful tasks (even numbers): $successfulTasks")
//    println("Total time taken: $timeTaken ms")
//}


fun check (index: Int): Triple<Int, Int, Boolean> {
    val r = Random.nextInt()
    return Triple(index, r, r%2==0)
}

fun main(): Unit = runBlocking {
    val result = mutableMapOf<Int, Boolean>()
    val time = measureTimeMillis {
        val job = List(100_000) {index ->
            launch {
                val res = check(index)
                result[res.first] = res.third
                println("index: ${res.first}, is even (bool): ${res.third}, number: ${res.second}")
            }
        }
        job.forEach { it.join() }
    }
    val count = result.values.count{ it }

    println("Количество успешно выполненных задач (четных чисел): $count")
    println("Общее время выполнения: $time ms")

}

