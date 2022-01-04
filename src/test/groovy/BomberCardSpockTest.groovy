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
            bomberCard.removeSpecialAttribute()

        then:
            bomberCard.getSpecialAttribute()==6
    }

    def 'com.pockerbomb.BomberCard removePlays 2'() {
        given:
        Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            bomberCard.removeSpecialAttribute(2)

        then:
            bomberCard.getSpecialAttribute()==5
    }

    def 'com.pockerbomb.BomberCard constructor'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfPlaysTillBomb = bomberCard.getSpecialAttribute()

        then:
            numberOfPlaysTillBomb==7
    }

}
