package com.pockerbomb;

public class DynamiteCard extends GenericSpecialCard {

    public DynamiteCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 5;
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
