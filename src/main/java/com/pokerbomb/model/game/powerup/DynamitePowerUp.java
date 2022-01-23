package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.Player;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.SpecialCard;
import com.pokerbomb.model.game.deck.Deck;
import com.pokerbomb.model.game.cards.DynamiteCard;

import java.util.ArrayList;

public class DynamitePowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static DynamitePowerUp instance;
    private static int price = 1;

    private DynamitePowerUp(){
        numberOfPowerUp=3;
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
    public void setNumberOfPowerUp(int i) {
        numberOfPowerUp=i;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void addPowerUp() {
        numberOfPowerUp++;
    }

    public Card usePowerUp(SpecialCard dynamiteCard){
        if(getNumberOfPowerUp()==0) return dynamiteCard;
        dynamiteCard.removeSpecialAttribute(-3);
        return dynamiteCard;
    }

    public Deck usePowerUp(ArrayList<Card> cards){
        Deck d = new Deck();
        for(Card card: cards){
            if(card instanceof DynamiteCard) {
                this.usePowerUp((DynamiteCard) card);
            }
            d.addCard(card);
        }
        this.numberOfPowerUp--;
        return d;
    }

    @Override
    public int buy() {
        if(!Player.getInstance().buy(price)) return 0;
        addPowerUp();
        price+=3;
        return price-3;
    }
}
