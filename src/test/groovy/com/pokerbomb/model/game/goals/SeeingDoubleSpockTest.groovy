package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class SeeingDoubleSpockTest extends Specification {
    def 'Seeing Double com.pockerbomb.model.game.goals'() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card2 = new NormalCard(Suit.CLUB, Rank.TEN)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hands.add(hand1)

        Card card3 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card4 = new NormalCard(Suit.HEART, Rank.FOUR)
        Hand hand2 = new Hand()
        hand2.addCard(card3)
        hand2.addCard(card4)
        hands.add(hand2)

        Card card5 = new NormalCard(Suit.HEART, Rank.KING)
        Card card6 = new NormalCard(Suit.CLUB, Rank.KING)
        Hand hand3 = new Hand()
        hand3.addCard(card5)
        hand3.addCard(card6)
        hands.add(hand3)

        SeeingDoubleGoal goal = new SeeingDoubleGoal(Type.PAIR, 3)

        when:
        for (Hand hand : hands) {
            goal.increment(hand)
        }

        then:
        goal.isAchieved()
    }
}
