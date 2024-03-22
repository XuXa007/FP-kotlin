package functions

fun foundDis(price: Double, dis: Double) {
    val res = (price - (price * dis / 100))
    return println(String.format("%.2f", res))
}

fun main() {
    val priceIn = 234242341.23
//    val priceIn = readln().toFloat()
//    val disIn = readln().toFloat()
    val disIn = 15.5
    foundDis(priceIn, disIn)
}
