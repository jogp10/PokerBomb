package com.pockerbomb

import spock.lang.Specification

class DynamiteCardSpockTest extends Specification{
    def 'com.pockerbomb.DynamiteCard removePlays'() {
        given:
        Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)

        when:
            dynamiteCard.removeSpecialAttribute()

        then:
            dynamiteCard.getSpecialAttribute()==4
    }

    def 'com.pockerbomb.BomberCard removePlays 2'() {
        given:
        Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
        bomberCard.removeSpecialAttribute(10)

        then:
        bomberCard.getSpecialAttribute()==6
    }

    def 'com.pockerbomb.DynamiteCard constructor'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfPlaysTillDynamite = dynamiteCard.getSpecialAttribute()

        then:
            numberOfPlaysTillDynamite==5
    }


}
