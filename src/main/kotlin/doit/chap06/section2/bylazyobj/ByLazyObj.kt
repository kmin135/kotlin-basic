package doit.chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isInit = false

    val person: Person by lazy {
        isInit = true
        Person("kim", 23)
    }

    val personDelegate = lazy { Person("Hong", 30) }

    println("person init : ${isInit}")
    println("personDelegate int : ${personDelegate.isInitialized()}")

    println("${person.name}")
    println("${personDelegate.value.name}")

    println("person init : ${isInit}")
    println("personDelegate int : ${personDelegate.isInitialized()}")
}