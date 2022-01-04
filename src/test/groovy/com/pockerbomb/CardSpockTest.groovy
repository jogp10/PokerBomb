package com.pockerbomb

import com.pockerbomb.Card
import com.pockerbomb.Rank
import com.pockerbomb.Suit
import spock.lang.Specification

class CardSpockTest extends Specification {

    def 'com.pockerbomb.Card com.pockerbomb.Suit'() {
        given:
            Card card = new Card(Suit.CLUB, Rank.ACE)

        when:
        Suit suit = card.getSuit()

        then:
            suit == Suit.CLUB
    }

    def 'com.pockerbomb.Card to string'() {
        given:
            Card card = new Card(Suit.DIAMOND, Rank.ACE)

        when:
            String string = card.toString()

        then:
            string == "DIAMOND-ACE"
    }

    def 'com.pockerbomb.Card Value'() {
        given:
            Card card = new Card(Suit.CLUB, Rank.ACE)

        when:
            Rank value = card.getRank()

        then:
            value == Rank.ACE
    }

}
