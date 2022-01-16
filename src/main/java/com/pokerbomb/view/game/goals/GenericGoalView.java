package com.pokerbomb.view.game.goals;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.goals.Goal;
import com.pokerbomb.view.View;

public abstract class GenericGoalView extends View<Goal> implements GoalView {

    protected GenericGoalView(Goal model, TextGraphics graphics) {
        super(model);
        this.graphics = graphics;
    }

    public abstract void draw(int col, int row);
}
