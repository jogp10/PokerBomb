package com.pockerbomb.model.game.cards

import com.pockerbomb.model.game.cards.Deck
import com.pockerbomb.model.game.cards.Hand
import com.pockerbomb.model.game.cards.Card
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class HandRankingSpockTest extends Specification {

    def 'Royal Flush com.pockerbomb.model.game.cards.Hand'() {
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
        String royalFlush = Hand.handRanking(deck)

        then:
        royalFlush == "Royal Flush"
    }

    def 'Straight Flush com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.SEVEN)
        Card card2 = new Card(Suit.DIAMOND, Rank.EIGHT)
        Card card3 = new Card(Suit.DIAMOND, Rank.NINE)
        Card card4 = new Card(Suit.DIAMOND, Rank.TEN)
        Card card5 = new Card(Suit.DIAMOND, Rank.JACK)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String straightFlush = Hand.handRanking(deck)

        then:
        straightFlush == "Straight Flush"
    }

    def 'Four of a Kind com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.NINE)
        Card card2 = new Card(Suit.SPADE, Rank.NINE)
        Card card3 = new Card(Suit.CLUB, Rank.NINE)
        Card card4 = new Card(Suit.DIAMOND, Rank.NINE)
        Card card5 = new Card(Suit.DIAMOND, Rank.THREE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String fourOfAKind = Hand.handRanking(deck)

        then:
        fourOfAKind == "Four of a Kind"
    }

    def 'Full House com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.SIX)
        Card card2 = new Card(Suit.SPADE, Rank.SIX)
        Card card3 = new Card(Suit.HEART, Rank.SIX)
        Card card4 = new Card(Suit.CLUB, Rank.THREE)
        Card card5 = new Card(Suit.SPADE, Rank.THREE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String fullHouse = Hand.handRanking(deck)

        then:
        fullHouse == "Full House"
    }

    def 'Flush com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.TWO)
        Card card2 = new Card(Suit.HEART, Rank.SEVEN)
        Card card3 = new Card(Suit.HEART, Rank.JACK)
        Card card4 = new Card(Suit.HEART, Rank.ACE)
        Card card5 = new Card(Suit.HEART, Rank.FOUR)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String flush = Hand.handRanking(deck)

        then:
        flush == "Flush"
    }

    def 'Straight com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.THREE)
        Card card2 = new Card(Suit.CLUB, Rank.FOUR)
        Card card3 = new Card(Suit.DIAMOND, Rank.FIVE)
        Card card4 = new Card(Suit.SPADE, Rank.SIX)
        Card card5 = new Card(Suit.HEART, Rank.SEVEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String straight = Hand.handRanking(deck)

        then:
        straight == "Straight"
    }

    def 'Three of a Kind com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.EIGHT)
        Card card2 = new Card(Suit.SPADE, Rank.EIGHT)
        Card card3 = new Card(Suit.CLUB, Rank.EIGHT)
        Card card4 = new Card(Suit.CLUB, Rank.TWO)
        //com.pockerbomb.model.cards.Card card5 = new com.pockerbomb.model.cards.Card(com.pockerbomb.model.cards.Suit.DIAMOND, com.pockerbomb.model.cards.Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        //deck.addCard(card5)

        when:
        String threeOfAKind = Hand.handRanking(deck)

        then:
        threeOfAKind == "Three of a Kind"
    }

    def 'Two Pairs com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.QUEEN)
        Card card2 = new Card(Suit.SPADE, Rank.QUEEN)
        Card card3 = new Card(Suit.HEART, Rank.FIVE)
        Card card4 = new Card(Suit.CLUB, Rank.TWO)
        Card card5 = new Card(Suit.SPADE, Rank.FIVE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String twoPairs = Hand.handRanking(deck)

        then:
        twoPairs == "Two Pairs"
    }

    def 'Pair com.pockerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.NINE)
        Card card2 = new Card(Suit.HEART, Rank.NINE)
        Card card3 = new Card(Suit.SPADE, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)

        when:
        String pair = Hand.handRanking(deck)

        then:
        pair == "Pair"
    }

    def 'None'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.ACE)
        //com.pockerbomb.model.cards.Card card2 = new com.pockerbomb.model.cards.Card(com.pockerbomb.model.cards.Suit.HEART, com.pockerbomb.model.cards.Rank.NINE)
        //com.pockerbomb.model.cards.Card card3 = new com.pockerbomb.model.cards.Card(com.pockerbomb.model.cards.Suit.SPADE, com.pockerbomb.model.cards.Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        //deck.addCard(card2)
        //deck.addCard(card3)

        when:
        String none = Hand.handRanking(deck)

        then:
        none == "None"
    }
}
