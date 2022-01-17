package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.game.cards.DynamiteCard;
import com.pokerbomb.model.game.cards.FrozenCard;

import java.util.ArrayList;

public class FrozenPowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static FrozenPowerUp instance;

    private FrozenPowerUp(){
        numberOfPowerUp=999;
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

    public Card Unfreeze(FrozenCard frozenCard){
        if(getNumberOfPowerUp()==0) return frozenCard;
        frozenCard.inACombo(100);
        return frozenCard;
    }

    public Deck Unfreeze(ArrayList<Card> cards){
        Deck d = new Deck();
        for(Card card: cards){
            if(card instanceof FrozenCard) {
                this.Unfreeze((FrozenCard) card);
            }
            d.addCard(card);
        }
        this.numberOfPowerUp--;
        return d;
    }
}
