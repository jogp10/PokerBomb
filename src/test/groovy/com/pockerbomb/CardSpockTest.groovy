package com.pockerbomb

import spock.lang.Specification

class CardSpockTest extends Specification {
    Card card;
    def setup(){
        card = new Card(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.Card com.pockerbomb.Suit'() {
        when:
            Suit suit = card.getSuit()

        then:
            suit == Suit.CLUB
    }

    def 'com.pockerbomb.Card to string'() {
        when:
            String string = card.toString()

        then:
            string == "DIAMOND-ACE"
    }

    def 'com.pockerbomb.Card Value'() {
        when:
            Rank value = card.getRank()

        then:
            value == Rank.ACE
    }

    def 'com.pockerbomb.Card PlayWithCombo'() {
        expect:
            card.PlayWithCombo(1);
    }

    def 'com.pockerbomb.Card PlayWithoutCombo'() {
        expect:
            !card.PlayWithoutCombo();
    }

}
