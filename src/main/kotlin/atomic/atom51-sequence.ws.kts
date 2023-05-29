/*
sequence는 다른 함수형 언어의 스트림에 해당한다. (tmi : 자바의 스트림과 이름이 안 겹치려고 시퀀스로 했다)

 */

/*
list에 대한 연산은 매번 전체 요소에 대해 계산이 수행된다. (eager evaluation)
즉시 계산은 수평적 평가라고도 한다.
(1,2,3,4) -> (2,4) -> (4, 16) -> 4가 any에 true이므로 연산 종료
 */
listOf(1,2,3,4)
    .filter { it % 2 == 0 }
    .map { it * it }
    .any { it < 10 }

/*
sequence 에 대해서는 최종연산(toList, any 등) 일 때 lazy evaluation 된다.
지연 계산되며 수직적 평가라고도 한다.
1은 even연산에서 걸러지고 종료, 2에 대해 연산하고 바로 종료된다. 3,4는 아예 계산하지 않는다.

filter, map과 같은 중간연산은 새로운 sequence를 만들뿐 실제 연산은 발생하지 않는다.
대신 새 sequence는 지연된 모든 연산에 대한 정보를 저장해두고, 필요할 때만 저장해둔 연산을 실행한다.
*/
listOf(1,2,3,4)
    .asSequence()
    .filter { it % 2 == 0 }
    .map { it * it }
    .any { it < 10 }

// 무한 시퀀스에서 리스트 얻기
generateSequence(1) { it + 1 }.take(3).toList()

fun <T> T.takeIf(
    predicate: (T) -> Boolean
): T? {
    return if(predicate(this)) this else null
}

// 동일 내용을 if 문을 직접 사용할 수도 있겠으나 아래 방식이 더 함수형 표현이다.
generateSequence(5) { (it-1).takeIf { num -> num > 0 } }.toList()

