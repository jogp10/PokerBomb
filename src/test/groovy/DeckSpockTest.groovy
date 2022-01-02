import spock.lang.Specification

class DeckSpockTest extends Specification{
    def 'CreateFullDeck'() {
        given:
            Deck deck = new Deck()

        when:
            deck.createFullDeck()
            Card card = deck.getCard(0)

        then:
            card.getValue() == Rank.TWO
            card.getSuit() == Suit.HEART
    }
}
