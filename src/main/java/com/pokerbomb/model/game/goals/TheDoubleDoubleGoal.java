package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class TheDoubleDoubleGoal extends Goal implements GoalIncrement {
    public TheDoubleDoubleGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "THE DOUBLE DOUBLE";
        this.description = String.format("COLLECT %s \"TWO PAIRS\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            if (Hand.isTwoPairs(hand.getCards())) {
                currentQuantity++;
            }
            checkAchieved();
        }
    }
}
