package com.pokerbomb.view;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.Button;
import com.pokerbomb.model.Shelf;

public class ButtonView extends View<Button>{

    BorderView buttonBorder;

    public ButtonView(Button model, BorderView borderView, TextGraphics graphics) {
        super(model);
        this.buttonBorder = borderView;
        this.graphics = graphics;
    }


    @Override
    public void draw(int col, int row) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        buttonBorder.draw(col, row);
    }
}
