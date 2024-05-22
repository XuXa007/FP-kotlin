package for_me

import sun.java2d.marlin.DPathConsumer2D

//class Person(val lastNane: String, val firstName: String) {
//    var age: Int = 0
//    fun greet() {
//        println("Hello, my name is $firstName $lastNane and I am $age years old.")
//    }
//}

//fun main() {
//    val person = Person("John", "Doe")
//    person.age = 30
//    person.greet()
//}

open class Base() {
    open var number: Int = 10
}

class DerivedClass :Base() {
    override var number: Int = 30
}

//fun main() {
//    val instance = Base()
//    println(instance.number) // 20
//    instance.number = 40
//    println(instance.number) // 30
//}

open class Animal() {
    open fun sound() {
        println("Animal makes a sound")
    }
}

class Dog() : Animal() {
    override fun sound() {
        println("Dog barks")
        super.sound()
    }
}

//fun main() {
//    val dog = Dog()
//    dog.sound()
//}



open class AnimalName(private val name: String) {
    init {
        println("Animal is created: $name")
    }
}

class DogName(name: String) : AnimalName(name){
    init {
        println("Dog is created: $name")
        println()
    }
}

//fun main() {
//    DogName("manya")
//}

open class Animal2 {
    open fun makeSound(volume: Int) {
        println("Animal makes sound at volume $volume")
    }
}

class Dog2 : Animal2() {
    override fun makeSound(volume: Int) {
        super.makeSound(volume) // Вызов метода суперкласса с параметрами
        println("Dog barks at volume $volume")
    }
}

//fun main() {
//    val dog = Dog2()
//    dog.makeSound(10)
//}