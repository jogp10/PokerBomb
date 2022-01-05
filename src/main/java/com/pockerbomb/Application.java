package com.pockerbomb;

import com.pockerbomb.controller.Controller;
import com.pockerbomb.controller.state.FactoryState;
import com.pockerbomb.model.game.Deck;
import com.pockerbomb.model.menu.Menu;

import java.io.IOException;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException, CloneNotSupportedException, ClassNotFoundException {

        /*Menu menu = new Menu();
        menu.run();*/

        Controller controller = new Controller(new FactoryState());
        controller.start();

        // Player's info
            //long playerCoins = 0;


        // Preparation for the start of a level
            // Create our playing deck
        /*
            Deck playingDeck = new Deck();
            playingDeck.createFullDeck();
            playingDeck.shuffle();
            //Create a deck for the player
            Deck playerDeck = new Deck();
            //Create a deck for each shelf
            int numberOfShelfs = 2; // it can be a diferent value
            ArrayList<Deck> shelfsDeck = new ArrayList<>();
            for(int i=0; i<numberOfShelfs; i++) shelfsDeck.add(new Deck());
            */

    }
}
