import java.util.*

data class Person(val firstName: String, val age: Int)

val people = listOf(
    Person("Sara", 12),
    Person("Jill", 51),
    Person("Paula", 23),
    Person("Paul", 25),
    Person("Mani", 12),
    Person("Jack", 70),
    Person("Sue", 10),
)

val upperNames = people.filter { it.age > 20}
    .map { it.firstName }
    .map { it.uppercase(Locale.getDefault()) }

// 이름 concat 다양한 버전
upperNames.reduce { names, name -> "$names, $name" }
upperNames.joinToString(separator = ", ")

// total age 얻기의 다양한 버전
people.map { it.age }.reduce { acc, i -> acc + i }
people.map { it.age }.sum()
people.sumOf { it.age }

// 위와 같이 가능하면 특화된 메서드를 쓰는게 가독성이 좋음