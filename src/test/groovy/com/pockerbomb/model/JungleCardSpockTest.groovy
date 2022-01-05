package com.pockerbomb.model

import com.pockerbomb.model.JungleCard
import com.pockerbomb.model.Rank
import com.pockerbomb.model.Suit
import spock.lang.Specification

class JungleCardSpockTest extends Specification{
    JungleCard jungleCard;
    def setup(){
        jungleCard = new JungleCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.JungleCard removePlays'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            jungleCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.model.JungleCard constructor'() {
        when:
            int numberSpecialAttribute = jungleCard.getSpecialAttribute()

        then:
            numberSpecialAttribute==1
    }

    def 'com.pockerbomb.model.JungleCard isActive'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            !jungleCard.isActive()
    }

    def 'com.pockerbomb.model.JungleCard PlayWithCombo'() {
        expect:
            jungleCard.PlayWithCombo(4);
    }

    def 'com.pockerbomb.model.JungleCard PlayWithoutCombo'() {
        expect:
            !jungleCard.PlayWithoutCombo();
    }
}
