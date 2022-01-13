package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class ThreesCompanySpockTest extends Specification {
    def "Three's Company com.pockerbomb.model.game.goals"() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Card card2 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Card card3 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hand1.addCard(card3)
        hands.add(hand1)

        ThreesCompanyGoal goal = new ThreesCompanyGoal(Type.THREE_OF_A_KIND, 1)

        when:
        for (Hand hand : hands) {
            goal.increment(hand)
        }

        then:
        goal.isAchieved()
    }
}
