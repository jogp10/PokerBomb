package com.pokerbomb.model.game.cards


import spock.lang.Specification

class FullHouseHandSpockTest extends Specification {
    def 'Full House com.pokerbomb.model.game.cards.Hand 1'() {
        given:
        Card card1 = new Card(Suit.CLUB, Rank.TWO)
        Card card2 = new Card(Suit.DIAMOND, Rank.TWO)
        Card card3 = new Card(Suit.DIAMOND, Rank.SEVEN)
        Card card4 = new Card(Suit.SPADE, Rank.SEVEN)
        Card card5 = new Card(Suit.HEART, Rank.SEVEN)
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

    def 'Full House com.pokerbomb.model.game.cards.Hand 2'() {
        given:
        Card card1 = new Card(Suit.CLUB, Rank.SIX)
        Card card2 = new Card(Suit.SPADE, Rank.SIX)
        Card card3 = new Card(Suit.HEART, Rank.SIX)
        Card card4 = new Card(Suit.DIAMOND, Rank.KING)
        Card card5 = new Card(Suit.SPADE, Rank.KING)
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

    def 'Full House com.pokerbomb.model.game.cards.Hand 3'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.QUEEN)
        Card card2 = new Card(Suit.HEART, Rank.QUEEN)
        Card card3 = new Card(Suit.SPADE, Rank.ACE)
        Card card4 = new Card(Suit.DIAMOND, Rank.ACE)
        Card card5 = new Card(Suit.CLUB, Rank.ACE)
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
