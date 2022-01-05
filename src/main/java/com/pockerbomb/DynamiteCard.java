package com.pockerbomb;

public class DynamiteCard extends Card implements GenericSpecialCard {
    private int specialAttribute;

    public DynamiteCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 5;
    }

    @Override
    public boolean PlayWithoutCombo() {
        removeSpecialAttribute(1);
        return specialAttribute==0;
    }

    @Override
    public boolean PlayWithCombo(int i) {
        return true;
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
