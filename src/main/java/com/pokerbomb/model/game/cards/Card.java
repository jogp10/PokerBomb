package com.pokerbomb.model.game.cards;

import com.pokerbomb.model.Model;

public interface Card extends Model {
    String toString();

    Rank getRank();

    Suit getSuit();

    int getRankValue();

    int getSuitValue();

    boolean isActive();

    int getSpecialAttribute();

    boolean inACombo(int i);

    boolean notInACombo();

    Card getCard();
}
