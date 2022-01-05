package com.pockerbomb.model.game.cards;

public class FrozenCard extends Card implements GenericSpecialCard {
    private int specialAttribute;


    public FrozenCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 2;
    }

    @Override
    boolean inACombo(int i) {
        removeSpecialAttribute(i);
        return specialAttribute==0;
    }

    @Override
    boolean notInACombo() {
        return false;
    }


    @Override
    public void removeSpecialAttribute(int i) {
        if(specialAttribute-i<0){
            specialAttribute=0;
        } else specialAttribute-=i;
    }

    @Override
    public int getSpecialAttribute() {
        return specialAttribute;
    }

    @Override
    public boolean isActive() {
        return specialAttribute>0;
    }
}
