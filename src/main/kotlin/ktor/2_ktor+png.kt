package ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.*
import java.io.File

fun main() {
    val client = HttpClient(CIO)
//    val urls = listOf(
//        "https://klkfavorit.ru/wp-content/uploads/f/7/e/f7edfaf9261573a3557c06c37d1da21b.jpeg",
//        "https://laplaya-rus.ru/wp-content/uploads/a/4/0/a40ce98be1ba83423a28acf8b5c2d0b5.jpeg",
//        "https://ferret-pet.ru/wp-content/uploads/6/b/5/6b5f022448da0963245cbf3e0878dd0d.jpeg",
//        "https://flomaster.top/uploads/posts/2023-01/1673477911_flomaster-club-p-syurrealizm-risunki-vkontakte-8.jpg",
//        "https://klike.net/uploads/posts/2023-02/1675234996_3-35.jpg",
//        "https://flomaster.top/uploads/posts/2023-01/1673477911_flomaster-club-p-syurrealizm-risunki-vkontakte-8.jpg",
//    )

    val urls = List(100) { "https://picsum.photos/200/300?random=${it + 1}" }

    val downloadsDir = File("downloads_2")
    if (!downloadsDir.exists()) {
        downloadsDir.mkdir()
    } else {
        downloadsDir.listFiles()?.forEach { it.delete() }
    }
    runBlocking {
        val deferredImages = urls.mapIndexed { index, url ->
            async {
                try {
                    val imageBytes = client.get(url).body<ByteArray>()
                    val fileName = "downloads_2/image${index + 1}.jpg"
                    File(fileName).writeBytes(imageBytes)
                    println("Successfully downloaded $fileName")
                } catch (e: Exception) {
                    println("Failed to download image from $url: ${e.message}")
                }
            }
        }
        deferredImages.awaitAll()
    }

    client.close()
}
