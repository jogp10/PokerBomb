package com.pockerbomb;

public class JungleCard extends Card implements GenericSpecialCard {
    private int specialAttribute;
    private int countToAddAttribute;


    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 1;
        countToAddAttribute = 0;
    }

    @Override
    public boolean PlayWithoutCombo() {
        countToAddAttribute++;
        if(countToAddAttribute==3){
            specialAttribute++;
            countToAddAttribute=0;
        }
        if(specialAttribute>3) specialAttribute=3;
        return specialAttribute==0;
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
