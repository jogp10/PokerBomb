package com.pockerbomb

import spock.lang.Specification

class TwoPairsHandSpockTest extends Specification {
    def 'Two Pairs com.pockerbomb.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.TWO)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.SIX)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.FOUR)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.FOUR)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.JACK)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.KING)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.KING)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.Hand 4'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.TWO)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.SIX)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.SIX)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }
}
