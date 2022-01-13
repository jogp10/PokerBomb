package com.pokerbomb.model.game.cards


import spock.lang.Specification

class ThreeOfAKindHandSpockTest extends Specification {
    def 'Three of a Kind com.pokerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card2 = new NormalCard(Suit.HEART, Rank.FOUR)
        Card card3 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Card card4 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        Card card5 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck.getDeck())

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pokerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card2 = new NormalCard(Suit.CLUB, Rank.TEN)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card4 = new NormalCard(Suit.HEART, Rank.TEN)
        Card card5 = new NormalCard(Suit.SPADE, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck.getDeck())

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pokerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new NormalCard(Suit.HEART, Rank.SEVEN)
        Card card2 = new NormalCard(Suit.HEART, Rank.NINE)
        Card card3 = new NormalCard(Suit.SPADE, Rank.ACE)
        Card card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        Card card5 = new NormalCard(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck.getDeck())

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pokerbomb.model.game.cards.Hand 4'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card2 = new NormalCard(Suit.HEART, Rank.FOUR)
        Card card3 = new NormalCard(Suit.CLUB, Rank.FOUR)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck.getDeck())

        then:
        threeOfAKind
    }

    def 'Three of a Kind com.pokerbomb.model.game.cards.Hand 5'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card2 = new NormalCard(Suit.CLUB, Rank.TEN)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card4 = new NormalCard(Suit.HEART, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean threeOfAKind = Hand.isThreeOfAKind(deck.getDeck())

        then:
        threeOfAKind
    }
}
