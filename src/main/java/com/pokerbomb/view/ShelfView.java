package com.pokerbomb.view;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.Shelf;

public class ShelfView extends View<Shelf> {

    BorderView shelfBorder;

    public ShelfView(Shelf model, BorderView borderView, TextGraphics graphics) {
        super(model);
        this.shelfBorder = borderView;
        this.graphics = graphics;
    }


    @Override
    public void draw(int col, int row) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        shelfBorder.draw(col, row);
    }
}
