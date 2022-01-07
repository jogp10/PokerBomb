package com.pokerbomb.model.game.cards


import spock.lang.Specification

class StraightFlushHandSpockTest extends Specification {
    def 'Straight Flush com.pockerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new Card(Suit.CLUB, Rank.FIVE)
        Card card2 = new Card(Suit.CLUB, Rank.SIX)
        Card card3 = new Card(Suit.CLUB, Rank.SEVEN)
        Card card4 = new Card(Suit.CLUB, Rank.EIGHT)
        Card card5 = new Card(Suit.CLUB, Rank.NINE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straightFlush = Hand.isStraightFlush(deck)

        then:
        straightFlush
    }

    def 'Straight Flush com.pockerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.ACE)
        Card card2 = new Card(Suit.HEART, Rank.TWO)
        Card card3 = new Card(Suit.HEART, Rank.THREE)
        Card card4 = new Card(Suit.HEART, Rank.FOUR)
        Card card5 = new Card(Suit.HEART, Rank.FIVE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straightFlush = Hand.isStraightFlush(deck)

        then:
        straightFlush
    }

    def 'Straight Flush com.pockerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new Card(Suit.SPADE, Rank.NINE)
        Card card2 = new Card(Suit.SPADE, Rank.TEN)
        Card card3 = new Card(Suit.SPADE, Rank.JACK)
        Card card4 = new Card(Suit.SPADE, Rank.QUEEN)
        Card card5 = new Card(Suit.SPADE, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straightFlush = Hand.isStraightFlush(deck)

        then:
        straightFlush
    }
}
