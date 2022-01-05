package com.pockerbomb.view;

import com.googlecode.lanterna.TerminalPosition;

import com.googlecode.lanterna.TextColor;

import com.pockerbomb.model.menu.Menu;

import java.io.IOException;

import static com.googlecode.lanterna.SGR.BOLD;
import static com.pockerbomb.model.menu.Menu.Option.*;


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
        graphics.setForegroundColor(TextColor.Factory.fromString("#b249d2"));   //violet
        graphics.putString(getCol(s1), 2, s1, BOLD);
        graphics.putString(getCol(s2), 3, s2, BOLD);
        graphics.putString(getCol(s3), 4, s3, BOLD);
    }

    public void drawOptions() {
        drawString("#00FF00", getStringLine(model.getPosElem(START)), model.enumToString(START)); //green
        drawString("#f2e744", getStringLine(model.getPosElem(INST)), model.enumToString(INST));   //yellow
        drawString("#f2e744", getStringLine(model.getPosElem(STORE)), model.enumToString(STORE));   //yellow
        drawString("#FF0000", getStringLine(model.getPosElem(EXIT)), model.enumToString(EXIT));   //red
    }

    public void drawSelectedBorder() {
        Menu.Option selected = model.getSelected();
        int COL_BEGIN_SELECTED = this.getSize().getColumns() / 2 - 8;
        graphics.setForegroundColor(TextColor.Factory.fromString("#b249d2"));       //violet
        borderView.draw(COL_BEGIN_SELECTED, getStringLine(model.getPosElem(selected)) - 1);
    }

    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        graphics.setBackgroundColor(TextColor.Factory.fromString("#010326"));       //dark blue
        graphics.fillRectangle(new TerminalPosition(col, row), getSize(), ' ');

        drawTitle();
        drawOptions();
        drawSelectedBorder();

        refresh();
    }







    /*

    private Screen screen;
    private TextGraphics graphics;
    //TextGraphics tg = screen.newTextGraphics();
    TextGraphics tg;

    public MenuView() {

        try {
            TerminalSize terminalSize = new TerminalSize(60, 60);
            DefaultTerminalFactory terminalFactory = new
                    DefaultTerminalFactory()
                    .setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();
            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null);
            screen.startScreen();
            screen.doResizeIfNecessary();
            screen.clear();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void draw() {

        String t1 = "___  ____ _  _ ____ ____    ___  ____ _  _ ___";
        String t2 = "|__] |  | |_/  |___ |__/    |__] |  | |\\/| |__]";
        String t3 = "|    |__| | \\_ |___ |  \\    |__] |__| |  | |__]";

        try {
            tg = screen.newTextGraphics();
            screen.clear();
            TextGraphics tg = screen.newTextGraphics();


            tg.setBackgroundColor(TextColor.Factory.fromString("#010026"));
            tg.setForegroundColor(TextColor.Factory.fromString("#b249d2"));
            tg.fillRectangle(new TerminalPosition(0,0), new TerminalSize(60, 60), ' ');
            tg.putString(7, 10, t1, BOLD);
            tg.putString(7, 11, t2, BOLD);
            tg.putString(7, 12, t3, BOLD);


            tg.setForegroundColor(TextColor.Factory.fromString("#00FF00"));
            tg.putString(27, 25, "PLAY");
            tg.setForegroundColor(TextColor.Factory.fromString("#f2e744"));
            tg.putString(27, 28, "QUESTS");
            tg.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
            tg.putString(27, 31, "STORE");

            screen.refresh();
        } catch (IOException e){
            e.printStackTrace();
        }
    }




*/

}




