package com.pokerbomb.model.game.cards


import spock.lang.Specification

class StraightHandSpockTest extends Specification {

    def 'Straight com.pockerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new NormalCard(Suit.SPADE, Rank.FIVE)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Card card3 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        Card card4 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Card card5 = new NormalCard(Suit.HEART, Rank.NINE)
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
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        Card card3 = new NormalCard(Suit.CLUB, Rank.THREE)
        Card card4 = new NormalCard(Suit.HEART, Rank.FOUR)
        Card card5 = new NormalCard(Suit.CLUB, Rank.FIVE)
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
        Card card1 = new NormalCard(Suit.HEART, Rank.TEN)
        Card card2 = new NormalCard(Suit.SPADE, Rank.JACK)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        Card card4 = new NormalCard(Suit.SPADE, Rank.KING)
        Card card5 = new NormalCard(Suit.HEART, Rank.ACE)
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