package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class RunRabbitRunGoal extends Goal implements GoalIncrement {

    public RunRabbitRunGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "RUN RABBIT RUN!";
        this.description = String.format("COLLECT %s \"STRAIGHT\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            if (Hand.isStraight(hand.getCards())) {
                currentQuantity++;
            }
            checkAchieved();
        }
    }
}
