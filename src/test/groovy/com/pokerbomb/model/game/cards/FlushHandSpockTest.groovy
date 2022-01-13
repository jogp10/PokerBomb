package com.pokerbomb.model.game.cards


import spock.lang.Specification

class FlushHandSpockTest extends Specification {
    def 'Flush com.pokerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new NormalCard(Suit.CLUB, Rank.TWO)
        Card card2 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Card card3 = new NormalCard(Suit.CLUB, Rank.SEVEN)
        Card card4 = new NormalCard(Suit.CLUB, Rank.TEN)
        Card card5 = new NormalCard(Suit.CLUB, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck.getDeck())

        then:
        flush
    }

    def 'Flush com.pokerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        Card card4 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        Card card5 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck.getDeck())

        then:
        flush
    }

    def 'Flush com.pokerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        Card card2 = new NormalCard(Suit.SPADE, Rank.TEN)
        Card card3 = new NormalCard(Suit.SPADE, Rank.JACK)
        Card card4 = new NormalCard(Suit.SPADE, Rank.KING)
        Card card5 = new NormalCard(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck.getDeck())

        then:
        flush
    }
}
