package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class GiveUsAHandGoal extends Goal implements GoalIncrement {
    public GiveUsAHandGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "GIVE US A HAND";
        this.description = String.format("COLLECT %s HANDS OF ANY KIND", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            currentQuantity++;
            checkAchieved();
        }
    }
}
