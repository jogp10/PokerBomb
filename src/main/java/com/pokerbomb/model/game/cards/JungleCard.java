package com.pokerbomb.model.game.cards;

public class JungleCard extends Card {
    private int countToAddAttribute;

    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 0;
        countToAddAttribute = 0;
    }

    @Override
    public boolean inACombo(int i) {
        removeSpecialAttribute(i);
        return specialAttribute==0;
    }

    @Override
    public boolean notInACombo() {
        countToAddAttribute++;
        if(countToAddAttribute==3){
            specialAttribute++;
            countToAddAttribute=0;
        }
        if(specialAttribute>3) specialAttribute=3;
        return specialAttribute==0;
    }


    public void removeSpecialAttribute(int i) {
        if(specialAttribute-i<0){
            specialAttribute=0;
        } else specialAttribute-=i;
    }
}
