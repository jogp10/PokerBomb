package com.pockerbomb.model.game.cards;

import com.pockerbomb.model.Model;

public interface GenericSpecialCard extends Model {
    void removeSpecialAttribute(int i);
    int getSpecialAttribute();
    boolean isActive();
}
