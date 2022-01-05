package com.pockerbomb

import spock.lang.Specification

class JungleCardSpockTest extends Specification{
    JungleCard jungleCard;
    def setup(){
        jungleCard = new JungleCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.JungleCard removePlays'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            jungleCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.JungleCard constructor'() {
        when:
            int numberSpecialAttribute = jungleCard.getSpecialAttribute()

        then:
            numberSpecialAttribute==1
    }

    def 'com.pockerbomb.JungleCard isActive'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            !jungleCard.isActive()
    }

    def 'com.pockerbomb.JungleCard PlayWithCombo'() {
        expect:
            jungleCard.PlayWithCombo(4);
    }

    def 'com.pockerbomb.JungleCard PlayWithoutCombo'() {
        expect:
            !jungleCard.PlayWithoutCombo();
    }
}
