package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class CardCollectorGoal extends Goal implements GoalIncrement {
    public CardCollectorGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "CARD COLLECTOR";
        this.description = String.format("Collect %s cards of any kind", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        for (int i = 0; i < hand.getCards().size(); i++) {
            currentQuantity++;
        }
        checkAchieved();
    }
}
