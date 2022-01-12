package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class Level16SpockTest extends Specification {
    def 'Level 16 com.pockerbomb.model.game.goals'() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new Card(Suit.SPADE, Rank.FIVE)
        Card card2 = new Card(Suit.CLUB, Rank.FIVE)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hands.add(hand1)

        Card card3 = new Card(Suit.DIAMOND, Rank.NINE)
        Card card4 = new Card(Suit.SPADE, Rank.NINE)
        Hand hand2 = new Hand()
        hand2.addCard(card3)
        hand2.addCard(card4)
        hands.add(hand2)

        Card card5 = new Card(Suit.DIAMOND, Rank.TWO)
        Card card6 = new Card(Suit.SPADE, Rank.TWO)
        Card card7 = new Card(Suit.CLUB, Rank.TWO)
        Card card8 = new Card(Suit.DIAMOND, Rank.QUEEN)
        Card card9 = new Card(Suit.SPADE, Rank.QUEEN)
        Hand hand3 = new Hand()
        hand3.addCard(card5)
        hand3.addCard(card6)
        hand3.addCard(card7)
        hand3.addCard(card8)
        hand3.addCard(card9)
        hands.add(hand3)

        Card card10 = new Card(Suit.DIAMOND, Rank.TEN)
        Card card11 = new Card(Suit.CLUB, Rank.TEN)
        Hand hand4 = new Hand()
        hand4.addCard(card10)
        hand4.addCard(card11)
        hands.add(hand4)

        Card card12 = new Card(Suit.DIAMOND, Rank.FIVE)
        Card card13 = new Card(Suit.HEART, Rank.FIVE)
        Hand hand5 = new Hand()
        hand5.addCard(card12)
        hand5.addCard(card13)
        hands.add(hand5)

        Card card14 = new Card(Suit.HEART, Rank.SEVEN)
        Card card15 = new Card(Suit.SPADE, Rank.SEVEN)
        Hand hand6 = new Hand()
        hand6.addCard(card14)
        hand6.addCard(card15)
        hands.add(hand6)

        Card card16 = new Card(Suit.DIAMOND, Rank.FOUR)
        Card card17 = new Card(Suit.HEART, Rank.FOUR)
        Hand hand7 = new Hand()
        hand7.addCard(card16)
        hand7.addCard(card17)
        hands.add(hand7)

        Card card18 = new Card(Suit.SPADE, Rank.JACK)
        Card card19 = new Card(Suit.CLUB, Rank.JACK)
        Hand hand8 = new Hand()
        hand8.addCard(card18)
        hand8.addCard(card19)
        hands.add(hand8)

        Card card20 = new Card(Suit.HEART, Rank.THREE)
        Card card21 = new Card(Suit.SPADE, Rank.THREE)
        Card card22 = new Card(Suit.DIAMOND, Rank.ACE)
        Card card23 = new Card(Suit.HEART, Rank.ACE)
        Card card24 = new Card(Suit.CLUB, Rank.ACE)
        Hand hand9 = new Hand()
        hand9.addCard(card20)
        hand9.addCard(card21)
        hand9.addCard(card22)
        hand9.addCard(card23)
        hand9.addCard(card24)
        hands.add(hand9)

        TheHouseIsFullGoal goal = new TheHouseIsFullGoal(Type.FULL_HOUSE, 2)

        when:
        for (Hand hand : hands) {
            goal.increment(hand)
        }

        then:
        goal.isAchieved()
    }
}
