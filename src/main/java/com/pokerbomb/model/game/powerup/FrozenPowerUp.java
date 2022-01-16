package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.DynamiteCard;
import com.pokerbomb.model.game.cards.FrozenCard;

import java.util.ArrayList;

public class FrozenPowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static FrozenPowerUp instance;

    private FrozenPowerUp(){
        numberOfPowerUp=0;
    }

    public static FrozenPowerUp getInstance(){
        if(FrozenPowerUp.instance == null){
            FrozenPowerUp.instance = new FrozenPowerUp();
        }
        return FrozenPowerUp.instance;
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

    public boolean Unfreeze(ArrayList<Card> cards){
        for(Card card: cards){
            if(card instanceof FrozenCard) {
                return this.Unfreeze((FrozenCard) card);
            }
        }
        return false;
    }
}
