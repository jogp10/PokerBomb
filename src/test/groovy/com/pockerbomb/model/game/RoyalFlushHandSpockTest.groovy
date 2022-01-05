package com.pockerbomb.model.game

import com.pockerbomb.model.game.Deck
import com.pockerbomb.model.game.Hand
import com.pockerbomb.model.game.cards.Card
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class RoyalFlushHandSpockTest extends Specification {
    def 'Royal Flush com.pockerbomb.model.game.Hand 1'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.TEN)
        Card card2 = new Card(Suit.HEART, Rank.JACK)
        Card card3 = new Card(Suit.HEART, Rank.QUEEN)
        Card card4 = new Card(Suit.HEART, Rank.KING)
        Card card5 = new Card(Suit.HEART, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean royalFlush = Hand.isRoyalFlush(deck)

        then:
        royalFlush
    }

    def 'Royal Flush com.pockerbomb.model.game.Hand 2'() {
        given:
        Card card1 = new Card(Suit.SPADE, Rank.TEN)
        Card card2 = new Card(Suit.SPADE, Rank.JACK)
        Card card3 = new Card(Suit.SPADE, Rank.QUEEN)
        Card card4 = new Card(Suit.SPADE, Rank.KING)
        Card card5 = new Card(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean royalFlush = Hand.isRoyalFlush(deck)

        then:
        royalFlush
    }

    def 'Royal Flush com.pockerbomb.model.game.Hand 3'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.TEN)
        Card card2 = new Card(Suit.DIAMOND, Rank.JACK)
        Card card3 = new Card(Suit.DIAMOND, Rank.QUEEN)
        Card card4 = new Card(Suit.DIAMOND, Rank.KING)
        Card card5 = new Card(Suit.DIAMOND, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean royalFlush = Hand.isRoyalFlush(deck)

        then:
        royalFlush
    }
}
