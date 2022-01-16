package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Hand;
import com.pokerbomb.model.game.cards.Suit;

public class DiamondMinerGoal extends Goal implements GoalIncrement {
    public DiamondMinerGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "DIAMOND MINER";
        this.description = String.format("Collect %s diamond cards", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            for (Card card : hand.getCards()) {
                if (card.getSuit() == Suit.DIAMOND) {
                    currentQuantity++;
                    checkAchieved();
                }
            }
        }
    }
}
