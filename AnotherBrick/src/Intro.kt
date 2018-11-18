import lib.generics.Map

data class Person(val name: String, val age: Int? = null)


fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", null), Person("Bob", age = 29))

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
}

