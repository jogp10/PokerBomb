package com.pokerbomb.view;

import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.game.goals.Goal;
import com.pokerbomb.model.menu.SelectLevel;

import java.io.IOException;

import static com.googlecode.lanterna.SGR.BOLD;

public class SelectLevelView extends View<SelectLevel> {

    //BorderView borderView;

    public SelectLevelView(SelectLevel model) {
        super(model);
        //this.borderView = new BorderView(10,7, graphics);
        initScreen();
    }


    public void drawTitle() {
        String s1 = "_    ____ _  _ ____ _    ____";
        String s2 = "|    |___ |  | |___ |    [__";
        String s3 = "|___ |___  \\/  |___ |___ ___]";

        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(getCol(s1), 2, s1, BOLD);
        graphics.putString(getCol(s2)-1, 3, s2, BOLD);
        graphics.putString(getCol(s3), 4, s3, BOLD);
    }

    public void drawLevelGoals(int level) {
        int i = 0;
        for (Goal goal : model.getLevels().get(level).getGoals()) {
            drawString("#D3FFFF", 50+i, goal.getName());
            drawString("#FFFFFF",51+i, goal.getDescription());
            i += 3;
        }
    }

    public void drawSelectedBorder() {
        SelectLevel.Level selected = model.getSelected();
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        switch (selected) {
            case L1:
                graphics.putString(16,9, "->");
                drawLevelGoals(0);
                break;
            case L2:
                graphics.putString(16,13, "->");
                drawLevelGoals(1);
                break;
            case L3:
                graphics.putString(16,17, "->");
                drawLevelGoals(2);
                break;
            case L4:
                graphics.putString(16,21, "->");
                drawLevelGoals(3);
                break;
            case L5:
                graphics.putString(16,25, "->");
                drawLevelGoals(4);
                break;
            case L6:
                graphics.putString(16,29, "->");
                drawLevelGoals(5);
                break;
            case L7:
                graphics.putString(16,33, "->");
                drawLevelGoals(6);
                break;
            case L8:
                graphics.putString(16,37, "->");
                drawLevelGoals(7);
                break;
            case L9:
                graphics.putString(16,41, "->");
                drawLevelGoals(8);
                break;
            case L10:
                graphics.putString(16,45, "->");
                drawLevelGoals(9);
                break;
        }
    }

    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        drawTitle();
        drawString("#f2e744", 9, "LEVEL 1");
        drawString("#f2e744", 13, "LEVEL 2");
        drawString("#f2e744", 17, "LEVEL 3");
        drawString("#f2e744", 21, "LEVEL 4");
        drawString("#f2e744", 25, "LEVEL 5");
        drawString("#f2e744", 29, "LEVEL 6");
        drawString("#f2e744", 33, "LEVEL 7");
        drawString("#f2e744", 37, "LEVEL 8");
        drawString("#f2e744", 41, "LEVEL 9");
        drawString("#f2e744", 45, "LEVEL 10");

        drawString("#FEDEDC", 48, "LEVEL GOALS:");

        drawSelectedBorder();

        refresh();
    }
}
