package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class Level12SpockTest extends Specification {
    def 'Level 12 com.pockerbomb.model.game.goals'() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new NormalCard(Suit.HEART, Rank.KING)
        Card card2 = new NormalCard(Suit.SPADE, Rank.KING)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hands.add(hand1)

        Card card3 = new NormalCard(Suit.HEART, Rank.FIVE)
        Card card4 = new NormalCard(Suit.SPADE, Rank.FIVE)
        Hand hand2 = new Hand()
        hand2.addCard(card3)
        hand2.addCard(card4)
        hands.add(hand2)

        Card card5 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        Card card6 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Hand hand3 = new Hand()
        hand3.addCard(card5)
        hand3.addCard(card6)
        hands.add(hand3)

        Card card7 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card8 = new NormalCard(Suit.HEART, Rank.THREE)
        Card card9 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card10 = new NormalCard(Suit.SPADE, Rank.FOUR)
        Hand hand4 = new Hand()
        hand4.addCard(card7)
        hand4.addCard(card8)
        hand4.addCard(card9)
        hand4.addCard(card10)
        hands.add(hand4)

        Card card11 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card12 = new NormalCard(Suit.SPADE, Rank.NINE)
        Card card13 = new NormalCard(Suit.CLUB, Rank.NINE)
        Card card14 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        Card card15 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Hand hand5 = new Hand()
        hand5.addCard(card11)
        hand5.addCard(card12)
        hand5.addCard(card13)
        hand5.addCard(card14)
        hand5.addCard(card15)
        hands.add(hand5)

        Card card16 = new NormalCard(Suit.CLUB, Rank.TEN)
        Card card17 = new NormalCard(Suit.HEART, Rank.JACK)
        Card card18 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Card card19 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Card card20 = new NormalCard(Suit.CLUB, Rank.ACE)
        Hand hand6 = new Hand()
        hand6.addCard(card16)
        hand6.addCard(card17)
        hand6.addCard(card18)
        hand6.addCard(card19)
        hand6.addCard(card20)
        hands.add(hand6)

        CardCollectorGoal goal = new CardCollectorGoal(Type.CARDS, 20)

        when:
        for (Hand hand : hands) {
            goal.increment(hand)
        }

        then:
        goal.isAchieved()
    }
}
