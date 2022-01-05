package com.pockerbomb;

import com.pockerbomb.model.game.DeckModel;
import com.pockerbomb.model.menu.Menu;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.run();


        // Player's info
            long playerCoins = 0;


        // Preparation for the start of a level
            // Create our playing deck
            DeckModel playingDeck = new DeckModel();
            playingDeck.createFullDeck();
            playingDeck.shuffle();
            //Create a deck for the player
            DeckModel playerDeck = new DeckModel();
            //Create a deck for each shelf
            int numberOfShelfs = 2; // it can be a diferent value
            ArrayList<DeckModel> shelfsDeck = new ArrayList<>();
            for(int i=0; i<numberOfShelfs; i++) shelfsDeck.add(new DeckModel());
    }
}
