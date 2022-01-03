import com.pockerbomb.Card
import com.pockerbomb.Deck
import com.pockerbomb.Hand
import com.pockerbomb.Rank
import com.pockerbomb.Suit
import spock.lang.Specification

class ThreeOfAKindHandSpockTest extends Specification {
    def 'Three of a Kind com.pockerbomb.Hand 1'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.FOUR)
        Card card2 = new Card(Suit.HEART, Rank.FOUR)
        Card card3 = new Card(Suit.CLUB, Rank.FOUR)
        Card card4 = new Card(Suit.SPADE, Rank.SEVEN)
        Card card5 = new Card(Suit.SPADE, Rank.QUEEN)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.Hand 2'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.THREE)
        Card card2 = new Card(Suit.CLUB, Rank.TEN)
        Card card3 = new Card(Suit.DIAMOND, Rank.TEN)
        Card card4 = new Card(Suit.HEART, Rank.TEN)
        Card card5 = new Card(Suit.SPADE, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.Hand 3'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.SEVEN)
        Card card2 = new Card(Suit.HEART, Rank.NINE)
        Card card3 = new Card(Suit.SPADE, Rank.ACE)
        Card card4 = new Card(Suit.CLUB, Rank.ACE)
        Card card5 = new Card(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.Hand 4'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.FOUR)
        Card card2 = new Card(Suit.HEART, Rank.FOUR)
        Card card3 = new Card(Suit.CLUB, Rank.FOUR)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.Hand 5'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.THREE)
        Card card2 = new Card(Suit.CLUB, Rank.TEN)
        Card card3 = new Card(Suit.DIAMOND, Rank.TEN)
        Card card4 = new Card(Suit.HEART, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }
}
