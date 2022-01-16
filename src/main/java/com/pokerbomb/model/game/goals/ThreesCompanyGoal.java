package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Hand;

public class ThreesCompanyGoal extends Goal implements GoalIncrement {

    public ThreesCompanyGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "THREE'S COMPANY";
        this.description = String.format("Collect %s \"three of a kind\"", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            if (Hand.isThreeOfAKind(hand.getCards())) {
                currentQuantity++;
            }
            checkAchieved();
        }
    }
}
