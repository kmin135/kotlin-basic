package doit.chap09.section3

fun main() {
    // 헬퍼함수를 이용한 생성
    println(setOf<Int>(7,1,3,5,5))  // 기본구현체로 linkedHashSet. 버전마다 달라질 지도?
    println(hashSetOf<Int>(7,1,3,5,5))  // hashset 헬퍼. 변경, 검색 특화
    println(sortedSetOf<Int>(7,1,3,5,5))  // treeset(이진트리를 개선한 레드블랙트리 사용) 헬퍼. 검색, 정렬 특화
    println(linkedSetOf<Int>(7,1,3,5,5))  // linkedHashSet 헬퍼. 순서 유지. 성능은 낮음.

    // 가변 Set
    val mutableSet = mutableSetOf<String>("a", "b", "c")
    mutableSet.add("d")
    mutableSet.remove("a")
    println(mutableSet)
}