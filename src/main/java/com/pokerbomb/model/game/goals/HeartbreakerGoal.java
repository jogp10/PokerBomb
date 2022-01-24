package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Hand;
import com.pokerbomb.model.game.cards.Suit;

public class HeartbreakerGoal extends Goal implements GoalIncrement {
    public HeartbreakerGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "HEARTBREAKER!";
        this.description = String.format("COLLECT %s HEART CARDS", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            for (Card card : hand.getCards()) {
                if (card.getSuit() == Suit.HEART) {
                    currentQuantity++;
                    checkAchieved();
                }
            }
        }
    }
}
