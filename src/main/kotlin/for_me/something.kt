//package for_me
//
//import java.awt.print.Book
//import javax.sound.sampled.Port
//
//class Person {
//    var name: String = "John"
//        get() = field // Поле field используется для доступа к значению
//        set(value) {
//            field = value
//        }
//
//    val isAdult: Boolean
//        get() = age >= 18 // Только геттер, поскольку свойство val
//
//    var age: Int = 0
//        set(value) {
//            if (value >= 0) {
//                field = value
//            }
//        }
//}
//
//
////fun main() {
////    val p = Person("","")
////    p.age
////    p.firstName
////    p.lastNane
////}
//
//// вложенное расширение
//
////class Host(val hostName: String) {
////    fun printHostName() {
////        println("Hostname: $hostName")
////    }
////
////    // расширение для класса Connection
////    inner class Connection(val port: Int) {
////        fun printConnectionInfo() {
////            println("Connection to $hostName on port $port")
////            this@Host.printHostName() //вызов метода диспетчера приемников
////        }
////    }
////}
////
////fun main() {
////    val  host = Host("example.exe")
////    val connection = host.Connection(443)
////    connection.printConnectionInfo()
////}
//
//class Library(val name: String) {
//    fun printLibraryName() {
//        println("Library name: $name")
//    }
//
//    // Функция-расширение для класса Book, объявленная внутри класса Library
//    fun Book.printBookInfo() {
//        println("Book title: $title")
//        // Обращение к методу Library (диспетчер приёмников)
//        this@Library.printLibraryName()
//    }
//}
//class Book(val title: String)
//
//fun main() {
//    val library = Library("City Library")
//    val book = Book("Kotlin for Beginners")
//
//    // Вызов функции-расширения printBookInfo
//    library.printBookInfo(book)
//}