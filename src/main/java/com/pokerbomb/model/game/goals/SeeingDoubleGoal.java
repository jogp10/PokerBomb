package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class SeeingDoubleGoal extends Goal implements GoalIncrement {
    public SeeingDoubleGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "SEEING DOUBLE";
        this.description = String.format("COLLECT %s \"PAIRS\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            if (Hand.isPair(hand.getCards())) {
                currentQuantity++;
            }
            checkAchieved();
        }
    }
}
