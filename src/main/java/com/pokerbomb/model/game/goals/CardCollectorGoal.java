package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class CardCollectorGoal extends Goal implements GoalIncrement {
    public CardCollectorGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "CARD COLLECTOR";
        this.description = String.format("COLLECT %s CARDS OF ANY KIND", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            for (int i = 0; i < hand.getCards().size(); i++) {
                currentQuantity++;
                checkAchieved();
            }
        }
    }
}
