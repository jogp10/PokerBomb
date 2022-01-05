package com.pockerbomb;

public class BomberCard extends NormalCard implements GenericSpecialCard {
    private int numOfPlaysTillBomb;

    public BomberCard(Suit suit, Rank rank) {
        super(suit, rank);
        numOfPlaysTillBomb = 7;
    }

    @Override
    public void removeSpecialAttribute(int number_plays) {
        if(numOfPlaysTillBomb-number_plays<0){
            numOfPlaysTillBomb=0;
        } else numOfPlaysTillBomb-=number_plays;
    }

    @Override
    public int getSpecialAttribute() {
        return numOfPlaysTillBomb;
    }

    @Override
    public boolean isActive() {
        return numOfPlaysTillBomb>0;
    }

    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }
}
