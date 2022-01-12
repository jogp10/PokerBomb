package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class TheDoubleDoubleGoal extends Goal implements GoalIncrement {
    public TheDoubleDoubleGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "THE DOUBLE DOUBLE";
        this.description = String.format("Collect %s \"two pairs\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (Hand.isTwoPairs(hand.getCards())) {
            currentQuantity++;
        }
        checkAchieved();
    }
}
