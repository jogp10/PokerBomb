package com.pockerbomb;

public class FrozenCard extends Card implements GenericSpecialCard {
    private int specialAttribute;


    public FrozenCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 2;
    }

    @Override
    public boolean PlayWithoutCombo() {
        return false;
    }

    @Override
    public boolean PlayWithCombo(int i) {
        removeSpecialAttribute(i);
        return specialAttribute==0;
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

    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }
}
