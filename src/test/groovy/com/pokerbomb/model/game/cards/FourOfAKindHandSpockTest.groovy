package com.pokerbomb.model.game.cards


import spock.lang.Specification

class FourOfAKindHandSpockTest extends Specification {
    def 'Four of a Kind com.pockerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new NormalCard(Suit.CLUB, Rank.THREE)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card3 = new NormalCard(Suit.SPADE, Rank.THREE)
        Card card4 = new NormalCard(Suit.HEART, Rank.THREE)
        Card card5 = new NormalCard(Suit.CLUB, Rank.FIVE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean fourOfAKind = Hand.isFourOfAKind(deck)

        then:
        fourOfAKind
    }

    def 'Four of a Kind com.pockerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Card card2 = new NormalCard(Suit.SPADE, Rank.ACE)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        Card card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        Card card5 = new NormalCard(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean fourOfAKind = Hand.isFourOfAKind(deck)

        then:
        fourOfAKind
    }

    def 'Four of a Kind com.pockerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        Card card3 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        Card card4 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Card card5 = new NormalCard(Suit.SPADE, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean fourOfAKind = Hand.isFourOfAKind(deck)

        then:
        fourOfAKind
    }

    def 'Four of a Kind com.pockerbomb.model.game.cards.Hand 4'() {
        given:
        Card card1 = new NormalCard(Suit.CLUB, Rank.THREE)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card3 = new NormalCard(Suit.SPADE, Rank.THREE)
        Card card4 = new NormalCard(Suit.HEART, Rank.THREE)

        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean fourOfAKind = Hand.isFourOfAKind(deck)

        then:
        fourOfAKind
    }
}
