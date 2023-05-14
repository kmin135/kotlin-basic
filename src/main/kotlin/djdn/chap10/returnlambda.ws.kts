val names = listOf("Pam", "Pat", "Paul", "Paula")
println(names.find { str -> str.length == 4 })
println(names.find { str -> str.length == 5 })

fun predicateLength(len: Int): (String) -> Boolean {
    return { input: String -> input.length == len}
}

println(names.find (predicateLength(4) ))

fun predicateLengthShort(len: Int) = { input: String -> input.length == len}

println(names.find(predicateLengthShort(5)))