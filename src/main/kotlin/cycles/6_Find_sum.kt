package cycles

fun main() {
    var b = 5
    var c = 5
    while (b < 57) {
        b++
        if ((b == 34) or (b == 46) or (b == 52)) {
            continue
        } else {
            c += b
        }
    }
//    println("b: ${b}")
    println("c: ${c}")

//    println(1511)
}