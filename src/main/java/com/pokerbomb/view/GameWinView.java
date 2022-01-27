package com.pokerbomb.view;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.GameOver;
import com.pokerbomb.model.GameWin;

import java.io.IOException;

public class GameWinView extends View<GameWin>{

    public GameWinView(GameWin model) {
        super(model);
        initScreen();
    }

    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        graphics.setBackgroundColor(TextColor.Factory.fromString("#010326"));
        graphics.fillRectangle(new TerminalPosition(0, 0), getSize(), ' ');

        String gameover1 = " _   _ ____ _  _    _ _ _ _ _  _   /";
        String gameover2 = " \\_/  |  | |  |    | | | | |\\ |  /";
        String gameover3 = "  |   |__| |__|    |_|_| | | \\| .";
        String gameover4 = "YOU EARNED 20 COINS";
        String gameover5 = "FOR COMPLETING THE LEVEL";
        String gameover6 = "PRESS ENTER TO CONTINUE";

        graphics.setForegroundColor(TextColor.Factory.fromString("#00FF00"));

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
