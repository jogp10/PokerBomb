package com.pokerbomb.model.game;

import com.pokerbomb.model.Button;
import com.pokerbomb.model.Model;
import com.pokerbomb.model.Shelf;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.game.player.Player;
import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;
import com.pokerbomb.model.game.powerup.PowerUp;

import java.util.ArrayList;
import java.util.Vector;

public class Game implements Model {
    ArrayList<PowerUp> powerUps = new ArrayList<>();
    ArrayList<Level> levels = ReadLevels.readLevels("src/main/java/com/pokerbomb/model/game/Levels.txt");
    Player player;

    Shelf s1 = new Shelf(7,50);
    Shelf s2 = new Shelf(7,50);
    Shelf given = new Shelf(7,50);

    Button b1 = new Button(3,20);
    Button b2 = new Button(3,20);

    Deck cards = new Deck();
    Deck g = new Deck();
    Deck d1 = new Deck();
    Deck d2 = new Deck();

    Cell selected;

    CombineButton selectedU;

    PowerUpButton selectedP;

    String c1 = "";
    String c2 = "";


    public Player getPlayer() {
        return player;
    }

    public ArrayList<Level> getLevels() {
        return levels;
    }

    public enum Cell {C1, C2, C3, C4, C5}  //from l->r, u->d
    Game.Cell[] opt = Game.Cell.values();

    public enum CombineButton {U1, U2, NOT}  //from l->r, u->d
    Game.CombineButton[] but = Game.CombineButton.values();

    public enum PowerUpButton {P1, P2, P3, NOT}  //from l->r, u->d
    Game.PowerUpButton[] pbut = Game.PowerUpButton.values();

    int score;
    int coins;
    int gems;

    public Game() {
       cards.createFullDeck();
       cards.shuffle();
       initGivenCards();

       this.selected = Game.Cell.C1;
        this.selectedU = Game.CombineButton.NOT;
        this.selectedP = PowerUpButton.NOT;

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
            case C1:
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






    public Game.CombineButton getSelectedU() {
        return selectedU;
    }

    public void selectU() {
        selectedU = Game.CombineButton.U1;
    }

    public void deselectU() {
        selectedU = CombineButton.NOT;
    }

    public void changeSelectedU() {
        if (selectedU == Game.CombineButton.U1) selectedU = Game.CombineButton.U2;
        else {
            selectedU = Game.CombineButton.U1;
        }
    }

    public Game.PowerUpButton getSelectedP() {
        return selectedP;
    }

    public void selectP() {
        selectedP = Game.PowerUpButton.P1;
    }

    public void deselectP() {
        selectedP = PowerUpButton.NOT;
    }


    public int getPosElemP(Game.PowerUpButton target) {
        int i = 0;
        for (; pbut[i] != target; i++) ;
        return i;
    }


    public void nextSelectedP() {
        if (selectedP == Game.PowerUpButton.P3) selectedP = PowerUpButton.P1;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElemP(selectedP);
            i++;
            selectedP = pbut[i];
        }
    }

    public void previousSelectedP() {
        if (selectedP == Game.PowerUpButton.P1) selectedP = Game.PowerUpButton.P3;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElemP(selectedP);
            i--;
            selectedP = pbut[i];
        }
    }




    public void setString_1 (String s) {
        this.c1 = s;
    }

    public void setString_2 (String s) {
        this.c2 = s;
    }

    public String getString_1() {
        return c1;
    }

    public String getString_2() {
        return c2;
    }

    public Button getB1() {
        return b1;
    }

    public Button getB2() {
        return b2;
    }
}
