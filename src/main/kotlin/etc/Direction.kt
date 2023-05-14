package etc

enum class Direction(val notation: String) {
    North("N"), South("S"), East("E"), West("W");

    val opposite: Direction
        get() = when(this) {
            North -> South
            South -> North
            East -> West
            West -> East
        }
}

fun main() {
    println(Direction.North.notation)
    println(Direction.North.opposite.notation)
}