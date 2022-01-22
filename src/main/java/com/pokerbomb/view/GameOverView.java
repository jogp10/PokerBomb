package com.pokerbomb.view;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.GameOver;

import java.io.IOException;

public class GameOverView extends View<GameOver>{


    public GameOverView(GameOver model) {
        super(model);
        initScreen();
    }

    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        graphics.setBackgroundColor(TextColor.Factory.fromString("#010326"));
        graphics.fillRectangle(new TerminalPosition(0, 0), getSize(), ' ');

        String gameover1 = " ____ ____ _  _ ____    ____ _  _ ____ ____ ";
        String gameover2 = "| __ |__| |\\/| |___    |  | |  | |___ |__/";
        String gameover3 = "|__] |  | |  | |___    |__|  \\/  |___ |  \\";
        String gameover4 = "THE TWO DECKS ARE FULL";
        String gameover5 = "NO COMBINATIONS";
        String gameover6 = "PRESS ENTER TO CONTINUE";

        graphics.setForegroundColor(TextColor.Factory.fromString("#FF0000"));

        graphics.putString(getCol(gameover1), 20, gameover1);
        graphics.putString(getCol(gameover2), 21, gameover2);
        graphics.putString(getCol(gameover3), 22, gameover3);

        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));

        graphics.putString(getCol(gameover4), 28, gameover4);
        graphics.putString(getCol(gameover5), 29, gameover5);

        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF00"));

        graphics.putString(getCol(gameover6), 33, gameover6);



        refresh();
    }



}
