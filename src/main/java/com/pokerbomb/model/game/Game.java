package com.pokerbomb.model.game;

import com.pokerbomb.model.Button;
import com.pokerbomb.model.Model;
import com.pokerbomb.model.Shelf;
import com.pokerbomb.model.game.deck.Deck;
import com.pokerbomb.model.game.powerup.PowerUp;

import java.util.ArrayList;
import java.util.Vector;

public interface Game extends Model {
    ArrayList<Level> getLevels();

    void initGivenCards();

    Vector<Shelf> getShelves();

    Deck getGivenDeck();

    Deck getDeck_1();

    Deck getDeck_2();

    ArrayList<PowerUp> getPowerUps();

    void moveToDeck(Deck dest);

    void removeFromDeck(Deck toRemove);

    void addNewCardToG();

    void setG(Deck set);

    void setD1(Deck set);

    void setD2(Deck set);

    Cell getSelected();

    int getSelectedAsInt();

    void setSelected(Cell selected);

    int getPosElem(Cell target);

    void nextSelected();

    void previousSelected();

    CombineButton getSelectedU();

    void selectU();

    void deselectU();

    void changeSelectedU();

    PowerUpButton getSelectedP();

    void selectP();

    void deselectP();

    int getPosElemP(PowerUpButton target);

    void nextSelectedP();

    void previousSelectedP();

    void setString_1(String s);

    void setString_2(String s);

    String getString_1();

    String getString_2();

    Button getB1();

    Button getB2();

    int getLevel();

    public enum Cell {C1, C2, C3, C4, C5}  //from l->r, u->d

    public enum CombineButton {U1, U2, NOT}  //from l->r, u->d

    public enum PowerUpButton {P1, P2, P3, NOT}  //from l->r, u->d
}
