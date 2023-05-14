package doit.chap09.section2

/*
가변형 List 얻기
arrayListOf, mutableListOf 모두 동일하게 ArrayList 임
 */
fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("hello", "kotlin")
    stringList.add("Java")

    println(stringList)

    val stringList2: MutableList<String> = mutableListOf<String>("iam", "mutable")
    stringList2.add("Scala")

    println(stringList2)
}