// 익명함수
fun first(): (Int) -> Int {
    return fun(i: Int) = i + 1
}

// 람다
fun second(): (String) -> String {
    return { s -> "$s!"}
}

// 지역함수에 대한 참조
fun third(): () -> String {
    fun greet() = "Hi!"
    return ::greet
}

// third와 동일하나 식 본문으로 간결하게 표현
fun fourth() = fun() = "Hi!"

// 람다를 식 본문 함수에 사용해 같은 효과
fun fifth() = { "Hi!" }

first()(5)
second()("kotlin")
third()()
fourth()()
fifth()()

