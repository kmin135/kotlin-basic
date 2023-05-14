package doit.chap10

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/*
람다식 코드의 시간 측정을 위한 표준 라이브러리 함수
 */
fun main() {
    val numList = (1..100000).toList()

    measureTimeMillis {
        numList
            .map { it + 1 }
            .first { it % 1000 == 0 }
    }.let(::println)

    measureNanoTime {
        numList
            .map { it + 1 }
            .first { it % 1000 == 0 }
    }.let(::println)
}