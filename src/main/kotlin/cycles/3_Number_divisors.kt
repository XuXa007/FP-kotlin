package cycles

import java.math.BigInteger
import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val number: BigInteger = scanner.nextBigInteger()
    var test = BigInteger.ONE
    while (test <= number) {
        if (number % test == BigInteger.ZERO) {
            if (number == test) {
                print(test)
            } else {
                print("$test, ")

            }
        }
        test++
    }
    scanner.close()
}
