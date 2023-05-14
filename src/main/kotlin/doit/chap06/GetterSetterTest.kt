package doit.chap06

class User(val id: Int, var name: String, var age: Int)

class User2(_id: Int, _name: String) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            println("custom name setter called $value")
            field = value
        }
}

fun main() {
    val user = doit.chap06.User(1, "sean", 30)
    val name = user.name
    user.age = 41
    println("name: $name, ${user.age}")

//    user.id = 2

    val u2 = doit.chap06.User2(2, "bob")
    u2.name = "john"
    println("${u2.id} / ${u2.name}")
}