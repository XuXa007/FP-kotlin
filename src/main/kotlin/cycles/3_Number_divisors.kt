package cycles

import java.math.BigInteger
import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val number: BigInteger = scanner.nextBigInteger()
    var i = BigInteger.ONE
    while (i <= number) {
        if (number % i == BigInteger.ZERO) {
            if (number == i) {
                print(i)
            } else {
                print("$i, ")

            }
        }
        i++
    }
    scanner.close()
}
