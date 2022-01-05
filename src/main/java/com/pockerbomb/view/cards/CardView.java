package com.pockerbomb.view.cards;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pockerbomb.model.game.cards.Card;
import com.pockerbomb.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CardView extends View<Card> {

    public static String backgroundColour = "#FFFFFF";

    static final List<String> suits = new ArrayList<String>() {{
        add("\u2665"); // hearts
        add("\u2666"); // diamonds
        add("\u2664"); // spaces
        add("\u2663"); // clubs
    }};

    static final List<String> colors = new ArrayList<String>() {{
        add("#FFFFFF"); // default
        add("#FF0000"); // hearts
        add("#FF0000"); // diamonds
        add("#000000"); // spaces
        add("#000000"); // clubs
    }};

    public CardView(Card model, TextGraphics graphics){
        super(model);
        this.graphics = graphics;
    }

    public void setBackgroundColour(String backgroundColour) {
        CardView.backgroundColour = backgroundColour;
    }

    public String getBackgroundColour() {
        return backgroundColour;
    }

    @Override
    public TerminalSize getSize(){
        return new TerminalSize(3, 5);
    }

    @Override
    public void draw(int col, int row) throws IOException {
        graphics.setBackgroundColor(TextColor.Factory.fromString(backgroundColour));
        graphics.fillRectangle(new TerminalPosition(col, row), new TerminalSize(3, 5), ' ');

        graphics.setForegroundColor(TextColor.Factory.fromString(colors.get(model.getSuitValue())));
        graphics.putString(col+1, row+1, model.getRank().toString());
        graphics.putString(col+1, row+3, suits.get(model.getSuitValue()));
    }
}
