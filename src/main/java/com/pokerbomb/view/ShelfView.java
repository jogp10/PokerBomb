package com.pokerbomb.view;

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
        shelfBorder.draw(col, row);
    }
}
