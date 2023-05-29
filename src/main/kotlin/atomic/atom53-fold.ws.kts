/*
fold는 순수 함수형 언어에서 값을 누적시키는 유일한 방법으로 중요 개념
코틀린에서는 for 도 있으니 for를 사용하기도 함
 */

val list = listOf(1, 10, 100, 1000)
list.sum()
list.fold(0) { acc, current -> acc + current }
// reduce는 첫 번째 원소를 초기값으로 사용하는 fold의 단축표현
list.reduce { acc, current -> acc + current }
// runningReduce 는 fold 과정에서 계산되는 모든 중간 단계 값을 포함하는 list를 만듬
list.runningReduce { acc, current -> acc + current }

// 위의 fold를 풀어쓰면 아래와 유사하다
var accumulator = 0
val operation = { sum: Int, current: Int -> sum + current }
for(i in list) {
    accumulator = operation(accumulator, i)
}
println(accumulator)


val alphabets = listOf('a', 'b', 'c', 'd')
alphabets.fold("*") { acc, element -> "($acc) + $element" }
alphabets.foldRight("*") { element, acc -> "$element + ($acc)" }

