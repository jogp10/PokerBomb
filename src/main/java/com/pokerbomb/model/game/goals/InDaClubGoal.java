package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Hand;
import com.pokerbomb.model.game.cards.Suit;

public class InDaClubGoal extends Goal implements GoalIncrement {
    public InDaClubGoal(Type type, int totalQuantity) {
        super(type, totalQuantity);
        this.name = "IN DA CLUB";
        this.description = String.format("Collect %s hands of any kind", totalQuantity);
    }

    @Override
    public void increment(Hand hand) {
        if (!isAchieved()) {
            for (Card card : hand.getCards()) {
                if (card.getSuit() == Suit.CLUB) {
                    currentQuantity++;
                    checkAchieved();
                }
            }
        }
    }
}
