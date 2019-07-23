package lib.generics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

data class Person(val name: String, val age: Int? = null)


fun main(args: Array<String>) {
    /*val persons = listOf(Person("Alice", null), Person("Bob", age = 29))

    val oldest = persons.maxBy { if (it.age == null) 0 else it.age }
    val oldest2 = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")

    var myList = Map<Person, Int>()

    myList.getValue(persons)

    val funnyList = List<Int>(3) { _ -> 0 }

    val aSuchSillyList = mutableListOf<Int>()

    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))

    val authors = listOf("Dmitry", "Svetlana")
    val readers = mutableListOf<String>("Dmitry", "Stepan")

    val result = readers.filter { it !in authors }

    println(result)

    doWork();*/

    GlobalScope.launch { // launch new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}

