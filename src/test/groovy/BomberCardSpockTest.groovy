import spock.lang.Specification

class BomberCardSpockTest extends Specification{

    def 'BomberCard removePlays'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            bomberCard.removePlays()

        then:
            bomberCard.getNumberOfPlaysTillBomb()==6
    }

    def 'BomberCard removePlays 2'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            bomberCard.removePlays(2)

        then:
            bomberCard.getNumberOfPlaysTillBomb()==5
    }

    def 'BomberCard constructor'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfPlaysTillBomb = bomberCard.getNumberOfPlaysTillBomb()

        then:
            numberOfPlaysTillBomb==7
    }

}
