package com.pokerbomb.view;

import com.googlecode.lanterna.TerminalPosition;

import com.googlecode.lanterna.TextColor;

import com.pokerbomb.model.menu.Menu;

import java.io.IOException;

import static com.googlecode.lanterna.SGR.BOLD;
import static com.pokerbomb.model.menu.Menu.Option.*;


public class MenuView extends View<Menu>{
    BorderView borderView;

    public MenuView(Menu model) {
        super(model);
        initScreen();
        this.borderView = new BorderView(16, 3, graphics);
    }

    public void drawTitle() {
        String s1 = "___  ____ _  _ ____ ____    ___  ____ _  _ ___";
        String s2 = "|__] |  | |_/  |___ |__/    |__] |  | |\\/| |__]";
        String s3 = "|    |__| | \\_ |___ |  \\    |__] |__| |  | |__]";
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(getCol(s1)-1, 2, s1, BOLD);
        graphics.putString(getCol(s2), 3, s2, BOLD);
        graphics.putString(getCol(s3), 4, s3, BOLD);
    }

    public void drawOptions() {
        drawString("#00FF00", getStringLine(model.getPosElem(START)), model.enumToString(START));
        drawString("#FFFFFF", getStringLine(model.getPosElem(INST)), model.enumToString(INST));
        drawString("#FFFFFF", getStringLine(model.getPosElem(STORE)), model.enumToString(STORE));
        drawString("#FF0000", getStringLine(model.getPosElem(EXIT)), model.enumToString(EXIT));
    }

    public void drawSelectedBorder() {
        Menu.Option selected = model.getSelected();
        int COL_BEGIN_SELECTED = this.getSize().getColumns() / 2 - 8;
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        borderView.draw(COL_BEGIN_SELECTED, getStringLine(model.getPosElem(selected)) - 1);
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




