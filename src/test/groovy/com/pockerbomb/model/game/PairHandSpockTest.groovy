package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class PairHandSpockTest extends Specification {
    def 'Pair com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.THREE)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.JACK)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean pair = Hand.isPair(deck)

        then:
        pair
    }

    def 'Pair com.pockerbomb.model.game.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.CLUB, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.NINE)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.TEN)
        NormalCard card5 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean pair = Hand.isPair(deck)

        then:
        pair
    }

    def 'Pair com.pockerbomb.model.game.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean pair = Hand.isPair(deck)

        then:
        pair
    }

    def 'Pair com.pockerbomb.model.game.Hand 4'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.THREE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)


        when:
        boolean pair = Hand.isPair(deck)

        then:
        pair
    }
}
