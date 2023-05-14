package doit.chap09.section2

fun main() {
    // 기본적으로 불변 리스트를 생성함
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val names: List<String> = listOf("one", "two", "three")
    val anys: List<Any> = listOf("Hello", 1, 2.455, 's')

    println("# numbers")
    for(number in numbers) {
        println(number)
    }

    println("# names")
//    for(name in names) println(name)
    for(index in names.indices) {
        println("names[$index] = ${names[index]}")
    }

    println("# anys")
    anys.forEach { a -> println(a) }
    anys.forEach(::println)

    // 빈 List 만들기. 형식 매개변수 필수.
    val emptyList: List<String> = emptyList<String>()
}