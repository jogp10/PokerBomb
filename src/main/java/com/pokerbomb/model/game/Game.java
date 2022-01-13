package com.pokerbomb.model.game;

import com.pokerbomb.model.Model;
import com.pokerbomb.model.Shelf;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.menu.Menu;

import java.util.Vector;

public class Game implements Model {
    Shelf s1 = new Shelf(7,50);
    Shelf s2 = new Shelf(7,50);
    Shelf given = new Shelf(7,50);

    Deck cards = new Deck();
    Deck g = new Deck();
    Deck d1 = new Deck();
    Deck d2 = new Deck();

    Cell selected;


    public enum Cell {C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15}  //from l->r, u->d
    Game.Cell[] opt = Game.Cell.values();

    int score;

    public Game() {
       cards.createFullDeck();
       cards.shuffle();
       initGivenCards();

       this.selected = Game.Cell.C15;


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
    public Deck getGivenDeck_2() {
        return d2;
    }








    public Game.Cell getSelected() {
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
        if (selected == Game.Cell.C15) selected = Game.Cell.C1;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i++;
            selected = opt[i];
        }
    }

    public void previousSelected() {
        if (selected == Game.Cell.C1) selected = Game.Cell.C15;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i--;
            selected = opt[i];
        }
    }








}
