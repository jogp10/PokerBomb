package com.pockerbomb

import spock.lang.Specification

class JungleCardSpockTest extends Specification{
    def 'com.pockerbomb.JungleCard removePlays'() {
        given:
            GenericSpecialCard jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            jungleCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.JungleCard removePlays 2'() {
        given:
            GenericSpecialCard jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            jungleCard.removeSpecialAttribute(2)

        then:
            jungleCard.getSpecialAttribute()<1
    }

    def 'com.pockerbomb.JungleCard constructor'() {
        given:
            GenericSpecialCard jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        when:
            int numberOfLayers = jungleCard.getSpecialAttribute()

        then:
            numberOfLayers==0
    }

    def 'com.pockerbomb.JungleCard add layer'() {
        given:
            GenericSpecialCard jungleCard = new JungleCard(Suit.SPADE, Rank.NINE)

        when:
            jungleCard.addNumberOfPlaysWithoutCombo()

        then:
            jungleCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.JungleCard add layer 2'() {
        given:
            Card jungleCard = new JungleCard(Suit.SPADE, Rank.NINE)
            jungleCard.addNumberOfPlaysWithoutCombo()
            jungleCard.addNumberOfPlaysWithoutCombo()
            jungleCard.addNumberOfPlaysWithoutCombo()


        when:
            jungleCard.addNumberOfPlaysWithoutCombo()

        then:
            jungleCard.getSpecialAttribute()==1
    }

    def 'com.pockerbomb.JungleCard isActive'() {
        given:
            Card jungleCard = new JungleCard(Suit.DIAMOND, Rank.JACK)

        expect:
            !jungleCard.isActive()

    }
}
