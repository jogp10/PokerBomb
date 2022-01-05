package com.pockerbomb

import spock.lang.Specification

class DynamiteCardSpockTest extends Specification{
    DynamiteCard dynamiteCard;
    def setup(){
        dynamiteCard = new DynamiteCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.DynamiteCard removePlays'() {
        when:
            dynamiteCard.removeSpecialAttribute(1)

        then:
            dynamiteCard.getSpecialAttribute()==4
    }

    def 'com.pockerbomb.DynamiteCard constructor'() {
        when:
            int numberOfPlaysTillDynamite = dynamiteCard.getSpecialAttribute()
        then:
            numberOfPlaysTillDynamite==5
    }

    def 'com.pockerbomb.DynamiteCard isActive'() {
        when:
            dynamiteCard.removeSpecialAttribute(5)

        then:
            !dynamiteCard.isActive()

    }

    def 'com.pockerbomb.DynamiteCard PlayWithCombo'() {
        expect:
            dynamiteCard.PlayWithCombo(1);
    }

    def 'com.pockerbomb.DynamiteCard PlayWithoutCombo'() {
        expect:
            !dynamiteCard.PlayWithoutCombo();
    }


}
