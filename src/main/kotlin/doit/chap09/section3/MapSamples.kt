package doit.chap09.section3

fun main() {
    val langMap: Map<Int, String> = mapOf<Int, String>(11 to "java", 22 to "kotlin", 33 to "scala")
    langMap.forEach { (k, v) -> println("key=$k, value=$v") }

    println("langMap[22] = ${langMap[22]}")
    println("langMap[22] = ${langMap.get(22)}")

    val mutableLangMap: MutableMap<Int, String> = mutableMapOf<Int, String>(12 to "java", 23 to "kotlin", 34 to "scala")
    mutableLangMap[45] = "js"
    mutableLangMap.remove(23)
    println(mutableLangMap)


    // hashmap
    println(hashMapOf<Int, String>(33 to "abc", 22 to "bcd", 11 to "cde"))
    // 키로 정렬되는 sorted map
    println(sortedMapOf<Int, String>(33 to "abc", 22 to "bcd", 11 to "cde"))
    // linkedHashMap
    println(linkedMapOf<Int, String>(33 to "abc", 22 to "bcd", 11 to "cde"))
}