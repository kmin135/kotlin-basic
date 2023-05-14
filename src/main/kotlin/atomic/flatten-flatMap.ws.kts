import kotlin.random.Random

enum class Suit {
    Spade, Club, Heart, Diamond
}

enum class Rank(val faceValue: Int) {
    Ace(1), Two(2), Three(3), Four(4), Five(5),
    Six(6), Seven(7), Eight(8), Nine(9), Ten(10),
    Jack(11), Queen(12), King(13)
}

data class Card(val suit: Suit, val rank: Rank)

val allCards = Suit.values().flatMap {suit ->
    Rank.values().map {
        Card(suit, it)
    }
}
println("카드는 총 ${allCards.size} 개 입니다.")
println(allCards)

println("7장의 카드를 분배합니다.")
repeat(7) {
    println("${it+1}번째 카드 : ${allCards.random()}")
}

