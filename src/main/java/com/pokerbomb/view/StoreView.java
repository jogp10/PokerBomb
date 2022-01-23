package com.pokerbomb.view;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.menu.Menu;
import com.pokerbomb.model.menu.Store;

import java.io.IOException;

import static com.googlecode.lanterna.SGR.BOLD;
import static com.pokerbomb.model.menu.Menu.Option.*;
import static com.pokerbomb.model.menu.Store.Option.EXIT;
import static com.pokerbomb.model.menu.Store.Option.*;

public class StoreView extends View <Store>{

    BorderView borderView;

    public StoreView(Store model) {
        super(model);
        initScreen();
        this.borderView = new BorderView(24, 3, graphics);
    }

    public void drawTitle() {
        String s1 = "  ____ ___ ____ ____ ____";
        String s2 = "[__   |  |  | |__/ |___";
        String s3 = "___]  |  |__| |  \\ |___";
        graphics.setForegroundColor(TextColor.Factory.fromString("\t#FFFF00"));
        graphics.putString(getCol(s1)-1, 2, s1, BOLD);
        graphics.putString(getCol(s2), 3, s2, BOLD);
        graphics.putString(getCol(s3), 4, s3, BOLD);
    }

    public void drawOptions() {
        drawString("#00FF00", getStringLine(model.getPosElem(JUNGLE)), model.enumToString(JUNGLE));
        drawString("#FF0000", getStringLine(model.getPosElem(DYNAMITE)), model.enumToString(DYNAMITE));
        drawString("#87CEFA", getStringLine(model.getPosElem(DEFREEZE)), model.enumToString(DEFREEZE));
        drawString("#FF0000", 45, model.enumToString(EXIT));
    }

    public void drawSelectedBorder() {
        Store.Option selected = model.getSelected();

        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));

        switch (selected) {
            case JUNGLE:
                borderView.draw(18, 9);
                break;
            case DYNAMITE:
                borderView.draw(18, 11);
                break;
            case DEFREEZE:
                borderView.draw(18, 13);
                break;
            case EXIT:
                borderView.draw(18, 44);
                break;



        }

    }

    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        graphics.setBackgroundColor(TextColor.Factory.fromString("#010326"));
        graphics.fillRectangle(new TerminalPosition(col, row), getSize(), ' ');

        drawTitle();
        drawOptions();
        drawSelectedBorder();

        refresh();
    }



}
