package doit.chap07.section2

enum class DayOfWeek(val num: Int) {
    MON(1), TUE(2), WED(3), THU(4),
    FRI(5), SAT(6), SUN(7)
}

fun main() {
    when(DayOfWeek.SUN.num) {
        1,2,3,4,5 -> println("weekday")
        6,7 -> println("weekend")
    }
}