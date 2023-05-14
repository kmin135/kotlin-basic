package doit.chap09.section4

/*
요소의 검사
 */
fun main() {
    val numList = listOf(1, 2, 3, 4, 5, 6)
    val pairList = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val langMap = mapOf(1 to "java", 2 to "kotlin", 3 to "c++")

    println("#1 요소의 일치 여부 검사")
    println(numList.all { i -> i > 5 })
    println(numList.any { i -> i > 5 })

    println("#2 특정 요소의 포함 및 존재 여부 검사")
    println(numList.contains(2))
    println(2 in numList)
    println(langMap.contains(1))
    println(1 in langMap)
    println(numList.containsAll(listOf(1,2,3)))
    println(numList.none())
    println(numList.none { i -> i > 6 })

}