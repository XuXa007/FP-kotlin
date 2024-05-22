package for_me

fun cal(x: Int, y:Int, oper: (Int, Int) -> Int):Int {
    return oper(x,y)
}

fun main() {
    val sum = cal(5,3) {a,b -> a+b} // лямбда
    println("sum: $sum")

    // встроенные map filter
    val numbs = listOf(1,2,3,4,5,6)
    val doub = numbs.map { it*2 }
    val evenNum = numbs.filter { it%2 == 0 }
    println(doub)
    println(evenNum)

    zamikanie()

}

// замыкание , когда лямбда-выражение захватывает переменные из окружающего контекста

fun zamikanie() {
    var sum = 10
    val numers = listOf(1,2,3,4,5,6)
    numers.forEach{sum += it}
    println(sum)
}

fun neskolko_strok_lambda() {
    val printMess = {
        message : String ->
        println("Mess")
        println(message)
    }
}

