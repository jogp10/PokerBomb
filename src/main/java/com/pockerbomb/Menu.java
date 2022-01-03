package com.pockerbomb;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Menu {
    private Screen screen;
    TextGraphics tg;

    public Menu() {
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need a cursor
            screen.startScreen(); // screens must be started
            screen.doResizeIfNecessary(); // resize screen if necessary
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void mainMenu() {
        try {
            tg = screen.newTextGraphics();
            screen.clear();
            tg.putString(10, 10, "Welcome to POKER BOMB");
            screen.refresh();
        } catch (IOException e){
            e.printStackTrace();
        }
    }






}




