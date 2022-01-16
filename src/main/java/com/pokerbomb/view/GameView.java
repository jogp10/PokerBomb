package com.pokerbomb.view;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.pokerbomb.model.game.Game;
import com.pokerbomb.model.game.powerup.PowerUp;

import java.io.IOException;

public class GameView extends View<Game>{

    FactoryView factory;
    BorderView borderView;
    BorderView buttonBorder;
    BorderView pUpBorder;


    public GameView(Game model, FactoryView factoryView) {
        super(model);
        this.factory = factoryView;

        initScreen();
        this.borderView = new BorderView(10,7, graphics);
        this.buttonBorder = new BorderView(20,3,graphics);
        this.pUpBorder = new BorderView(5,4,graphics);
    }

    private void drawShelves() {
        factory.genShelfView(model.getShelves().get(0), graphics).draw(5,13);
        factory.genShelfView(model.getShelves().get(1), graphics).draw(5,21);
        factory.genShelfView(model.getShelves().get(2), graphics).draw(5,39);
    }

    public void drawSelectedBorder() {
        Game.Cell selected = model.getSelected();
        Game.CombineButton selectedU = model.getSelectedU();
        Game.PowerUpButton selectedP = model.getSelectedP();
        graphics.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
        //int COL_BEGIN_SELECTED = this.getSize().getColumns() / 2 - 8;
        switch (selected) {
            case C1:
                borderView.draw(7,39);
                break;
            case C2:
                borderView.draw(16,39);
                break;
            case C3:
                borderView.draw(25,39);
                break;
            case C4:
                borderView.draw(34,39);
                break;
            case C5:
                borderView.draw(43,39);
                break;
        }
        switch (selectedU) {
            case U1:
                buttonBorder.draw(5,31);
                break;
            case U2:
                buttonBorder.draw(35,31);
                break;
            case NOT:
                break;
        }
        switch (selectedP) {
            case P1:
                pUpBorder.draw(8,49);  //draw border for powerup1
                break;
            case P2:
                pUpBorder.draw(28,49);  //draw border for powerup2
                break;
            case P3:
                pUpBorder.draw(48,49);  //draw border for powerup3
                break;
            case NOT:
                break;
        }
    }

    private void drawCards()  {
        TextColor textColor = graphics.getBackgroundColor();
        try {
            factory.genDeckView(model.getGivenDeck(), graphics).draw(6, 40);
            factory.genDeckView(model.getDeck_1(), graphics).draw(6, 14);
            factory.genDeckView(model.getDeck_2(), graphics).draw(6, 22);
        } catch (IOException e) {
            e.printStackTrace();
        }
        graphics.setBackgroundColor(textColor);
    }

    private void printCurrentCombo() {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(6,32, model.getString_1());
        graphics.putString(42,32, model.getString_2());

        // print the current combos in each button
    }


    public void drawQuests() {
        //draw the level quests
    }

    public void drawPoints() {
        //draw current points
    }

    private void drawPowerUps() {
        int col = 10;
        int row = 50;
        for(PowerUp i: model.getPowerUps()){
            try {
                factory.genPowerUpView(i, graphics).draw(col, row);
            } catch (IOException e) {
                e.printStackTrace();
            }
            col += 20;
        }
    }

    private void drawButtons() {
        factory.genButtonView(model.getB1(), graphics).draw(5,31);
        factory.genButtonView(model.getB1(), graphics).draw(35,31);
    }


    @Override
    public void draw(int col, int row) throws IOException {
        clear(col, row);

        graphics.setBackgroundColor(TextColor.Factory.fromString("#010326"));
        graphics.fillRectangle(new TerminalPosition(col, row), getSize(), ' ');


        //draws all the shelves visible on the screen
        drawShelves();

        drawButtons();

        //draw cards on the screen
        drawCards();

        //drawSelectedBorder();   draw selected card border

        printCurrentCombo();

        drawPowerUps();

        drawSelectedBorder();

        refresh();
    }
}
