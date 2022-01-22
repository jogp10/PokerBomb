package com.pokerbomb.model.game.cards

import com.pokerbomb.model.game.deck.Deck
import spock.lang.Specification

class PairHandSpockTest extends Specification {
    def 'Pair com.pokerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new NormalCard(Suit.SPADE, Rank.THREE)
        Card card2 = new NormalCard(Suit.CLUB, Rank.THREE)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Card card4 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card5 = new NormalCard(Suit.SPADE, Rank.JACK)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean pair = Hand.isPair(deck.getDeck())

        then:
        pair
    }

    def 'Pair com.pokerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new NormalCard(Suit.CLUB, Rank.TWO)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card3 = new NormalCard(Suit.HEART, Rank.NINE)
        Card card4 = new NormalCard(Suit.SPADE, Rank.TEN)
        Card card5 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean pair = Hand.isPair(deck.getDeck())

        then:
        pair
    }

    def 'Pair com.pokerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        Card card3 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        Card card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        Card card5 = new NormalCard(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean pair = Hand.isPair(deck.getDeck())

        then:
        pair
    }

    def 'Pair com.pokerbomb.model.game.cards.Hand 4'() {
        given:
        Card card1 = new NormalCard(Suit.SPADE, Rank.THREE)
        Card card2 = new NormalCard(Suit.CLUB, Rank.THREE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)


        when:
        boolean pair = Hand.isPair(deck.getDeck())

        then:
        pair
    }
}
