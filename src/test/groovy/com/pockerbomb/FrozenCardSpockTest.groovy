package com.pockerbomb

import spock.lang.Specification

class FrozenCardSpockTest extends Specification{

    def 'com.pockerbomb.FrozenCard removeLayers'() {
        given:
            Card frozenCard = new FrozenCard(Suit.DIAMOND, Rank.JACK)

        when:
            frozenCard.removeSpecialAttribute()

        then:
            frozenCard.getSpecialAttribute()==1
    }

    def 'com.pockerbomb.FrozenCard removeLayers 2'() {
        given:
        Card frozenCard = new FrozenCard(Suit.DIAMOND, Rank.JACK)

        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            frozenCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.FrozenCard constructor'() {
        given:
            Card frozenCard = new FrozenCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfLayers = frozenCard.getSpecialAttribute()

        then:
            numberOfLayers==2
    }
}
