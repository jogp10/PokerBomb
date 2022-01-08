package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.DynamiteCard;

public class DynamitePowerUp implements GenericPowerUp{
    private int numberOfPowerUp;

    DynamitePowerUp(){

    }

    @Override
    public int getNumberOfPowerUp() {
        return 0;
    }

    @Override
    public void addPowerUp() {

    }

    public boolean addPlayToDynamiteCard(DynamiteCard dynamiteCard, int numberPlays){
        return true;
    }


}
