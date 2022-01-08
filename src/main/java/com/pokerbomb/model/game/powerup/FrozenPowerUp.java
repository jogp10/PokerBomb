package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.FrozenCard;

public class FrozenPowerUp implements GenericPowerUp{
    private int numberOfPowerUp;

    public FrozenPowerUp(){
    }

    public void addPowerUp(){
    }

    public int getNumberOfPowerUp(){
        return 0;
    }

    public boolean Unfreeze(FrozenCard frozenCard){
        return true;
    }
}
