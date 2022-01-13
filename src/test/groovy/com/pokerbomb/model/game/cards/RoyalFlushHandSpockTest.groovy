package com.pokerbomb.model.game.cards


import spock.lang.Specification

class RoyalFlushHandSpockTest extends Specification {
    def 'Royal Flush com.pokerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new NormalCard(Suit.HEART, Rank.TEN)
        Card card2 = new NormalCard(Suit.HEART, Rank.JACK)
        Card card3 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Card card4 = new NormalCard(Suit.HEART, Rank.KING)
        Card card5 = new NormalCard(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean royalFlush = Hand.isRoyalFlush(deck.getDeck())

        then:
        royalFlush
    }

    def 'Royal Flush com.pokerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new NormalCard(Suit.SPADE, Rank.TEN)
        Card card2 = new NormalCard(Suit.SPADE, Rank.JACK)
        Card card3 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Card card4 = new NormalCard(Suit.SPADE, Rank.KING)
        Card card5 = new NormalCard(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean royalFlush = Hand.isRoyalFlush(deck.getDeck())

        then:
        royalFlush
    }

    def 'Royal Flush com.pokerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        Card card4 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Card card5 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean royalFlush = Hand.isRoyalFlush(deck.getDeck())

        then:
        royalFlush
    }
}
