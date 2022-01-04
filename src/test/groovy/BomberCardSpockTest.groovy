import com.pockerbomb.BomberCard
import com.pockerbomb.Card
import com.pockerbomb.Rank
import com.pockerbomb.Suit
import spock.lang.Specification

class BomberCardSpockTest extends Specification{

    def 'com.pockerbomb.BomberCard removePlays'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            bomberCard.removePlays()

        then:
            bomberCard.getNumberOfPlaysTillBomb()==6
    }

    def 'com.pockerbomb.BomberCard removePlays 2'() {
        given:
        Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            bomberCard.removePlays(2)

        then:
            bomberCard.getNumberOfPlaysTillBomb()==5
    }

    def 'com.pockerbomb.BomberCard constructor'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfPlaysTillBomb = bomberCard.getNumberOfPlaysTillBomb()

        then:
            numberOfPlaysTillBomb==7
    }

}
