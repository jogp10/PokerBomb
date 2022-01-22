package com.pokerbomb.model.game;

import com.pokerbomb.model.Button;
import com.pokerbomb.model.Shelf;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.deck.Deck;
import com.pokerbomb.model.game.deck.EasyDeckStrategy;
import com.pokerbomb.model.game.deck.HardDeckStrategy;
import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;
import com.pokerbomb.model.game.powerup.PowerUp;

import java.util.ArrayList;
import java.util.Vector;

public class GameImplementation implements Game {
    ArrayList<PowerUp> powerUps = new ArrayList<>();
    ArrayList<Level> levels = ReadLevels.readLevels("src/main/resources/Levels.txt");
    int level;

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

    @Override
    public ArrayList<Level> getLevels() {
        return levels;
    }

    @Override
    public void initGivenCards() {
        for (int i = 0; i < 5; i++) {
            g.addCard(cards.pop(cards));
        }
    }

    GameImplementation.Cell[] opt = GameImplementation.Cell.values();

    GameImplementation.CombineButton[] but = GameImplementation.CombineButton.values();

    GameImplementation.PowerUpButton[] pbut = GameImplementation.PowerUpButton.values();

    int score;
    int coins;
    int gems;

    public GameImplementation(int l) {
        this.level = l;

        if(level>4) cards.setDeckStrategy(new HardDeckStrategy());
        else cards.setDeckStrategy(new EasyDeckStrategy());

       cards.createFullDeck();
       cards.shuffle();
       initGivenCards();

       this.selected = GameImplementation.Cell.C1;
        this.selectedU = GameImplementation.CombineButton.NOT;
        this.selectedP = PowerUpButton.NOT;

        powerUps.add(JunglePowerUp.getInstance());
        powerUps.add(DynamitePowerUp.getInstance());
        powerUps.add(FrozenPowerUp.getInstance());
    }

    @Override
    public Vector<Shelf> getShelves() {
        Vector<Shelf> shelves = new Vector<>();
        shelves.add(s1);
        shelves.add(s2);
        shelves.add(given);

        return shelves;
    }

    @Override
    public Deck getGivenDeck() {
        return g;
    }
    @Override
    public Deck getDeck_1() {
        return d1;
    }
    @Override
    public Deck getDeck_2() {
        return d2;
    }

    @Override
    public
    ArrayList<PowerUp> getPowerUps(){
        return powerUps;
    }

    @Override
    public void moveToDeck(Deck dest) {
        int selected = this.getSelectedAsInt();
        Card toMove = g.getCard(selected);
        dest.addCard(toMove);
    }

    @Override
    public void removeFromDeck(Deck toRemove) {
        toRemove.removeCard(getSelectedAsInt());  //removes selected card from GIVEN deck
    }


    @Override
    public void addNewCardToG() {
        g.addCard(cards.pop(cards));
    }


    @Override
    public void setG(Deck set) {
        this.g = set;
    }

    @Override
    public void setD1(Deck set) {
        this.d1 = set;
    }

    @Override
    public void setD2(Deck set) {
        this.d2 = set;
    }







    @Override
    public GameImplementation.Cell getSelected() {
        return selected;
    }

    @Override
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

    @Override
    public void setSelected(GameImplementation.Cell selected) {
        this.selected = selected;
    }

    @Override
    public int getPosElem(GameImplementation.Cell target) {
        int i = 0;
        for (; opt[i] != target; i++) ;
        return i;
    }

    @Override
    public void nextSelected() {
        if (selected == GameImplementation.Cell.C5) selected = GameImplementation.Cell.C1;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i++;
            selected = opt[i];
        }
    }

    @Override
    public void previousSelected() {
        if (selected == GameImplementation.Cell.C1) selected = GameImplementation.Cell.C5;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i--;
            selected = opt[i];
        }
    }






    @Override
    public GameImplementation.CombineButton getSelectedU() {
        return selectedU;
    }

    @Override
    public void selectU() {
        selectedU = GameImplementation.CombineButton.U1;
    }

    @Override
    public void deselectU() {
        selectedU = CombineButton.NOT;
    }

    @Override
    public void changeSelectedU() {
        if (selectedU == GameImplementation.CombineButton.U1) selectedU = GameImplementation.CombineButton.U2;
        else {
            selectedU = GameImplementation.CombineButton.U1;
        }
    }

    @Override
    public GameImplementation.PowerUpButton getSelectedP() {
        return selectedP;
    }

    @Override
    public void selectP() {
        selectedP = GameImplementation.PowerUpButton.P1;
    }

    @Override
    public void deselectP() {
        selectedP = PowerUpButton.NOT;
    }


    @Override
    public int getPosElemP(GameImplementation.PowerUpButton target) {
        int i = 0;
        for (; pbut[i] != target; i++) ;
        return i;
    }


    @Override
    public void nextSelectedP() {
        if (selectedP == GameImplementation.PowerUpButton.P3) selectedP = PowerUpButton.P1;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElemP(selectedP);
            i++;
            selectedP = pbut[i];
        }
    }

    @Override
    public void previousSelectedP() {
        if (selectedP == GameImplementation.PowerUpButton.P1) selectedP = GameImplementation.PowerUpButton.P3;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElemP(selectedP);
            i--;
            selectedP = pbut[i];
        }
    }




    @Override
    public void setString_1(String s) {
        this.c1 = s;
    }

    @Override
    public void setString_2(String s) {
        this.c2 = s;
    }

    @Override
    public String getString_1() {
        return c1;
    }

    @Override
    public String getString_2() {
        return c2;
    }

    @Override
    public Button getB1() {
        return b1;
    }

    @Override
    public Button getB2() {
        return b2;
    }

    @Override
    public int getLevel() {
        return level;
    }
}
