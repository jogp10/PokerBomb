package com.pokerbomb.model.game.cards


import spock.lang.Specification

class FlushHandSpockTest extends Specification {
    def 'Flush com.pockerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new Card(Suit.CLUB, Rank.TWO)
        Card card2 = new Card(Suit.CLUB, Rank.FOUR)
        Card card3 = new Card(Suit.CLUB, Rank.SEVEN)
        Card card4 = new Card(Suit.CLUB, Rank.TEN)
        Card card5 = new Card(Suit.CLUB, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck)

        then:
        flush
    }

    def 'Flush com.pockerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.FIVE)
        Card card2 = new Card(Suit.DIAMOND, Rank.SIX)
        Card card3 = new Card(Suit.DIAMOND, Rank.SEVEN)
        Card card4 = new Card(Suit.DIAMOND, Rank.JACK)
        Card card5 = new Card(Suit.DIAMOND, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck)

        then:
        flush
    }

    def 'Flush com.pockerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new Card(Suit.SPADE, Rank.EIGHT)
        Card card2 = new Card(Suit.SPADE, Rank.TEN)
        Card card3 = new Card(Suit.SPADE, Rank.JACK)
        Card card4 = new Card(Suit.SPADE, Rank.KING)
        Card card5 = new Card(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck)

        then:
        flush
    }
}
