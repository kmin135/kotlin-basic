package etc

fun String.singleQuote() = "'$this'"

fun main() {
    println("abc".singleQuote())
}