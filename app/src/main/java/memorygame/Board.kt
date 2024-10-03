package memorygame
import android.util.Log

class Board( ) {
    //Constructor to create board of different sizes.
    // Assign
    private val availableCards = arrayOf<Card>(Card('s', "4"), Card('h', "10"), Card('d', "3"))
    private var cards: Array<Card> = Array<Card>(6) {_ -> Card(' ',"")}

    init {
        for(i in 0..2) {
            Log.d("MemoryBoard", "${2*i}, ${(2*i)+1}")
            cards[2*i] = availableCards.random()
            cards[(2*i)+1] = cards[2*i]
        }
        cards.shuffle()
    }

    fun getValueAt(index:Int): Card {
        return cards[index]
    }

    data class Card(val suit: Char, val rank: String) {

    }
}