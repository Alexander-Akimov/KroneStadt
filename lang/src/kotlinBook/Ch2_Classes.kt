package kotlinBook

import kotlinBook.geometry.shapes.Rectangle

data class Person(val name: String, val age: Int? = null)

class PersonObj(val name: String, var isMarried: Boolean)



fun main(args: Array<String>) {
///////////////
    val person = PersonObj("Bob", true)

    println(person.name)

    println(person.isMarried)
//////////////////////////
    val rectangle = Rectangle(41, 43)
//rectangle.isSquare = null
    println(rectangle.isSquare)
}