package com.pockerbomb.model.game.cards;

public interface GenericSpecialCard {
    void removeSpecialAttribute(int i);
    int getSpecialAttribute();
    boolean isActive();
}
