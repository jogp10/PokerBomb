package com.pokerbomb.model.game.goals;

import com.pokerbomb.model.Model;
import com.pokerbomb.model.game.cards.Hand;

public abstract class Goal implements Model {
    protected final Type type;
    protected String name;
    protected String description;
    protected int currentQuantity;
    private final int totalQuantity;
    private boolean achieved;

    public Goal(Type type, int totalQuantity) {
        this.type = type;
        this.totalQuantity = totalQuantity;
        this.currentQuantity = 0;
        this.achieved = false;
    }

    public boolean isAchieved() {
        return achieved;
    }

    protected void checkAchieved() {
        if (currentQuantity >= totalQuantity) achieved = true;
    }

    @Override
    public boolean equals(Object o) {
        Goal goal = (Goal) o;
        return this.type == goal.type && this.currentQuantity == goal.currentQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public abstract void increment(Hand hand);
}
