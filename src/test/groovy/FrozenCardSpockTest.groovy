import spock.lang.Specification

class FrozenCardSpockTest extends Specification{

    def 'FrozenCard removeLayers'() {
        given:
            Card frozenCard = new FrozenCard(Suit.DIAMOND, Value.JACK)

        when:
            frozenCard.removeLayers()

        then:
            frozenCard.getNumberOfLayers()==1
    }

    def 'FrozenCard removeLayers 2'() {
        given:
            Card frozenCard = new FrozenCard(Suit.DIAMOND, Value.JACK)

        when:
            frozenCard.removeLayers(2)

        then:
            frozenCard.getNumberOfLayers()==0
    }

    def 'FrozenCard constructor'() {
        given:
            Card frozenCard = new FrozenCard(Suit.DIAMOND, Value.JACK)

        when:
            int numberOfLayers = frozenCard.getNumberOfLayers()

        then:
            numberOfLayers==2
    }
}
