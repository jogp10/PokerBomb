package com.pokerbomb.model.game.cards;

public class JungleCard extends CardGeneric implements Card {
    private int countToAddAttribute;

    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 1;
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
        if(countToAddAttribute==4){
            specialAttribute++;
            countToAddAttribute=0;
        }
        if(specialAttribute>4) specialAttribute=4;
        return specialAttribute==0;
    }

    @Override
    public Card getCard() {
        return this;
    }


    public void removeSpecialAttribute(int i) {
        if(specialAttribute-i<0){
            specialAttribute=0;
        } else specialAttribute-=i;
    }
}
