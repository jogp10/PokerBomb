package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class InDaClubSpockTest extends Specification {
    def 'In Da Club com.pockerbomb.model.game.goals'() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new Card(Suit.DIAMOND, Rank.SIX)
        Card card2 = new Card(Suit.CLUB, Rank.SIX)
        Card card3 = new Card(Suit.HEART, Rank.SEVEN)
        Card card4 = new Card(Suit.CLUB, Rank.SEVEN)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hand1.addCard(card3)
        hand1.addCard(card4)
        hands.add(hand1)

        Card card5 = new Card(Suit.HEART, Rank.ACE)
        Card card6 = new Card(Suit.CLUB, Rank.ACE)
        Hand hand2 = new Hand()
        hand2.addCard(card5)
        hand2.addCard(card6)
        hands.add(hand2)

        Card card7 = new Card(Suit.DIAMOND, Rank.TEN)
        Card card8 = new Card(Suit.HEART, Rank.TEN)
        Card card9 = new Card(Suit.CLUB, Rank.TEN)
        Card card10 = new Card(Suit.HEART, Rank.KING)
        Card card11 = new Card(Suit.SPADE, Rank.KING)
        Hand hand3 = new Hand()
        hand3.addCard(card7)
        hand3.addCard(card8)
        hand3.addCard(card9)
        hand3.addCard(card10)
        hand3.addCard(card11)
        hands.add(hand3)

        Card card12 = new Card(Suit.DIAMOND, Rank.JACK)
        Card card13 = new Card(Suit.CLUB, Rank.JACK)
        Card card14 = new Card(Suit.DIAMOND, Rank.ACE)
        Card card15 = new Card(Suit.SPADE, Rank.ACE)
        Hand hand4 = new Hand()
        hand4.addCard(card12)
        hand4.addCard(card13)
        hand4.addCard(card14)
        hand4.addCard(card15)
        hands.add(hand4)

        Card card16 = new Card(Suit.DIAMOND, Rank.TWO)
        Card card17 = new Card(Suit.HEART, Rank.TWO)
        Card card18 = new Card(Suit.HEART, Rank.THREE)
        Card card19 = new Card(Suit.SPADE, Rank.THREE)
        Card card20 = new Card(Suit.CLUB, Rank.THREE)
        Hand hand5 = new Hand()
        hand5.addCard(card16)
        hand5.addCard(card17)
        hand5.addCard(card18)
        hand5.addCard(card19)
        hand5.addCard(card20)
        hands.add(hand5)

        Card card21 = new Card(Suit.DIAMOND, Rank.SEVEN)
        Card card22 = new Card(Suit.SPADE, Rank.SEVEN)
        Card card23 = new Card(Suit.SPADE, Rank.EIGHT)
        Card card24 = new Card(Suit.CLUB, Rank.EIGHT)
        Hand hand6 = new Hand()
        hand6.addCard(card21)
        hand6.addCard(card22)
        hand6.addCard(card23)
        hand6.addCard(card24)
        hands.add(hand6)

        Card card25 = new Card(Suit.SPADE, Rank.FOUR)
        Card card26 = new Card(Suit.CLUB, Rank.FOUR)
        Card card27 = new Card(Suit.DIAMOND, Rank.FIVE)
        Card card28 = new Card(Suit.CLUB, Rank.FIVE)
        Hand hand7 = new Hand()
        hand7.addCard(card25)
        hand7.addCard(card26)
        hand7.addCard(card27)
        hand7.addCard(card28)
        hands.add(hand7)

        Card card29 = new Card(Suit.DIAMOND, Rank.QUEEN)
        Card card30 = new Card(Suit.CLUB, Rank.QUEEN)
        Card card31 = new Card(Suit.DIAMOND, Rank.KING)
        Card card32 = new Card(Suit.CLUB, Rank.KING)
        Hand hand8 = new Hand()
        hand8.addCard(card29)
        hand8.addCard(card30)
        hand8.addCard(card31)
        hand8.addCard(card32)
        hands.add(hand8)

        Card card33 = new Card(Suit.HEART, Rank.SIX)
        Card card34 = new Card(Suit.SPADE, Rank.SIX)
        Card card35 = new Card(Suit.DIAMOND, Rank.NINE)
        Card card36 = new Card(Suit.HEART, Rank.NINE)
        Card card37 = new Card(Suit.CLUB, Rank.NINE)
        Hand hand9 = new Hand()
        hand9.addCard(card33)
        hand9.addCard(card34)
        hand9.addCard(card35)
        hand9.addCard(card36)
        hand9.addCard(card37)
        hands.add(hand9)

        Card card38 = new Card(Suit.SPADE, Rank.TWO)
        Card card39 = new Card(Suit.CLUB, Rank.TWO)
        Hand hand10 = new Hand()
        hand10.addCard(card38)
        hand10.addCard(card39)
        hands.add(hand10)

        Card card40 = new Card(Suit.DIAMOND, Rank.FOUR)
        Card card41 = new Card(Suit.SPADE, Rank.FOUR)
        Card card42 = new Card(Suit.CLUB, Rank.FOUR)
        Hand hand11 = new Hand()
        hand11.addCard(card40)
        hand11.addCard(card41)
        hand11.addCard(card42)
        hands.add(hand11)

        Card card43 = new Card(Suit.DIAMOND, Rank.TWO)
        Card card44 = new Card(Suit.HEART, Rank.TWO)
        Card card45 = new Card(Suit.DIAMOND, Rank.THREE)
        Card card46 = new Card(Suit.CLUB, Rank.THREE)
        Hand hand12 = new Hand()
        hand12.addCard(card43)
        hand12.addCard(card44)
        hand12.addCard(card45)
        hand12.addCard(card46)
        hands.add(hand12)

        InDaClubGoal goal = new InDaClubGoal(Type.CLUBS, 15)

        when:
        for (Hand hand : hands) {
            goal.increment(hand)
        }

        then:
        goal.isAchieved()
    }
}
