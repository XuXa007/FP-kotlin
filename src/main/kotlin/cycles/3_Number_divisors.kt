package cycles

fun main() {
    val a = readln().toInt()
    for (i in 1..a) {
        if (a%i == 0) {
            if (i == a) {
                print("${i}")
            } else {
                print("${i}, ")
            }
        }
    }
}