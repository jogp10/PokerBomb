package com.pockerbomb;

public class Brick extends GenericSpecialCard {

    public Brick() {
        super(Suit.HEART, Rank.ACE);
        specialAttribute = 1;
    }


    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }

}
