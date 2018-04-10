package kotlinBook

fun main(args: Array<String>) {

    println(max(3,4))
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"

    println("Hello, $name!")
    println("\$name")
}

fun max(a: Int, b: Int) = if (a > b) a else b