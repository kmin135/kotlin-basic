package doit.chap06.section2

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("NONAME") {
        property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main() {
    val u = doit.chap06.section2.User()
    u.name = "Kildong"
    u.name = "John"
}