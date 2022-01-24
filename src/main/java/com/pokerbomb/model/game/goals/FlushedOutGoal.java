package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class FlushedOutGoal extends Goal implements GoalIncrement{
    public FlushedOutGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "FLUSHED OUT";
        this.description = String.format("COLLECT %s \"FLUSHES\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            if (Hand.isFlush(hand.getCards())) {
                currentQuantity++;
            }
            checkAchieved();
        }
    }
}
