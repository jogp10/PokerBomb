package com.pokerbomb.view.game.cards;

import java.io.IOException;

public interface CardView {
    void setBackgroundColour(String backgroundColour);

    String getBackgroundColour();

    void draw(int col, int row) throws IOException;
}
