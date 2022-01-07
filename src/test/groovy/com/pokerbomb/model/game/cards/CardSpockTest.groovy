package com.pokerbomb.model.game.cards


import spock.lang.Specification

class CardSpockTest extends Specification {
    Card card;
    def setup(){
        card = new Card(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.cards.Card com.pockerbomb.model.cards.Suit'() {
        when:
            Suit suit = card.getSuit()

        then:
            suit == Suit.CLUB
    }

    def 'com.pockerbomb.model.cards.Card to string'() {
        when:
            String string = card.toString()

        then:
            string == "CLUB-ACE"
    }

    def 'com.pockerbomb.model.cards.Card Value'() {
        when:
            Rank value = card.getRank()

        then:
            value == Rank.ACE
    }

    def 'com.pockerbomb.model.cards.Card PlayWithCombo'() {
        expect:
            card.inACombo(1);
    }

    def 'com.pockerbomb.model.cards.Card PlayWithoutCombo'() {
        expect:
            !card.notInACombo();
    }

}
