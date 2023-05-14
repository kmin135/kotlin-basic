package etc

fun main() {
    val transform: (String) -> Int? = { s -> s.toIntOrNull() }

    val x = listOf("112", "abc")
    println(x.mapNotNull(transform))
}