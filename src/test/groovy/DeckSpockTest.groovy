import spock.lang.Specification

class DeckSpockTest extends Specification{
    def 'CreateFullDeck'() {
        given:
            Deck deck = new Deck()

        when:
            deck.createFullDeck()
            deck
    }
}
