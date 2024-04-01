package arrays_of_data

fun main() {
    val ar = mutableListOf<Int>()
    ar.addAll(listOf(8, 21, 5, 90, 11, 0))
    ar.add(0, 90)
    ar.removeAt(4)
//    ar.add(ar.size, -35)
    ar.add(-35)
    for (i in ar) print("$i ")
}