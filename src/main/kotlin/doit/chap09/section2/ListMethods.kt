package doit.chap09.section2

fun main() {
    val names = listOf("one", "two", "three")

    println(names.size)
    println(names.get(0))
    println(names[0])
    println(names.indexOf("three"))
    println(names.contains("two"))
}