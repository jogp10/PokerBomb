package com.pockerbomb;

public class BomberCard extends GenericSpecialCard {

    public BomberCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 7;
    }

    @Override
    public void removeSpecialAttribute(int number_plays) {
        removeSpecialAttribute();
    }

    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }

}
