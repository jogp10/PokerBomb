import com.pockerbomb.Card
import com.pockerbomb.JungleCard
import com.pockerbomb.Rank
import com.pockerbomb.Suit
import spock.lang.Specification

class JungleCardSpockTest extends Specification{
    def 'com.pockerbomb.JungleCard removePlays'() {
        given:
            Card jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            jungleCard.removeSpecialAttribute()

        then:
            jungleCard.getSpecialAttribute()==2
    }

    def 'com.pockerbomb.JungleCard removePlays 2'() {
        given:
            Card jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            jungleCard.removeSpecialAttribute(2)

        then:
            jungleCard.getSpecialAttribute()==1
    }

    def 'com.pockerbomb.JungleCard constructor'() {
        given:
            Card jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfLayers = jungleCard.getSpecialAttribute()

        then:
            numberOfLayers==3
    }

    def 'com.pockerbomb.JungleCard add layer'() {
        given:
            Card jungleCard = new JungleCard(Suit.SPADE, Rank.NINE)

        when:
            jungleCard.addNumberOfPlaysWithoutCombo()

        then:
            jungleCard.getSpecialAttribute()==3
    }

    def 'com.pockerbomb.JungleCard add layer 2'() {
        given:
        Card jungleCard = new JungleCard(Suit.SPADE, Rank.NINE)
            jungleCard.removeSpecialAttribute(2)
            jungleCard.addNumberOfPlaysWithoutCombo()
            jungleCard.addNumberOfPlaysWithoutCombo()
            jungleCard.addNumberOfPlaysWithoutCombo()


        when:
            jungleCard.addNumberOfPlaysWithoutCombo()

        then:
            jungleCard.getSpecialAttribute()==2
    }
}
