package com.pokerbomb.model.menu;

import com.pokerbomb.model.Model;


public class Menu implements Model {

    public enum Option {START, INST, STORE, EXIT}    //Enum used to avoid typing errors

    public String[] optString = {"PLAY", "INSTRUCTIONS", "STORE", "EXIT"}; //get the string associated to the enumerator

    Option selected;
    Option[] opt = Option.values();

    public Menu(boolean inGame) {
        this.selected = Option.START;
        if (inGame) optString[0] = "CONTINUE";
    }


    public Option getSelected() {
        return selected;
    }

    public void setSelected(Option selected) {
        this.selected = selected;
    }

    public int getPosElem(Option target) {
        int i = 0;
        for (; opt[i] != target; i++) ;
        return i;
    }

    public void nextSelected() {
        if (selected == Option.EXIT) selected = Option.START;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i++;
            selected = opt[i];
        }
    }

    public void previousSelected() {
        if (selected == Option.START) selected = Option.EXIT;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i--;
            selected = opt[i];
        }
    }

    public String enumToString(Option menuOption) {
        int position = getPosElem(menuOption);
        return optString[position];
    }
















/*

    private Screen screen;
    private TextGraphics graphics;
    //TextGraphics tg = screen.newTextGraphics();
    TextGraphics tg;

    int selected = 0;  //start selected option in "Play"



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

    private void getprocessKey() throws IOException {

        KeyStroke key = screen.readInput();  //gets key from user input
        switch (key.getKeyType()) {  //processes the key
            case ArrowUp:
                selected--;
                break;
            case ArrowDown:
                selected++;
                break;
            case Enter:
            {
                switch(selected) {
                    case 0:
                        //play
                        break;
                    case 1:
                        drawI();
                        break;
                    case 2:
                        //store
                        break;
                    case 3:
                        screen.close();
                        break;
                }
            }

        }
        if (selected<0) {  //
            selected = 0;
        }
        else if (selected>3) {
            selected = 3;
        }


    }




    public void draw() {

        String t1 = "___  ____ _  _ ____ ____    ___  ____ _  _ ___";
        String t2 = "|__] |  | |_/  |___ |__/    |__] |  | |\\/| |__]";
        String t3 = "|    |__| | \\_ |___ |  \\    |__] |__| |  | |__]";

        try {
            tg = screen.newTextGraphics();
            screen.clear();
            //TextGraphics tg = screen.newTextGraphics();


            tg.setBackgroundColor(TextColor.Factory.fromString("#010026"));
            tg.setForegroundColor(TextColor.Factory.fromString("#b249d2"));
            tg.fillRectangle(new TerminalPosition(0,0), new TerminalSize(60, 60), ' ');
            tg.putString(7, 10, t1, BOLD);
            tg.putString(7, 11, t2, BOLD);
            tg.putString(7, 12, t3, BOLD);


            tg.setForegroundColor(TextColor.Factory.fromString("#00FF00"));
            tg.putString(27, 25, "PLAY");
            tg.setForegroundColor(TextColor.Factory.fromString("#f2e744"));
            tg.putString(27, 28, "INSTRUCTIONS");
            tg.setForegroundColor(TextColor.Factory.fromString("#b249d2"));
            tg.putString(27, 31, "STORE");
            tg.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
            tg.putString(27, 34, "QUIT");

            tg.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));

            switch (selected) {
                case 0:
                    tg.putString(24,25, "->");
                    break;
                case 1:
                    tg.putString(24,28, "->");
                    break;
                case 2:
                    tg.putString(24,31, "->");
                    break;
                case 3:
                    tg.putString(24,34, "->");
                    break;
            }

            screen.refresh();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void drawI() {

        String t1 = "_ _  _ ____ ___ ____ _  _ ____ ___ _ ____ ____ _  _ ____";
        String t2 = "| |\\ | [__   |  |__/ |  | |     |  | |  | |  | |\\ | [__";
        String t3 = "| | \\| ___]  |  |  \\ |__| |___  |  | |__| |__| | \\| ___]";

        try {
            TextGraphics tg1 = screen.newTextGraphics();
            screen.clear();



            tg1.setBackgroundColor(TextColor.Factory.fromString("#010026"));
            tg1.setForegroundColor(TextColor.Factory.fromString("#b249d2"));
            tg1.fillRectangle(new TerminalPosition(0,0), new TerminalSize(60, 60), ' ');
            tg1.putString(5, 5, t1, BOLD);
            tg1.putString(5, 6, t2, BOLD);
            tg1.putString(5, 7, t3, BOLD);


            tg1.setForegroundColor(TextColor.Factory.fromString("#00FF00"));
            tg1.putString(27, 25, "PLAY");
            tg1.setForegroundColor(TextColor.Factory.fromString("#f2e744"));
            tg1.putString(27, 28, "INSTRUCTIONS");
            tg1.setForegroundColor(TextColor.Factory.fromString("#b249d2"));
            tg1.putString(27, 31, "STORE");
            tg1.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
            tg1.putString(27, 34, "QUIT");

            tg1.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));

            switch (selected) {
                case 0:
                    tg.putString(24,25, "->");
                    break;
                case 1:
                    tg.putString(24,28, "->");
                    break;
                case 2:
                    tg.putString(24,31, "->");
                    break;
                case 3:
                    tg.putString(24,34, "->");
                    break;
            }

            screen.refresh();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void run()  {

        try {
            while (true) {
                draw();
                getprocessKey();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


*/



}




