package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Hand;
import com.pokerbomb.model.game.cards.Suit;

public class CanYouDigItGoal extends Goal implements GoalIncrement {
    public CanYouDigItGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "CAN YOU DIG IT?";
        this.description = String.format("Collect %s spade cards", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            for (Card card : hand.getCards()) {
                if (card.getSuit() == Suit.SPADE) {
                    currentQuantity++;
                    checkAchieved();
                }
            }
        }
    }
}
