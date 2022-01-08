package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.DynamiteCard;

public class DynamitePowerUp implements GenericPowerUp{
    private int numberOfPowerUp;

    DynamitePowerUp(){
        numberOfPowerUp=0;
    }

    @Override
    public int getNumberOfPowerUp() {
        return numberOfPowerUp;
    }

    @Override
    public void addPowerUp() {
        numberOfPowerUp++;
    }

    public boolean addPlayToDynamiteCard(DynamiteCard dynamiteCard, int numberPlays){
        int i = dynamiteCard.getSpecialAttribute();
        dynamiteCard.removeSpecialAttribute(-numberPlays);
        if(dynamiteCard.getSpecialAttribute()==i+numberPlays) return true;
        return false;
    }


}
