package ktor

/*
задание: сделать 2 ф высшего порядка, где одна будет принимать ф в качестве аргумента (ф расширения)
вторая будет возвращать др ф в качетсве результата (самостоятельная)
*/

fun createCheck(price: Int, count: Int, transform: (Int) -> Int): Int {
    val transformedPrice = transform(price) * count
    return transformedPrice
}

fun createName(str: String): () -> Unit {
    return {
        println("Name: $str")
    }
}

fun main() {
    val str = "Wine"
    val count = 3
    val price = 300

    val calculateFinalPrice = createCheck(price, count) { it - 50 }

    val displayName = createName(str)
    displayName()
    println("Final Price: $calculateFinalPrice")
}



