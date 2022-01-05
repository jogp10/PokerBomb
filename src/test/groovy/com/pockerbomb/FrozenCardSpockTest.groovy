package com.pockerbomb

import spock.lang.Specification

class FrozenCardSpockTest extends Specification{

    def 'com.pockerbomb.FrozenCard removeLayers'() {
        given:
            Card frozenCard = new FrozenCard(Suit.CLUB, Rank.EIGHT)

        when:
            frozenCard.removeSpecialAttribute(1)

        then:
            frozenCard.getSpecialAttribute()==1
    }

    def 'com.pockerbomb.FrozenCard removeLayers 2'() {
        given:
            Card frozenCard = new FrozenCard(Suit.CLUB, Rank.EIGHT)

        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            frozenCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.FrozenCard constructor'() {
        given:
            Card frozenCard = new FrozenCard(Suit.CLUB, Rank.EIGHT)

        when:
            int numberOfLayers = frozenCard.getSpecialAttribute()

        then:
            numberOfLayers==2
    }

    def 'com.pockerbomb.FrozenCard isActive'() {
        given:
            Card frozenCard = new FrozenCard(Suit.CLUB, Rank.EIGHT)
            frozenCard.removeSpecialAttribute(1)

        when:
            frozenCard.removeSpecialAttribute(1)

        then:
            !frozenCard.isActive()

    }
}
