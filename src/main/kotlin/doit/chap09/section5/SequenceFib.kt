package doit.chap09.section5

fun main() {
    val pair = 1 to 1
    val p2 = Pair(1,1)

    val fibonacci = generateSequence(Pair(1, 1)) { it.second to it.first + it.second }
        .map { it.first }

    println(fibonacci.take(10).toList())
}