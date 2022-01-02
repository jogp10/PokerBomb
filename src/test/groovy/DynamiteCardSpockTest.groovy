import spock.lang.Specification

class DynamiteCardSpockTest extends Specification{
    def 'DynamiteCard removePlays'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Value.JACK)

        when:
            dynamiteCard.removePlays()

        then:
            dynamiteCard.getNumberOfPlaysTillDynamite()==4
    }

    def 'DynamiteCard removePlays 2'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Value.JACK)

        when:
            dynamiteCard.removePlays(2)

        then:
            dynamiteCard.getNumberOfPlaysTillDynamite()==3
    }

    def 'DynamiteCard constructor'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Value.JACK)

        when:
            int numberOfPlaysTillDynamite = dynamiteCard.getNumberOfPlaysTillDynamite()

        then:
            numberOfPlaysTillDynamite==5
    }
}
