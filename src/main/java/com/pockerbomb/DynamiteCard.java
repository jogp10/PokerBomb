package com.pockerbomb;

public class DynamiteCard extends NormalCard implements GenericSpecialCard {
    private int numOfPlaysTillDynamite;
    public DynamiteCard(Suit suit, Rank rank) {
        super(suit, rank);
        numOfPlaysTillDynamite = 5;
    }


    @Override
    public void removeSpecialAttribute(int number_plays) {
        if(numOfPlaysTillDynamite-number_plays<0){
            numOfPlaysTillDynamite=0;
        } else numOfPlaysTillDynamite-=number_plays;
    }

    @Override
    public int getSpecialAttribute() {
        return numOfPlaysTillDynamite;
    }

    @Override
    public boolean isActive() {
        return numOfPlaysTillDynamite>0;
    }

    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }

}
