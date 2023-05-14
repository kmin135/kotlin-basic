package etc

import kotlin.text.Typography.times

fun String?.isNullOrEmpty(): Boolean = this == null || this.isEmpty()

fun main() {
    val iamnull: String? = null

    println(iamnull.isNullOrEmpty())
}