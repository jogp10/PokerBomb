package com.pockerbomb

import spock.lang.Specification

class DynamiteCardSpockTest extends Specification{
    def 'com.pockerbomb.DynamiteCard removePlays'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)

        when:
            dynamiteCard.removeSpecialAttribute(1)

        then:
            dynamiteCard.getSpecialAttribute()==4
    }

    def 'com.pockerbomb.DynamiteCard constructor'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfPlaysTillDynamite = dynamiteCard.getSpecialAttribute()

        then:
            numberOfPlaysTillDynamite==5
    }

    def 'com.pockerbomb.DynamiteCard isActive'() {
        given:
            Card dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.JACK)
            dynamiteCard.removeSpecialAttribute(4)

        when:
            dynamiteCard.removeSpecialAttribute(1)

        then:
            !dynamiteCard.isActive()

    }


}
