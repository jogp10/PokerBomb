import spock.lang.Specification

class HandRankingSpockTest extends Specification {

    def 'Royal Flush Hand'() {
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
        String royalFlush = Hand.handRaking(deck)

        then:
        royalFlush == "Royal Flush"
    }

    def 'Straight Flush Hand'() {
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
        String straightFlush = Hand.handRaking(deck)

        then:
        straightFlush == "Straight Flush"
    }

    def 'Four of a Kind Hand'() {
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
        String fourOfAKind = Hand.handRaking(deck)

        then:
        fourOfAKind == "Four of a Kind"
    }

    def 'Full House Hand'() {
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
        String fullHouse = Hand.handRaking(deck)

        then:
        fullHouse == "Full House"
    }

    def 'Flush Hand'() {
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
        String flush = Hand.handRaking(deck)

        then:
        flush == "Flush"
    }

    def 'Straight Hand'() {
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
        String straight = Hand.handRaking(deck)

        then:
        straight == "Straight"
    }

    def 'Three of a Kind Hand'() {
        given:
        Card card1 = new Card(Suit.HEART, Rank.EIGHT)
        Card card2 = new Card(Suit.SPADE, Rank.EIGHT)
        Card card3 = new Card(Suit.CLUB, Rank.EIGHT)
        Card card4 = new Card(Suit.CLUB, Rank.TWO)
        //Card card5 = new Card(Suit.DIAMOND, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)
        deck.addCard(card4)
        //deck.addCard(card5)

        when:
        String threeOfAKind = Hand.handRaking(deck)

        then:
        threeOfAKind == "Three of a Kind"
    }

    def 'Two Pairs Hand'() {
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
        String twoPairs = Hand.handRaking(deck)

        then:
        twoPairs == "Two Pairs"
    }

    def 'Pair Hand'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.NINE)
        Card card2 = new Card(Suit.HEART, Rank.NINE)
        Card card3 = new Card(Suit.SPADE, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        deck.addCard(card2)
        deck.addCard(card3)

        when:
        String pair = Hand.handRaking(deck)

        then:
        pair == "Pair"
    }

    def 'None'() {
        given:
        Card card1 = new Card(Suit.DIAMOND, Rank.ACE)
        //Card card2 = new Card(Suit.HEART, Rank.NINE)
        //Card card3 = new Card(Suit.SPADE, Rank.TEN)

        Deck deck = new Deck()

        deck.addCard(card1)
        //deck.addCard(card2)
        //deck.addCard(card3)

        when:
        String none = Hand.handRaking(deck)

        then:
        none == "None"
    }
}
