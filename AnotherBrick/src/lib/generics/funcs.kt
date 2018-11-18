package lib.generics

fun <T> List<T>.sliceMe(indices: IntRange): List<T> =
     mutableListOf<T>()
