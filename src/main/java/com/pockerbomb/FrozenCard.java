package com.pockerbomb;

public class FrozenCard extends GenericSpecialCard {

    public FrozenCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 2;
    }


    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }

}
