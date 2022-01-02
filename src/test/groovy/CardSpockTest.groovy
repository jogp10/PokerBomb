import spock.lang.Specification

class CardSpockTest extends Specification {

    def 'Card Suit'() {
        given:
            Card card = new Card(Suit.CLUB, Rank.ACE)

        when:
            Suit suit = card.getSuit()

        then:
            suit == Suit.CLUB
    }

    def 'Card to string'() {
        given:
            Card card = new Card(Suit.DIAMOND, Rank.ACE)

        when:
            String string = card.toString()

        then:
            string == "DIAMOND-ACE"
    }

    def 'Card Value'() {
        given:
            Card card = new Card(Suit.CLUB, Rank.ACE)

        when:
            Rank value = card.getValue()

        then:
            value == Rank.ACE
    }

}
