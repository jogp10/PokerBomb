package com.pokerbomb.model.game.goals

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.Hand
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class Level11SpockTest extends Specification{
    def 'Level 11 com.pockerbomb.model.game.goals'() {
        given:
        ArrayList<Hand> hands = new ArrayList<>()

        Card card1 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card2 = new NormalCard(Suit.HEART, Rank.FOUR)
        Card card3 = new NormalCard(Suit.HEART, Rank.FIVE)
        Card card4 = new NormalCard(Suit.SPADE, Rank.FIVE)
        Hand hand1 = new Hand()
        hand1.addCard(card1)
        hand1.addCard(card2)
        hand1.addCard(card3)
        hand1.addCard(card4)
        hands.add(hand1)

        Card card5 = new NormalCard(Suit.DIAMOND, Rank.SIX)
        Card card6 = new NormalCard(Suit.CLUB, Rank.SIX)
        Card card7 = new NormalCard(Suit.HEART, Rank.SEVEN)
        Card card8 = new NormalCard(Suit.CLUB, Rank.SEVEN)
        Hand hand2 = new Hand()
        hand2.addCard(card5)
        hand2.addCard(card6)
        hand2.addCard(card7)
        hand2.addCard(card8)
        hands.add(hand2)

        Card card9 = new NormalCard(Suit.HEART, Rank.ACE)
        Card card10 = new NormalCard(Suit.CLUB, Rank.ACE)
        Hand hand3 = new Hand()
        hand3.addCard(card9)
        hand3.addCard(card10)
        hands.add(hand3)

        Card card11 = new NormalCard(Suit.HEART, Rank.EIGHT)
        Card card12 = new NormalCard(Suit.SPADE, Rank.NINE)
        Card card13 = new NormalCard(Suit.SPADE, Rank.TEN)
        Card card14 = new NormalCard(Suit.SPADE, Rank.JACK)
        Card card15 = new NormalCard(Suit.HEART, Rank.QUEEN)
        Hand hand4 = new Hand()
        hand4.addCard(card11)
        hand4.addCard(card12)
        hand4.addCard(card13)
        hand4.addCard(card14)
        hand4.addCard(card15)
        hands.add(hand4)

        Card card16 = new NormalCard(Suit.DIAMOND, Rank.TEN)
        Card card17 = new NormalCard(Suit.HEART, Rank.TEN)
        Card card18 = new NormalCard(Suit.CLUB, Rank.TEN)
        Card card19 = new NormalCard(Suit.HEART, Rank.KING)
        Card card20 = new NormalCard(Suit.SPADE, Rank.KING)
        Hand hand5 = new Hand()
        hand5.addCard(card16)
        hand5.addCard(card17)
        hand5.addCard(card18)
        hand5.addCard(card19)
        hand5.addCard(card20)
        hands.add(hand5)

        Card card21 = new NormalCard(Suit.DIAMOND, Rank.JACK)
        Card card22 = new NormalCard(Suit.CLUB, Rank.JACK)
        Card card23 = new NormalCard(Suit.DIAMOND, Rank.ACE)
        Card card24 = new NormalCard(Suit.SPADE, Rank.ACE)
        Hand hand6 = new Hand()
        hand6.addCard(card21)
        hand6.addCard(card22)
        hand6.addCard(card23)
        hand6.addCard(card24)
        hands.add(hand6)

        Card card25 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        Card card26 = new NormalCard(Suit.HEART, Rank.TWO)
        Card card27 = new NormalCard(Suit.HEART, Rank.THREE)
        Card card28 = new NormalCard(Suit.SPADE, Rank.THREE)
        Card card29 = new NormalCard(Suit.CLUB, Rank.THREE)
        Hand hand7 = new Hand()
        hand7.addCard(card25)
        hand7.addCard(card26)
        hand7.addCard(card27)
        hand7.addCard(card28)
        hand7.addCard(card29)
        hands.add(hand7)

        Card card30 = new NormalCard(Suit.DIAMOND, Rank.SEVEN)
        Card card31 = new NormalCard(Suit.SPADE, Rank.SEVEN)
        Card card32 = new NormalCard(Suit.SPADE, Rank.EIGHT)
        Card card33 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Hand hand8 = new Hand()
        hand8.addCard(card30)
        hand8.addCard(card31)
        hand8.addCard(card32)
        hand8.addCard(card33)
        hands.add(hand8)

        Card card34 = new NormalCard(Suit.SPADE, Rank.FOUR)
        Card card35 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Card card36 = new NormalCard(Suit.DIAMOND, Rank.FIVE)
        Card card37 = new NormalCard(Suit.CLUB, Rank.FIVE)
        Hand hand9 = new Hand()
        hand9.addCard(card34)
        hand9.addCard(card35)
        hand9.addCard(card36)
        hand9.addCard(card37)
        hands.add(hand9)

        Card card38 = new NormalCard(Suit.DIAMOND, Rank.QUEEN)
        Card card39 = new NormalCard(Suit.CLUB, Rank.QUEEN)
        Card card40 = new NormalCard(Suit.DIAMOND, Rank.KING)
        Card card41 = new NormalCard(Suit.CLUB, Rank.KING)
        Hand hand10 = new Hand()
        hand10.addCard(card38)
        hand10.addCard(card39)
        hand10.addCard(card40)
        hand10.addCard(card41)
        hands.add(hand10)

        Card card42 = new NormalCard(Suit.HEART, Rank.SIX)
        Card card43 = new NormalCard(Suit.SPADE, Rank.SIX)
        Card card44 = new NormalCard(Suit.DIAMOND, Rank.NINE)
        Card card45 = new NormalCard(Suit.HEART, Rank.NINE)
        Card card46 = new NormalCard(Suit.CLUB, Rank.NINE)
        Hand hand11 = new Hand()
        hand11.addCard(card42)
        hand11.addCard(card43)
        hand11.addCard(card44)
        hand11.addCard(card45)
        hand11.addCard(card46)
        hands.add(hand11)

        Card card47 = new NormalCard(Suit.SPADE, Rank.TWO)
        Card card48 = new NormalCard(Suit.CLUB, Rank.TWO)
        Hand hand12 = new Hand()
        hand12.addCard(card47)
        hand12.addCard(card48)
        hands.add(hand12)

        Card card49 = new NormalCard(Suit.DIAMOND, Rank.FOUR)
        Card card50 = new NormalCard(Suit.SPADE, Rank.FOUR)
        Card card51 = new NormalCard(Suit.CLUB, Rank.FOUR)
        Hand hand13 = new Hand()
        hand13.addCard(card49)
        hand13.addCard(card50)
        hand13.addCard(card51)
        hands.add(hand13)

        Card card52 = new NormalCard(Suit.DIAMOND, Rank.TWO)
        Card card53 = new NormalCard(Suit.HEART, Rank.TWO)
        Card card54 = new NormalCard(Suit.DIAMOND, Rank.THREE)
        Card card55 = new NormalCard(Suit.CLUB, Rank.THREE)
        Hand hand14 = new Hand()
        hand14.addCard(card52)
        hand14.addCard(card53)
        hand14.addCard(card54)
        hand14.addCard(card55)
        hands.add(hand14)

        Card card56 = new NormalCard(Suit.DIAMOND, Rank.EIGHT)
        Card card57 = new NormalCard(Suit.SPADE, Rank.NINE)
        Card card58 = new NormalCard(Suit.HEART, Rank.TEN)
        Card card59 = new NormalCard(Suit.HEART, Rank.JACK)
        Card card60 = new NormalCard(Suit.SPADE, Rank.QUEEN)
        Hand hand15 = new Hand()
        hand15.addCard(card56)
        hand15.addCard(card57)
        hand15.addCard(card58)
        hand15.addCard(card59)
        hand15.addCard(card60)
        hands.add(hand15)

        InDaClubGoal goal1 = new InDaClubGoal(Type.CLUBS, 15)
        GiveUsAHandGoal goal2 = new GiveUsAHandGoal(Type.HANDS, 15)

        when:
        for (Hand hand : hands) {
            goal1.increment(hand)
            goal2.increment(hand)
        }

        then:
        goal1.isAchieved() && goal2.isAchieved()
    }
}
