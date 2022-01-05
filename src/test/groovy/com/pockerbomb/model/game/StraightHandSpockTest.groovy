package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class StraightHandSpockTest extends Specification {

    def 'Straight com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.FIVE)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.NINE)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straight = Hand.isStraight(deck)

        then:
        straight
    }

    def 'Straight com.pockerbomb.model.game.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.THREE)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.FOUR)
        NormalCard card5 = new NormalCard(Suit.CLUB, Rank.FIVE)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straight = Hand.isStraight(deck)

        then:
        straight
    }

    def 'Straight com.pockerbomb.model.game.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.TEN)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.JACK)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.KING)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.ACE)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean straight = Hand.isStraight(deck)

        then:
        straight
    }
}