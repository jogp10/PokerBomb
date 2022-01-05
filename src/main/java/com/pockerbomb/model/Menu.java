package com.pockerbomb.model;
import com.googlecode.lanterna.TerminalPosition;




import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.awt.*;
import java.io.IOException;

import static com.googlecode.lanterna.SGR.BOLD;


public class Menu {
    private Screen screen;
    private TextGraphics graphics;
    //TextGraphics tg = screen.newTextGraphics();
    TextGraphics tg;

    public Menu() {

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






}




