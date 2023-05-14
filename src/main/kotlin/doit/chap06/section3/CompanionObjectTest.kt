package doit.chap06.section3

class Person {
    var id: Int = 0
    var name: String = "john"
    companion object {
        var lang: String = "Kor"
        fun work() {
            println("working")
        }
    }
}

fun main() {
    println(Person.lang)
    Person.work()
    Person.lang = "Eng"
    println(Person.lang)
//    println(Person.name)  // name은 컴패니언 객체가 아니라 오류
}