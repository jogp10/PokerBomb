import com.pockerbomb.Card
import com.pockerbomb.Deck
import com.pockerbomb.Hand
import com.pockerbomb.Rank
import com.pockerbomb.Suit
import spock.lang.Specification

class TwoPairsHandSpockTest extends Specification {
    def 'Two Pairs com.pockerbomb.Hand 1'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.TWO)
        Card card2 = new Card(Suit.HEART, Rank.TWO)
        Card card3 = new Card(Suit.CLUB, Rank.SIX)
        Card card4 = new Card(Suit.DIAMOND, Rank.SIX)
        Card card5 = new Card(Suit.DIAMOND, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.Hand 2'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.FOUR)
        Card card2 = new Card(Suit.CLUB, Rank.FOUR)
        Card card3 = new Card(Suit.DIAMOND, Rank.FIVE)
        Card card4 = new Card(Suit.SPADE, Rank.JACK)
        Card card5 = new Card(Suit.DIAMOND, Rank.JACK)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.Hand 3'() {
        given:
        Card card1 = new Card(Suit.SPADE, Rank.THREE)
        Card card2 = new Card(Suit.CLUB, Rank.KING)
        Card card3 = new Card(Suit.DIAMOND, Rank.KING)
        Card card4 = new Card(Suit.CLUB, Rank.ACE)
        Card card5 = new Card(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.Hand 4'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.TWO)
        Card card2 = new Card(Suit.HEART, Rank.TWO)
        Card card3 = new Card(Suit.CLUB, Rank.SIX)
        Card card4 = new Card(Suit.DIAMOND, Rank.SIX)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }
}
