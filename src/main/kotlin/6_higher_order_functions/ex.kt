package `6_higher_order_functions`


//fun <T, R> List<T>.map(transform: (T) -> R):
//        List<R> {
//    val result = mutableListOf<R>()
//    for (item in this) {
//        result.add(transform(item))
//    }
//    println(result)
//    return result
//}

//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val squaredNumbers = numbers.map { it * it }
//    println(squaredNumbers) // [1, 4, 9, 16, 25]
//}


//fun add(a: Int): (Int) -> Int {
//    return { b -> a + b }
//}
//fun main(){
//    val add5 = add(5)
//    println(add5(3)) // 8
//}


//задание: сделать 2 ф высшего порядка, где одна будет принимать ф в качестве аргумента (ф расширения)
// вторая будет возвращать др ф в качетсве результата (самостоятельная)

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

    // Вызов функции createCheck с функцией-трансформером
    val calculateFinalPrice = createCheck(price, count) { it - 50 }

    // Вызов функции createName
    val displayName = createName(str)
    displayName()
    println("Final Price: $calculateFinalPrice")
}




