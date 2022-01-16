package com.pokerbomb.view.game.goals;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.goals.*;

public class GoalViewFactory {
    public GoalView createGoalView(Goal goal, TextGraphics graphics){
        if(goal instanceof InDaClubGoal) {
            return new InDaClubGoalView((InDaClubGoal) goal, graphics);
        }
        if(goal instanceof GiveUsAHandGoal) {
            return new GiveUsAHandGoalView((GiveUsAHandGoal) goal, graphics);
        }
        if(goal instanceof CardCollectorGoal) {
            return new CardCollectorGoalView((CardCollectorGoal) goal, graphics);
        }
        if(goal instanceof SeeingDoubleGoal) {
            return new SeeingDoubleGoalView((SeeingDoubleGoal) goal, graphics);
        }
        if(goal instanceof TheDoubleDoubleGoal) {
            return new TheDoubleDoubleGoalView((TheDoubleDoubleGoal) goal, graphics);
        }
        if(goal instanceof ThreesCompanyGoal) {
            return new ThreesCompanyGoalView((ThreesCompanyGoal) goal, graphics);
        }
        if(goal instanceof TheHouseIsFullGoal) {
            return new TheHouseIsFullGoalView((TheHouseIsFullGoal) goal, graphics);
        }
        return null;
    }
}
