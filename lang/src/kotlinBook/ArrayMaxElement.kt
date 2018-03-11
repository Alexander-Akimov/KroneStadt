package kotlinBook

fun main(args: Array<String>) {
    println("Hello, world!")

    val persons = listOf(Person("Alice"), Person("Bob",age=29))

    val oldest = persons.maxBy {it.age ?: 0}
    println("The oldesst is: $oldest")
}

data class Person(val name: String, val age: Int? = null)