package etc

class Counter {
    var value: Int = 0
        private set
    fun inc() = value++
}

fun main() {
    val c = Counter()
    println(c.value)

    repeat(10) {
        c.inc()
    }
    println(c.value)
}