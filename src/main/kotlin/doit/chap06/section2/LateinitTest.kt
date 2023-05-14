package doit.chap06.section2


class Person {
    lateinit var name: String

    fun test() {
        if(::name.isInitialized) {
            println("초기화됨")
        } else {
            println("초기화 안 됨")
        }
    }
}

fun main() {
    val kd = doit.chap06.section2.Person()
    kd.test()
    kd.name = "Kildong"
    kd.test()
    println("name = ${kd.name}")
}