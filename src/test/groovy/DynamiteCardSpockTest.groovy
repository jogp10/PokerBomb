import com.pockerbomb.Card
import com.pockerbomb.DynamiteCard
import com.pockerbomb.Rank
import com.pockerbomb.Suit
import spock.lang.Specification

class DynamiteCardSpockTest extends Specification{
    def 'com.pockerbomb.DynamiteCard removePlays'() {
        given:
        Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)

        when:
            dynamiteCard.removePlays()

        then:
            dynamiteCard.getNumberOfPlaysTillDynamite()==4
    }

    def 'com.pockerbomb.DynamiteCard removePlays 2'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)

        when:
            dynamiteCard.removePlays(2)

        then:
            dynamiteCard.getNumberOfPlaysTillDynamite()==3
    }

    def 'com.pockerbomb.DynamiteCard constructor'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfPlaysTillDynamite = dynamiteCard.getNumberOfPlaysTillDynamite()

        then:
            numberOfPlaysTillDynamite==5
    }
}
