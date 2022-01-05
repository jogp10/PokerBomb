package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class ThreeOfAKindHandSpockTest extends Specification {
    def 'Three of a Kind com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.FOUR)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.FOUR)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.model.game.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.TEN)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.TEN)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.model.game.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.SEVEN)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.NINE)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.ACE)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.model.game.Hand 4'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.FOUR)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.FOUR)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pockerbomb.model.game.Hand 5'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.TEN)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck)

        then:
        threeOfAKind
    }
}
