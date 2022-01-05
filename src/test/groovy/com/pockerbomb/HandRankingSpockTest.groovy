package com.pockerbomb

import spock.lang.Specification

class HandRankingSpockTest extends Specification {

    def 'Royal Flush com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.TEN)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.JACK)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.QUEEN)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.KING)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.ACE)

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

    def 'Straight Flush com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        NormalCard card2 = new NormalCard(Suit.DIAMOND, Rank.EIGHT)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.JACK)

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

    def 'Four of a Kind com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.NINE)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.NINE)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.NINE)
        NormalCard card4 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        NormalCard card5 = new NormalCard(Suit.DIAMOND, Rank.THREE)

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

    def 'Full House com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.SIX)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.SIX)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.THREE)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.THREE)

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

    def 'Flush com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.TWO)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.SEVEN)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.JACK)
        NormalCard card4 = new NormalCard(Suit.HEART, Rank.ACE)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.FOUR)

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

    def 'Straight com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        NormalCard card2 = new NormalCard(Suit.CLUB, Rank.FOUR)
        NormalCard card3 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        NormalCard card4 = new NormalCard(Suit.SPADE, Rank.SIX)
        NormalCard card5 = new NormalCard(Suit.HEART, Rank.SEVEN)

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

    def 'Three of a Kind com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.HEART, Rank.EIGHT)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        NormalCard card3 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.TWO)
        //com.pockerbomb.Card card5 = new com.pockerbomb.Card(com.pockerbomb.Suit.DIAMOND, com.pockerbomb.Rank.TEN)

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

    def 'Two Pairs com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        NormalCard card2 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        NormalCard card3 = new NormalCard(Suit.HEART, Rank.FIVE)
        NormalCard card4 = new NormalCard(Suit.CLUB, Rank.TWO)
        NormalCard card5 = new NormalCard(Suit.SPADE, Rank.FIVE)

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

    def 'Pair com.pockerbomb.Hand'() {
        given:
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        NormalCard card2 = new NormalCard(Suit.HEART, Rank.NINE)
        NormalCard card3 = new NormalCard(Suit.SPADE, Rank.TEN)

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
        NormalCard card1 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        //com.pockerbomb.Card card2 = new com.pockerbomb.Card(com.pockerbomb.Suit.HEART, com.pockerbomb.Rank.NINE)
        //com.pockerbomb.Card card3 = new com.pockerbomb.Card(com.pockerbomb.Suit.SPADE, com.pockerbomb.Rank.TEN)

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
