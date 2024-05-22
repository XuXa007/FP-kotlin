package ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.*
import java.io.File

fun main() {
    val client = HttpClient(CIO)
    val urls = List(100) { "https://picsum.photos/200/300?random=${it + 1}" }
    val downloadsDir = File("downloads_1")
    if (!downloadsDir.exists()) {
        downloadsDir.mkdir()
    } else {
        downloadsDir.listFiles()?.forEach { it.delete() }
    }

    /*
    runBlocking - для запуска корутин в основном потоке, блокируя его до завершения всех задач внутри этого блока.
    withContext и Dispatchers.Default - для переключения контекста выполнения на Dispatchers.Default, что
    позволяет выполнять задачи в фоновом потоке.
    async - создает асинхронную задачу, которая возвращает Deferred
    await - используется для получения результата выполнения этой задачи
    */

    runBlocking {
        val images = withContext(Dispatchers.Default) {
            /*
            отвечает за определение потока(ов), на котором будут выполняться корутины
            Он использует общий пул потоков, который создается на основе количества доступных процессорных ядер

            Dispatchers.IO: Оптимизирован для задач ввода-вывода, таких как чтение и запись файлов,
            Dispatchers.Main: Используется для выполнения задач в главном (UI) потоке
            Dispatchers.Unconfined: Запускает корутину в текущем потоке, но только до первой приостановки
            */
            urls.map { url ->
                /*
                Для каждого URL создается асинхронная задача, которая выполняет HTTP GET
                запрос и возвращает тело ответа в виде массива байтов
                */
                async {
                    client.get(url).body<ByteArray>()
                }
            /*
            ожидается завершение всех асинхронных задач и получение результатов
            */
            }.map { it.await() }
        }
        images.forEachIndexed { index, image ->
            File("downloads_1/image${index + 1}.jpg").writeBytes(image)
        }
    }

    client.close()
}
