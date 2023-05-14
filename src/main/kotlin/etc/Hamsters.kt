package etc

class Hamsters(val name: String)

class Cage(private val maxCapa: Int) {
    private val hamsters = mutableListOf<Hamsters>()
    // 프로퍼티 방식. val이므로 set은 호출할 수 없다.
    val capa:Int
        get() = maxCapa - hamsters.size

    fun isFull(): Boolean {
        return maxCapa == hamsters.size
    }

    fun put(hamster: Hamsters): Boolean {
        return when(isFull()) {
            true -> false
            false -> {
                hamsters += hamster
                return true
            }
        }
    }

    // 익숙한 함수 방식
    fun capa(): Int {
        return maxCapa - hamsters.size
    }
}

fun main() {
    val c = Cage(2)
    println(c.capa)
    println(c.capa())
    c.put(Hamsters("햄돌이"))
    println(c.capa)
    println(c.capa())
}