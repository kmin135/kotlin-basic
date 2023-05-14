package doit.chap07.section2

sealed class Result {
    open class Success(val msg: String): Result()
    class Error(val code: Int, val msg: String): Result()
}

// 실드 클래스 상속은 같은 파일내에서만 가능
class Status: Result()
class Inside: Result.Success("Status")

fun eval(result: Result): String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.msg
    is Result.Error -> "${result.code} : ${result.msg}"
    // 모든 조건을 가지므로 else가 필요 없음
}

fun main() {
    println(eval(Result.Success("Good")))
    println(eval(Result.Error(400, "Not Good")))
    println(eval(Status()))
}