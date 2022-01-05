package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class FourOfAKindHandSpockTest extends Specification {
    def 'Four of a Kind com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.CLUB, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.THREE)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.THREE)
        NormalCard card5 = new NormalCard(Suit.CLUB, Rank.FIVE)
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

    def 'Four of a Kind com.pockerbomb.model.game.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.ACE)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.ACE)
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

    def 'Four of a Kind com.pockerbomb.model.game.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.QUEEN)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.KING)
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

    def 'Four of a Kind com.pockerbomb.model.game.Hand 4'() {
        given:
        NormalCard card1 = new NormalCard(Suit.CLUB, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.THREE)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.THREE)

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
