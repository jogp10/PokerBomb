package com.pockerbomb

import spock.lang.Specification

class CardSpockTest extends Specification {

    def 'com.pockerbomb.Card com.pockerbomb.Suit'() {
        given:
            NormalCard card = new NormalCard(Suit.CLUB, Rank.ACE)

        when:
            Suit suit = card.getSuit()

        then:
            suit == Suit.CLUB
    }

    def 'com.pockerbomb.Card to string'() {
        given:
            NormalCard card = new NormalCard(Suit.DIAMOND, Rank.ACE)

        when:
            String string = card.toString()

        then:
            string == "DIAMOND-ACE"
    }

    def 'com.pockerbomb.Card Value'() {
        given:
            NormalCard card = new NormalCard(Suit.CLUB, Rank.ACE)

        when:
            Rank value = card.getRank()

        then:
            value == Rank.ACE
    }

}
