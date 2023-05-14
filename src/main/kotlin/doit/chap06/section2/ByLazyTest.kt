package doit.chap06.section2

class LazyTest {
    init {
        println("init block")
    }

    val subject: String by lazy {
        println("lazy init")
        "Kotlin Programming"
    }

    fun flow() {
        println("not init yet")
        println("subject one: $subject") // 최초 사용시점에 초기화
        println("subject two: $subject")
    }
}

fun main() {
    val lt = doit.chap06.section2.LazyTest()
    lt.flow()
}