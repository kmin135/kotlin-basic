val list = listOf('a', 'b', 'c', 'd')

list.zipWithNext()

list.zipWithNext { ch1, ch2 -> "$ch1$ch2" }

val list2 = listOf(
    listOf(1,2),
    listOf(3,4),
    listOf(5,6)
)

list2.flatten()

class Book(
    val title: String,
    val authors: List<String>
)

val books = listOf(
    Book("t1", listOf("a1", "a2")),
    Book("t2", listOf("a3"))
)

books.map { it.authors }.flatten()
// flatMap = map * flatten
books.flatMap { it.authors }

