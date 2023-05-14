package doit.chap08.section1

class Box<T>(t: T) {
    var name = t
}

fun main() {
    var box1 = Box(1)   // Box<Int> 로 추론
    var box2: Box<String> = Box<String>("Hello")
    println(box1.name)
    println(box2.name)
}