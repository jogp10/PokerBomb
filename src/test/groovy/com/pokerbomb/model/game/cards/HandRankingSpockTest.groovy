package com.pokerbomb.model.game.cards


import spock.lang.Specification

class HandRankingSpockTest extends Specification {

    def 'Royal Flush com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.HEART, Rank.TEN)
        Card card2 = new NormalCard(Suit.HEART, Rank.JACK)
        Card card3 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Card card4 = new NormalCard(Suit.HEART, Rank.KING)
        Card card5 = new NormalCard(Suit.HEART, Rank.ACE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String royalFlush = Hand.handRanking(deck.getDeck())

        then:
        royalFlush == "ROYAL FLUSH"
    }

    def 'Straight Flush com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        Card card2 = new NormalCard(Suit.DIAMOND, Rank.EIGHT)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card4 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card5 = new NormalCard(Suit.DIAMOND, Rank.JACK)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String straightFlush = Hand.handRanking(deck.getDeck())

        then:
        straightFlush == "STRAIGHT FLUSH"
    }

    def 'Four of a Kind com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.HEART, Rank.NINE)
        Card card2 = new NormalCard(Suit.SPADE, Rank.NINE)
        Card card3 = new NormalCard(Suit.CLUB, Rank.NINE)
        Card card4 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card5 = new NormalCard(Suit.DIAMOND, Rank.THREE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String fourOfAKind = Hand.handRanking(deck.getDeck())

        then:
        fourOfAKind == "FOUR OF A KIND"
    }

    def 'Full House com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Card card2 = new NormalCard(Suit.SPADE, Rank.SIX)
        Card card3 = new NormalCard(Suit.HEART, Rank.SIX)
        Card card4 = new NormalCard(Suit.CLUB, Rank.THREE)
        Card card5 = new NormalCard(Suit.SPADE, Rank.THREE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String fullHouse = Hand.handRanking(deck.getDeck())

        then:
        fullHouse == "FULL HOUSE"
    }

    def 'Flush com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.HEART, Rank.TWO)
        Card card2 = new NormalCard(Suit.HEART, Rank.SEVEN)
        Card card3 = new NormalCard(Suit.HEART, Rank.JACK)
        Card card4 = new NormalCard(Suit.HEART, Rank.ACE)
        Card card5 = new NormalCard(Suit.HEART, Rank.FOUR)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String flush = Hand.handRanking(deck.getDeck())

        then:
        flush == "FLUSH"
    }

    def 'Straight com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card2 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Card card3 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        Card card4 = new NormalCard(Suit.SPADE, Rank.SIX)
        Card card5 = new NormalCard(Suit.HEART, Rank.SEVEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String straight = Hand.handRanking(deck.getDeck())

        then:
        straight == "STRAIGHT"
    }

    def 'Three of a Kind com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.HEART, Rank.EIGHT)
        Card card2 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        Card card3 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Card card4 = new NormalCard(Suit.CLUB, Rank.TWO)
        //com.pockerbomb.model.cards.Card card5 = new com.pockerbomb.model.cards.Card(com.pockerbomb.model.cards.Suit.DIAMOND, com.pockerbomb.model.cards.Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        //deck.addCard(card5)

        when:
        String threeOfAKind = Hand.handRanking(deck.getDeck())

        then:
        threeOfAKind == "THREE OF A KIND"
    }

    def 'Two Pairs com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        Card card2 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Card card3 = new NormalCard(Suit.HEART, Rank.FIVE)
        Card card4 = new NormalCard(Suit.CLUB, Rank.TWO)
        Card card5 = new NormalCard(Suit.SPADE, Rank.FIVE)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        deck.addCard(card5)

        when:
        String twoPairs = Hand.handRanking(deck.getDeck())

        then:
        twoPairs == "TWO PAIRS"
    }

    def 'Pair com.pokerbomb.model.game.cards.Hand'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card2 = new NormalCard(Suit.HEART, Rank.NINE)
        Card card3 = new NormalCard(Suit.SPADE, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)

        when:
        String pair = Hand.handRanking(deck.getDeck())

        then:
        pair == "PAIR"
    }

    def 'None'() {
        given:
        Card card1 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        //com.pockerbomb.model.cards.Card card2 = new com.pockerbomb.model.cards.Card(com.pockerbomb.model.cards.Suit.HEART, com.pockerbomb.model.cards.Rank.NINE)
        //com.pockerbomb.model.cards.Card card3 = new com.pockerbomb.model.cards.Card(com.pockerbomb.model.cards.Suit.SPADE, com.pockerbomb.model.cards.Rank.TEN)


        Deck deck = new Deck()

        deck.addCard(card1)
        //deck.addCard(card2)
        //deck.addCard(card3)

        when:
        String none = Hand.handRanking(deck.getDeck())

        then:
        none == ""
    }
}
