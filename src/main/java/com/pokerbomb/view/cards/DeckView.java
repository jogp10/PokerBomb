package com.pokerbomb.view.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.*;
import com.pokerbomb.view.FactoryView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class DeckView extends View<Deck> {
    private int incr = 4, startCol = 0;

    public DeckView(Deck model, TextGraphics graphics) {
        super(model);
        this.graphics = graphics;
    }

    private void increment(){
        if(model.getDeck().size()==5) {
            incr = 9;
            startCol = 2;
        }
        else if(model.getDeck().size()==4) {
            incr = 10;
            startCol = 6;
        }
        else if(model.getDeck().size()==3) {
            incr = 8;
            startCol = 11;
        }
        else if(model.getDeck().size()==2) {
            incr = 12;
            startCol = 15;
        }
        else if(model.getDeck().size()==1) {
            startCol = 21;
        }
    }

    @Override
    public void draw(int col, int row) throws IOException {
        increment();

        for(Card card : model.getDeck()){
            FactoryView factoryView = new FactoryView();
            factoryView.genCardView(card, graphics).draw(startCol+col, row);
            startCol+=incr;
        }
    }
}
