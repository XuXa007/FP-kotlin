package `7_сoroutines`

import kotlinx.coroutines.*

// Suspend функция высшего порядка с таймаутом
suspend fun <T> withTimeoutFunction(body: suspend () -> T): T? {
    return try {
        withTimeout(1000L) {
            body()
        }
    } catch (e: TimeoutCancellationException) {
        println("Too long body execution")
        null
    }
}

suspend fun main() = runBlocking {
    val fastFunction = launch {
        val result = withTimeoutFunction {
            delay(500)
            "Fast function completed"
        }
        println(result)
    }

    val slowFunction = launch {
        val result = withTimeoutFunction {
            delay(100)
            "Slow function completed"
        }
        println(result)
    }

    fastFunction.join()
    slowFunction.join()
}

















