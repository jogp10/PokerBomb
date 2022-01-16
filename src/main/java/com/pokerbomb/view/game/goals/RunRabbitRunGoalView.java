package com.pokerbomb.view.game.goals;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.goals.Goal;

public class RunRabbitRunGoalView extends GenericGoalView {
    public RunRabbitRunGoalView(Goal model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) {
        //graphics.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
        graphics.putString(col, row, "STRAIGHT");
        graphics.putString(col, row+1, String.format("%1$s / %2$s", model.getCurrentQuantity(), model.getTotalQuantity()));
    }
}
