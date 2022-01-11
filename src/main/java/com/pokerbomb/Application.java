package com.pokerbomb;


import com.pokerbomb.controller.Controller;
import com.pokerbomb.controller.state.FactoryState;


import java.io.IOException;

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

            DeckModel playingDeck = new DeckModel();

            playingDeck.createFullDeck();
            playingDeck.shuffle();
            //Create a deck for the player
            Deck playerDeck = new Deck();
            //Create a deck for each shelf
            int numberOfShelfs = 2; // it can be a diferent value

            ArrayList<Deck> shelfsDeck = new ArrayList<>();
            for(int i=0; i<numberOfShelfs; i++) shelfsDeck.add(new Deck());



            ArrayList<DeckModel> shelfsDeck = new ArrayList<>();
            for(int i=0; i<numberOfShelfs; i++) shelfsDeck.add(new DeckModel());
*/

    }
}
