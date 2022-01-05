package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class RoyalFlushHandSpockTest extends Specification {
    def 'Royal Flush com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.TEN)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.JACK)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.QUEEN)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.KING)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.ACE)
        DeckModel deck = new DeckModel()
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
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.TEN)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.JACK)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.KING)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.ACE)
        DeckModel deck = new DeckModel()
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
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.KING)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        DeckModel deck = new DeckModel()
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
