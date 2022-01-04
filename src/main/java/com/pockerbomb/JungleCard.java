package com.pockerbomb;

public class JungleCard extends GenericSpecialCard {
    private int numberOfPlaysToAddLayer;

    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 0;
        numberOfPlaysToAddLayer = 0;
    }


    @Override
    public void removeSpecialAttribute(){
        removeSpecialAttribute(1);
    }

    @Override
    public void removeSpecialAttribute(int number_layers) {
        specialAttribute-=number_layers;
        numberOfPlaysToAddLayer=0;
    }

    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }

    public void addNumberOfPlaysWithoutCombo() {
        // Add another layer if card is not in a combo after 4 plays
        numberOfPlaysToAddLayer++;

        if(numberOfPlaysToAddLayer>3 && specialAttribute!=3){
            removeSpecialAttribute(-1);
        }
    }

}
