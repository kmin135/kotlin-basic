var factor = 2
var doubled = listOf(1,2).map { it * factor }
var doubledAlso = sequenceOf(1,2).map { it * factor }
factor = 0
// 2 4
doubled.forEach(::println)
// 0 0, 시퀀스는 실행시점에 평가되기 때문인듯.
doubledAlso.forEach(::println)