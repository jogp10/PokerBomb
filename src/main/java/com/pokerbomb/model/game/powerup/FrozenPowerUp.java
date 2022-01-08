package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.FrozenCard;

public class FrozenPowerUp implements GenericPowerUp{
    private int numberOfPowerUp;

    public FrozenPowerUp(){
        numberOfPowerUp=0;
    }

    public int getNumberOfPowerUp(){
        return numberOfPowerUp;
    }

    public void addPowerUp(){
        numberOfPowerUp++;
    }

    public boolean Unfreeze(FrozenCard frozenCard){
        frozenCard.inACombo(100);
        return !frozenCard.isActive();
    }
}
