package com.pockerbomb


import spock.lang.Specification

class BomberCardSpockTest extends Specification{

    def 'com.pockerbomb.BomberCard removePlays'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            bomberCard.removeSpecialAttribute(1)

        then:
            bomberCard.getSpecialAttribute()==6
    }

    def 'com.pockerbomb.BomberCard removePlays 2'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            bomberCard.removeSpecialAttribute(1)

        then:
            bomberCard.getSpecialAttribute()==6
    }

    def 'com.pockerbomb.BomberCard constructor'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfPlaysTillBomb = bomberCard.getSpecialAttribute()

        then:
            numberOfPlaysTillBomb==7
    }

    def 'com.pockerbomb.BomberCard isActive'() {
        given:
            Card bomberCard = new BomberCard(Suit.DIAMOND, Rank.JACK)
            bomberCard.removeSpecialAttribute(6)

        when:
            bomberCard.removeSpecialAttribute(1)

        then:
            !bomberCard.isActive()

    }

}
