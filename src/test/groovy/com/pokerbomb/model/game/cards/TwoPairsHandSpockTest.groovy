package com.pokerbomb.model.game.cards

import com.pokerbomb.model.game.deck.Deck
import spock.lang.Specification

class TwoPairsHandSpockTest extends Specification {
    def 'Two Pairs com.pokerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        Card card2 = new NormalCard(Suit.HEART, Rank.TWO)
        Card card3 = new NormalCard(Suit.CLUB, Rank.SIX)
        Card card4 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Card card5 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck.getDeck())

        then:
        twoPairs
    }

    def 'Two Pairs com.pokerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new NormalCard(Suit.HEART, Rank.FOUR)
        Card card2 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        Card card4 = new NormalCard(Suit.SPADE, Rank.JACK)
        Card card5 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck.getDeck())

        then:
        twoPairs
    }

    def 'Two Pairs com.pokerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new NormalCard(Suit.SPADE, Rank.THREE)
        Card card2 = new NormalCard(Suit.CLUB, Rank.KING)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Card card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        Card card5 = new NormalCard(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck.getDeck())

        then:
        twoPairs
    }

    def 'Two Pairs com.pokerbomb.model.game.cards.Hand 4'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        Card card2 = new NormalCard(Suit.HEART, Rank.TWO)
        Card card3 = new NormalCard(Suit.CLUB, Rank.SIX)
        Card card4 = new NormalCard(Suit.DIAMOND, Rank.SIX)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck.getDeck())

        then:
        twoPairs
    }
}
