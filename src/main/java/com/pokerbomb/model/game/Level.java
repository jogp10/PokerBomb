package com.pokerbomb.model.game;

import com.pokerbomb.model.game.goals.Goal;

import java.util.ArrayList;

public class Level {
    private int number;
    private ArrayList<Goal> goals;


    public Level(int number, ArrayList<Goal> goals) {
        this.number = number;
        this.goals = goals;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    @Override
    public boolean equals(Object o) {
        Level level = (Level) o;
        return this.number == level.number && this.goals.equals(level.goals);
    }
}
