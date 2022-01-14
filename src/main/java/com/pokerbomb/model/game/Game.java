package com.pokerbomb.model.game;

import com.pokerbomb.model.Model;
import com.pokerbomb.model.Shelf;
import com.pokerbomb.model.game.cards.*;
import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;
import com.pokerbomb.model.game.powerup.PowerUp;


import java.util.ArrayList;
import java.util.Vector;

public class Game implements Model {
    ArrayList<PowerUp> powerUps = new ArrayList<>();

    Shelf s1 = new Shelf(7,50);
    Shelf s2 = new Shelf(7,50);
    Shelf given = new Shelf(7,50);

    Deck cards = new Deck();
    Deck g = new Deck();
    Deck d1 = new Deck();
    Deck d2 = new Deck();

    Cell selected;


    public enum Cell {C1, C2, C3, C4, C5}  //from l->r, u->d
    Game.Cell[] opt = Game.Cell.values();

    int score;

    public Game() {
       cards.createFullDeck();
       cards.shuffle();
       initGivenCards();

       this.selected = Game.Cell.C1;

        powerUps.add(FrozenPowerUp.getInstance());
        powerUps.add(DynamitePowerUp.getInstance());
        powerUps.add(JunglePowerUp.getInstance());
    }

    private void initGivenCards() {
        for (int i = 0; i < 5; i++) {
            g.addCard(cards.pop(cards));
        }
    }

    public Vector<Shelf> getShelves() {
        Vector<Shelf> shelves = new Vector<>();
        shelves.add(s1);
        shelves.add(s2);
        shelves.add(given);

        return shelves;
    }

    public Deck getGivenDeck() {
        return g;
    }
    public Deck getDeck_1() {
        return d1;
    }
    public Deck getDeck_2() {
        return d2;
    }

    public
    ArrayList<PowerUp> getPowerUps(){
        return powerUps;
    }

    public void moveToDeck(Deck dest) {
        int selected = this.getSelectedAsInt();
        Card toMove = g.getCard(selected);
        dest.addCard(toMove);
    }

    public void removeFromDeck(Deck toRemove) {
        toRemove.removeCard(getSelectedAsInt());  //removes selected card from GIVEN deck
    }


    public void addNewCardToG () {
        g.addCard(cards.pop(cards));
    }


    public void setG(Deck set) {
        this.g = set;
    }

    public void setD1(Deck set) {
        this.d1 = set;
    }

    public void setD2(Deck set) {
        this.d2 = set;
    }







    public Game.Cell getSelected() {
        return selected;
    }

    public int getSelectedAsInt() {
        int selected = 0;

        switch (this.getSelected()) {
            case C1: ;
                break;
            case C2:
                selected = 1;
                break;
            case C3:
                selected = 2;
                break;
            case C4:
                selected = 3;
                break;
            case C5:
                selected = 4;
                break;
        }

        return selected;
    }

    public void setSelected(Game.Cell selected) {
        this.selected = selected;
    }

    public int getPosElem(Game.Cell target) {
        int i = 0;
        for (; opt[i] != target; i++) ;
        return i;
    }

    public void nextSelected() {
        if (selected == Game.Cell.C5) selected = Game.Cell.C1;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i++;
            selected = opt[i];
        }
    }

    public void previousSelected() {
        if (selected == Game.Cell.C1) selected = Game.Cell.C5;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i--;
            selected = opt[i];
        }
    }








}
