package doit.chap10

import kotlin.random.Random

/*
java.util.Random 이 있지만 이는 JVM에 특화된 난수 생성
코틀린은 멀티 플랫폼에서 사용 가능한 전용 Random 구현 제공
 */
fun main() {
    Random.nextInt(21).let(::println)
}