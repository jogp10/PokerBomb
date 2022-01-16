package com.pokerbomb.view;

import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.menu.Ins;

import java.io.IOException;

import static com.googlecode.lanterna.SGR.BOLD;

public class InsView extends View<Ins> {

    public InsView(Ins model) {
        super(model);
        initScreen();
    }

    public void drawTitle() {
        String s1 = "      _ ___ _     _ ___  _      _";
        String s2 = "||\\ ||_  | |_|| ||   | || ||\\ ||_ ";
        String s3 = "|| \\| _| | |\\ |_||_  | ||_|| \\| _|";

        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(getCol(s1), 2, s1, BOLD);
        graphics.putString(getCol(s2), 3, s2, BOLD);
        graphics.putString(getCol(s3), 4, s3, BOLD);
    }

    public void drawKeys() {

        graphics.setForegroundColor(TextColor.Factory.fromString("#00FF00"));   //green
        String s1 = "         ___         ";
        String s2 = "        | ^ |        ";
        String s3 = "        |_|_|        ";
        String s4 = "    ___  ___  ___    ";
        String s5 = "   | <-|| | ||-> |   ";
        String s6 = "   |___||_v_||___|   ";
        graphics.putString(getCol(s1), 14, s1, BOLD);
        graphics.putString(getCol(s2), 15, s2, BOLD);
        graphics.putString(getCol(s3), 16, s3, BOLD);
        graphics.putString(getCol(s4), 17, s4, BOLD);
        graphics.putString(getCol(s5), 18, s5, BOLD);
        graphics.putString(getCol(s6), 19, s6, BOLD);
    }

    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        drawTitle();
        drawString("#f2e744", 7, "1 \t\tMOVE CARD TO DECK 1");
        drawString("#f2e744", 8, "2 \t\tMOVE CARD TO DECK 2");
        drawString("#f2e744", 9, "ENTER\t\tPRESS COMBINE BUTTON");
        drawString("#f2e744", 10, "MOVEMENT         ARROWS        ");
        drawString("#f2e744", 11, "Q \t\t\tQUIT               ");
        drawString("#f2e744", 12, " ESC \t\tGO BACK TO MENU     ");
        drawKeys();
        drawString("#FFFFFF", 21, "PRESS ENTER TO GO BACK TO THE MENU");

        refresh();
    }
}
