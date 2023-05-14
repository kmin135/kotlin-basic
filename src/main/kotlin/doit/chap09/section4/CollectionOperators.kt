package doit.chap09.section4

/*
컬렉션의 확장함수 - 연산자 기능의 메서드들 (더하기, 빼기 등)
 */
fun main() {
    val list1 = listOf("one", "two", "three")
    val list2 = listOf(1, 2, 2, 3, 4)
    val map1 = mapOf<String, Int>("hi" to 1, "hello" to 2, "Goodbye" to 3)

    println("# list")
    println("요소 추가 : ${list1 + "four"}")
    println("요소 추가2 : ${list2 + 5}")
    println("두 리스트 병합 : ${list2 + listOf(5,6,7)}")
    println("요소의 제거 (첫번째 일치하는 요소 제거) : ${list2 - 2}")
    println("일치하는 요소들 제거 (이건 2가 2개 모두 지워짐) : ${list2 - listOf(2, 3, 4, 5)}")
    println("# map")
    println("Pair()를 이용한 Map요소 추가 : ${map1 + Pair("Byte", 4)}")
    println("일치하는 key 제거 : ${map1 - "hello"}")
    println("두 map 병합 ${map1 + mapOf("Apple" to 4, "Orange" to 5)}")
    println("일치하는 모든 key 제거 : ${map1 - listOf("hi", "hello")}")
}