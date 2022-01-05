package com.pockerbomb

import spock.lang.Specification

class FullHouseHandSpockTest extends Specification {
    def 'Full House com.pockerbomb.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.CLUB, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.SEVEN)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean fullHouse = Hand.isFullHouse(deck)

        then:
        fullHouse
    }

    def 'Full House com.pockerbomb.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.CLUB, Rank.SIX)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.SIX)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.SIX)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.KING)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean fullHouse = Hand.isFullHouse(deck)

        then:
        fullHouse
    }

    def 'Full House com.pockerbomb.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.QUEEN)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.ACE)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        NormalCard card5 = new NormalCard(Suit.CLUB, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean fullHouse = Hand.isFullHouse(deck)

        then:
        fullHouse
    }
}
