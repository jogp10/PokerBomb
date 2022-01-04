package com.pockerbomb;

public class JungleCard extends Card implements GenericSpecialCard{
    private int numberOfLayers;
    private int numberOfPlaysToAddLayer;

    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        numberOfLayers = 0;
        numberOfPlaysToAddLayer = 0;
    }


    @Override
    public void removeSpecialAttribute(){
        removeSpecialAttribute(1);
    }

    @Override
    public void removeSpecialAttribute(int number_layers) {
        numberOfLayers-=number_layers;
        numberOfPlaysToAddLayer=0;
    }

    @Override
    public int getSpecialAttribute(){
        return numberOfLayers;
    }

    @Override
    public boolean isActive() {
        return numberOfLayers > 0;
    }

    @Override
    public void draw() {
        if(isActive()){

        }
    }

    public void addNumberOfPlaysWithoutCombo() {
        // Add another layer if card is not in a combo after 4 plays
        numberOfPlaysToAddLayer++;

        if(numberOfPlaysToAddLayer>3 && numberOfLayers!=3){
            removeSpecialAttribute(-1);
        }
    }

}
