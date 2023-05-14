package doit.chap10

fun main() {
    val firstName: String? = null
    val lastName: String = "last"

    firstName?.let { print("$it $lastName") } ?: print("$lastName")
}