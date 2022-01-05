package com.pockerbomb.model.cards

import com.pockerbomb.model.cards.JungleCard
import com.pockerbomb.model.cards.Rank
import com.pockerbomb.model.cards.Suit
import spock.lang.Specification

class JungleCardSpockTest extends Specification{
    JungleCard jungleCard;
    def setup(){
        jungleCard = new JungleCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.cards.JungleCard removePlays'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            jungleCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.model.cards.JungleCard constructor'() {
        when:
            int numberSpecialAttribute = jungleCard.getSpecialAttribute()

        then:
            numberSpecialAttribute==1
    }

    def 'com.pockerbomb.model.cards.JungleCard isActive'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            !jungleCard.isActive()
    }

    def 'com.pockerbomb.model.cards.JungleCard PlayWithCombo'() {
        expect:
            jungleCard.PlayWithCombo(4);
    }

    def 'com.pockerbomb.model.cards.JungleCard PlayWithoutCombo'() {
        expect:
            !jungleCard.PlayWithoutCombo();
    }
}
