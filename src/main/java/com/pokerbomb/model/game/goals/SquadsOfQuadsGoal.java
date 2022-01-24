package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class SquadsOfQuadsGoal extends Goal implements GoalIncrement {

    public SquadsOfQuadsGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "SQUADS OF QUADS";
        this.description = String.format("COLLECT %s \"FOUR OF A KIND\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            if (Hand.isFourOfAKind(hand.getCards())) {
                currentQuantity++;
            }
            checkAchieved();
        }
    }
}
