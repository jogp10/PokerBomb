package com.pokerbomb.model.game.cards


import spock.lang.Specification

class StraightHandSpockTest extends Specification {

    def 'Straight com.pockerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new Card(Suit.SPADE, Rank.FIVE)
        Card card2 = new Card(Suit.DIAMOND, Rank.SIX)
        Card card3 = new Card(Suit.SPADE, Rank.SEVEN)
        Card card4 = new Card(Suit.CLUB, Rank.EIGHT)
        Card card5 = new Card(Suit.HEART, Rank.NINE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straight = Hand.isStraight(deck)

        then:
        straight
    }

    def 'Straight com.pockerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.ACE)
        Card card2 = new Card(Suit.DIAMOND, Rank.TWO)
        Card card3 = new Card(Suit.CLUB, Rank.THREE)
        Card card4 = new Card(Suit.HEART, Rank.FOUR)
        Card card5 = new Card(Suit.CLUB, Rank.FIVE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straight = Hand.isStraight(deck)

        then:
        straight
    }

    def 'Straight com.pockerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.TEN)
        Card card2 = new Card(Suit.SPADE, Rank.JACK)
        Card card3 = new Card(Suit.DIAMOND, Rank.QUEEN)
        Card card4 = new Card(Suit.SPADE, Rank.KING)
        Card card5 = new Card(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straight = Hand.isStraight(deck)

        then:
        straight
    }
}