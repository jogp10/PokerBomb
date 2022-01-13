package com.pokerbomb.model.game.cards;

public class FrozenCard extends CardGeneric implements Card {

    public FrozenCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 2;
    }

    @Override
    public boolean inACombo(int i) {
        removeSpecialAttribute(i);
        return specialAttribute==0;
    }

    @Override
    public boolean notInACombo() {
        return false;
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
