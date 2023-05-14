val pair = listOf("a", "bb", "ccc", "dddd").partition {
    str -> str.length <= 2
}

pair.first
pair.second

data class Person(
    val name: String,
    val age: Int
)

val names = listOf("A1", "A2", "B1", "B2", "B3", "C1", "C2", "F1", "R1")
val ages = listOf(21, 15, 25, 25, 42, 21, 42, 21 ,33)

val people: List<Person> = names.zip(ages) {
    name, age -> Person(name, age)
}
people

val peopleByAge: Map<Int, List<Person>> = people.groupBy { person -> person.age }
peopleByAge.forEach { (age, people) ->
    println("people of age $age : ")
    println(people.joinToString(separator = ","))
}

people.associateBy { it.age }
people.associateWith { it.age }

val even = mapOf(2 to "two", 4 to "four")
even.mapKeys { (key, _) -> -key }
    .mapValues { (_, value) -> "minus $value" }

