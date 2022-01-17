package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.game.cards.DynamiteCard;

import java.util.ArrayList;

public class DynamitePowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static DynamitePowerUp instance;

    private DynamitePowerUp(){
        numberOfPowerUp=0;
    }

    public static DynamitePowerUp getInstance(){
        if(DynamitePowerUp.instance == null){
            DynamitePowerUp.instance = new DynamitePowerUp();
        }
        return DynamitePowerUp.instance;
    }

    @Override
    public int getNumberOfPowerUp() {
        return numberOfPowerUp;
    }

    @Override
    public void addPowerUp() {
        numberOfPowerUp++;
    }

    public Card addPlayToDynamiteCard(DynamiteCard dynamiteCard, int numberPlays){
        if(getNumberOfPowerUp()==0) return dynamiteCard;
        dynamiteCard.removeSpecialAttribute(-numberPlays);
        return dynamiteCard;
    }

    public Deck addPlayToDynamiteCard(ArrayList<Card> cards){
        Deck d = new Deck();
        for(Card card: cards){
            if(card instanceof DynamiteCard) {
                this.addPlayToDynamiteCard((DynamiteCard) card, 3);
            }
            d.addCard(card);
        }
        this.numberOfPowerUp--;
        return d;
    }

}
