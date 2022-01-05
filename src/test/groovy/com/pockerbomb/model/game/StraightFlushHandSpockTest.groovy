package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class StraightFlushHandSpockTest extends Specification {
    def 'Straight Flush com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.CLUB, Rank.FIVE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.SIX)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.SEVEN)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        NormalCard card5 = new NormalCard(Suit.CLUB, Rank.NINE)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straightFlush = Hand.isStraightFlush(deck)

        then:
        straightFlush
    }

    def 'Straight Flush com.pockerbomb.model.game.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.ACE)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.TWO)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.THREE)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.FOUR)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.FIVE)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straightFlush = Hand.isStraightFlush(deck)

        then:
        straightFlush
    }

    def 'Straight Flush com.pockerbomb.model.game.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.NINE)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.TEN)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.JACK)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.KING)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straightFlush = Hand.isStraightFlush(deck)

        then:
        straightFlush
    }
}
