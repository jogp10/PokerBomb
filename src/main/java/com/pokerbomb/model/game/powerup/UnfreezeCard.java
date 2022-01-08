package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.FrozenCard;

public class UnfreezeCard implements GenericPowerUp{
    private int numberOfPowerups;

    public UnfreezeCard(){
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
