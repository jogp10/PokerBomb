import spock.lang.Specification

class JungleCardSpockTest extends Specification{
    def 'JungleCard removePlays'() {
        given:
            Card jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            jungleCard.removeLayers()

        then:
            jungleCard.getNumberOfLayers()==2
    }

    def 'JungleCard removePlays 2'() {
        given:
            Card jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            jungleCard.removeLayers(2)

        then:
            jungleCard.getNumberOfLayers()==1
    }

    def 'JungleCard constructor'() {
        given:
            Card jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfLayers = jungleCard.getNumberOfLayers()

        then:
            numberOfLayers==3
    }
}
