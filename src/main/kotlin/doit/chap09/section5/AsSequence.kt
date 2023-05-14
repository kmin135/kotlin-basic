package doit.chap09.section5

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    val listSeq = list.asSequence()
        .map { println("map[$it]"); it * it }
        .filter { println("filter[$it]"); it % 2 == 0 }
        .toList()
    println(listSeq)
}