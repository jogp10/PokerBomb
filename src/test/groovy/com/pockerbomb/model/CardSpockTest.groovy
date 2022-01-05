package com.pockerbomb.model

import com.pockerbomb.model.Card
import com.pockerbomb.model.Rank
import com.pockerbomb.model.Suit
import spock.lang.Specification

class CardSpockTest extends Specification {
    Card card;
    def setup(){
        card = new Card(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.Card com.pockerbomb.model.Suit'() {
        when:
            Suit suit = card.getSuit()

        then:
            suit == Suit.CLUB
    }

    def 'com.pockerbomb.model.Card to string'() {
        when:
            String string = card.toString()

        then:
            string == "CLUB-ACE"
    }

    def 'com.pockerbomb.model.Card Value'() {
        when:
            Rank value = card.getRank()

        then:
            value == Rank.ACE
    }

    def 'com.pockerbomb.model.Card PlayWithCombo'() {
        expect:
            card.PlayWithCombo(1);
    }

    def 'com.pockerbomb.model.Card PlayWithoutCombo'() {
        expect:
            !card.PlayWithoutCombo();
    }

}
