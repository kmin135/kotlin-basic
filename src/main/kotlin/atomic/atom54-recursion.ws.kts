tailrec fun factorial(n: Long): Long {
    if(n <= 1) return 1
    return n * factorial(n - 1)
}

factorial(5)

/*
재귀 함수의 단점 : stacktrace 의 과도한 증가

극복방법1 : 반복문으로 작성한다.
- 한계점 : 상태를 저장하기 위한 가변 변수를 사용해야함. 함수형 프로그래밍에서는 지양하는 방식

극복방법2 : 꼬리 재귀를 사용하여 호출 스택의 크기를 줄인다.
꼬리재귀를 사용하려면 재귀가 마지막 연산이어야한다.
= 재귀 함수가 자기 자신을 호출해 얻은 결과값을 아무 연산도 적용하지 않고 즉시 반환해야함
꼬리재귀는 조건을 만족할 경우 재귀 호출을 이터레이션으로 변환해 호출 스택 비용을 제거해줌

참고: tailrec 조건을 만족하지 않아도 에러는 안나고 경고 메시지만 뜬다. (NO_TAIL_CALLS_FOUND)
"A function is marked as tail-recursive but no tail calls are found"
 */

fun sumSimpleRecursion(n: Long): Long {
    if(n == 0L) return 0L
    return n + sumSimpleRecursion(n-1)
}

fun sumIteration(n: Long): Long {
    var acc = 0L
    for (i in 1..n) {
        acc += i
    }
    return acc
}

// tailrec 의 조건을 만족하기 위해 acc 를 파라미터로 두었다.
tailrec fun sumTailrec(n: Long, acc: Long): Long {
    return if (n == 0L) acc else sumTailrec(n-1, acc + n)
}

sumTailrec(100000, 0)

/*
재귀의 성능이 매우 느림을 보일 때 사용하는 피보나치 수열도 꼬리재귀를 이용하면 매우 빨라진다.
아래 예제는 지역함수 없이 디폴트 인자값으로 구현할 수도 있겠으나
이 경우 curr, next에 엉뚱한 값을 주면 의도하지 않은 결과를 얻을 수 있으므로
내부 구현을 숨기기 위해 지역함수를 이용한 케이스이다.
역시 tailrec 의 조건을 만족하기 위해 중간결과를 연산하기 위한 파라미터들이 추가되었다.
 */
fun fibonacci(n: Int): Long {
    tailrec fun fibonacci(n: Int, curr: Long, next: Long): Long {
        return if(n==0) curr else fibonacci(n-1, next, curr + next)
    }
    return fibonacci(n, 0L, 1L)
}

fibonacci(50)
