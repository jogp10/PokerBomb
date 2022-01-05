package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class FlushHandSpockTest extends Specification {
    def 'Flush com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.CLUB, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.FOUR)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.SEVEN)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.TEN)
        NormalCard card5 = new NormalCard(Suit.CLUB, Rank.KING)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck)

        then:
        flush
    }

    def 'Flush com.pockerbomb.model.game.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck)

        then:
        flush
    }

    def 'Flush com.pockerbomb.model.game.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.TEN)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.JACK)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.KING)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.ACE)
        Deck deck = new Deck()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean flush = Hand.isFlush(deck)

        then:
        flush
    }
}
