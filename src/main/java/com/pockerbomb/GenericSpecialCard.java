package com.pockerbomb;

public abstract class GenericSpecialCard extends Card {
    protected int specialAttribute;

    GenericSpecialCard(Suit suit, Rank rank){
        super(suit, rank);
    }

    void removeSpecialAttribute() {
        specialAttribute--;

    }

    void removeSpecialAttribute(int i) {
        specialAttribute-=i;
    }

    int getSpecialAttribute() {
        return specialAttribute;
    }

    boolean isActive() {
        return specialAttribute > 0;
    }
}
