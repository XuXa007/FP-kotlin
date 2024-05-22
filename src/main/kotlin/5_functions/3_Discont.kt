package `5_functions`

fun foundDis(price: Double, dis: Double) {
    val res = (price - (price * dis / 100))
    return println(String.format("%.2f", res))
}

fun main() {
    val priceIn = 100.0
//    val priceIn = readln().toFloat()
//    val disIn = readln().toFloat()
    val disIn = 15.0
    foundDis(priceIn, disIn)
}

