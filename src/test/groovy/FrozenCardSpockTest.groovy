import com.pockerbomb.Card
import com.pockerbomb.FrozenCard
import com.pockerbomb.Rank
import com.pockerbomb.Suit
import spock.lang.Specification

class FrozenCardSpockTest extends Specification{

    def 'com.pockerbomb.FrozenCard removeLayers'() {
        given:
            Card frozenCard = new FrozenCard(Suit.DIAMOND, Rank.JACK)

        when:
            frozenCard.removeLayers()

        then:
            frozenCard.getNumberOfLayers()==1
    }

    def 'com.pockerbomb.FrozenCard removeLayers 2'() {
        given:
        Card frozenCard = new FrozenCard(Suit.DIAMOND, Rank.JACK)

        when:
            frozenCard.removeLayers(2)

        then:
            frozenCard.getNumberOfLayers()==0
    }

    def 'com.pockerbomb.FrozenCard constructor'() {
        given:
            Card frozenCard = new FrozenCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfLayers = frozenCard.getNumberOfLayers()

        then:
            numberOfLayers==2
    }
}
