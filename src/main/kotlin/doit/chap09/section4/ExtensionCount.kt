package doit.chap09.section4

/*
요소의 처리와 집계
 */
fun main() {
    val numList = listOf(1, 2, 3, 4, 5, 6)
    val pairList = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val langMap = mapOf(1 to "java", 2 to "kotlin", 3 to "c++")

    println("#1 요소의 순환")
    numList.forEach { num -> print("$num ") }
    numList.forEachIndexed { i, v -> println("numList[$i] : ${numList[i]} (same to $v)") }
    // onEach : 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    println("onEach")
    numList.onEach { i -> print("on $i") }.forEach { i -> print("f $i") }

    println("#2 요소의 개수")
    println(numList.count())
    println(numList.count { i -> i > 3 })

    println("#3 최대 최소")
    println(numList.max())
    println(langMap.maxBy { entry -> entry.key }) // 맵의 키를 기준으로 최대값

    println("#4 각 요소에 정해진 식 적용하기 (fold, reduce)")
    println(numList.fold(10) { accumulator, i -> accumulator + i }) // 10 + 1 + 2 + ... + 6 = 31
    println(numList.foldRight(5) { accumulator, i -> accumulator + i }) // 5 + 6 + 5 + ... + 1 = 26, 순서를 반대로
    println(numList.reduce{acc, i -> acc * i}) // 1 * 2 * ... * 6 = 720, fold와 달리 초기값 없음

    println("#5 모든 요소 합산")
    println(pairList.sumOf { it.second })
}