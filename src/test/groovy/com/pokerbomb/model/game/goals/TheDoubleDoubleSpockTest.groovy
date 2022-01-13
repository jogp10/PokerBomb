package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class TheDoubleDoubleSpockTest extends Specification {
    def 'The Double Double com.pockerbomb.model.game.goals'() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new Card(Suit.HEART, Rank.THREE)
        Card card2 = new Card(Suit.SPADE, Rank.THREE)
        Card card3 = new Card(Suit.DIAMOND, Rank.FIVE)
        Card card4 = new Card(Suit.HEART, Rank.FIVE)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hand1.addCard(card3)
        hand1.addCard(card4)
        hands.add(hand1)

        Card card5 = new Card(Suit.DIAMOND, Rank.JACK)
        Card card6 = new Card(Suit.CLUB, Rank.JACK)
        Card card7 = new Card(Suit.DIAMOND, Rank.ACE)
        Card card8 = new Card(Suit.CLUB, Rank.ACE)
        Hand hand2 = new Hand()
        hand2.addCard(card5)
        hand2.addCard(card6)
        hand2.addCard(card7)
        hand2.addCard(card8)
        hands.add(hand2)

        TheDoubleDoubleGoal goal = new TheDoubleDoubleGoal(Type.TWO_PAIRS, 2)

        when:
        for (Hand hand : hands) {
            goal.increment(hand)
        }

        then:
        goal.isAchieved()
    }
}
