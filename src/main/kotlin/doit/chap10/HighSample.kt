package doit.chap10


fun inc(x: Int): Int {
    return x + 1
}

fun high(name: String, body: (Int)->Int): Int {
    println("name : $name")
    val x = 0
    return body(x)
}

fun main() {
    val res = high("Kwon", {x -> inc(x)})
    val res2 = high("Kwon", {inc(it)})
    println(res)
    println(res)
}