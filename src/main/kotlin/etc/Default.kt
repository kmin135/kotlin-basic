package etc

class Default {
    var i:Int = 0
        get() {
            println("get()")
            return field
        }
        set(value) {
            println("set $value")
            field = value
        }
}

fun main() {
    val d = Default()
    println(d.i)
    d.i = 10
    println(d.i)
}