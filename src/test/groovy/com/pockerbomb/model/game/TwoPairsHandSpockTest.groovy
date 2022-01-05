package com.pockerbomb.model.game


import com.pockerbomb.model.game.cards.NormalCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class TwoPairsHandSpockTest extends Specification {
    def 'Two Pairs com.pockerbomb.model.game.Hand 1'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.TWO)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.SIX)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.KING)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.model.game.Hand 2'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.FOUR)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.FOUR)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.JACK)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.model.game.Hand 3'() {
        given:
        NormalCard card1 = new NormalCard(Suit.SPADE, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.KING)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.KING)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.ACE)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.ACE)
        DeckModel deck = new DeckModel()
        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }

    def 'Two Pairs com.pockerbomb.model.game.Hand 4'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.TWO)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.SIX)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.SIX)

        DeckModel deck = new DeckModel()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)

        when:
        boolean twoPairs = Hand.isTwoPairs(deck)

        then:
        twoPairs
    }
}
