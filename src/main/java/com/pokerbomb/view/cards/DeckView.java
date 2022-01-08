package com.pokerbomb.view.cards;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.view.View;

import java.io.IOException;

public class DeckView extends View<Deck> {
    private int incr = 4, startCol = 0;

    protected DeckView(Deck model) {
        super(model);
    }

    private void increment(){
        if(model.getDeck().size()==5) {
            incr = 4;
            startCol = 1;
        }
        else if(model.getDeck().size()==4) {
            incr = 5;
            startCol = 4;
        }
        else if(model.getDeck().size()==3) {
            incr = 5;
            startCol = 6;
        }
        else if(model.getDeck().size()==2) {
            startCol = 8;
            incr = 6;
        }
        else if(model.getDeck().size()==1) {
            startCol = 11;
        }
    }

    @Override
    public void draw(int col, int row) throws IOException {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#808080"));
        graphics.fillRectangle(new TerminalPosition(col, row), new TerminalSize(25, 7), ' ');

        for(Card card : model.getDeck()){
            View<Card> cardView = new CardView(card, graphics);
            cardView.draw(startCol, row);
            startCol+=incr;
        }

    }
}
