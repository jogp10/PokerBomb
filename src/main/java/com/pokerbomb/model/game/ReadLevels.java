package com.pokerbomb.model.game;

import com.pokerbomb.model.game.goals.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadLevels {
    public static ArrayList<Level> readLevels(String file) {
        ArrayList<Level> levels = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(new File(file));
            while (myReader.hasNextLine()) {
                int level = Integer.parseInt(myReader.nextLine());
                ArrayList<Goal> goals = new ArrayList<>();
                int numGoals = Integer.parseInt(myReader.nextLine());
                for (int i = 0; i < numGoals; i++) {
                    Type type = Type.valueOf(myReader.nextLine());
                    int quantity = Integer.parseInt(myReader.nextLine());
                    switch (type) {
                        case CLUBS:
                            goals.add(new InDaClubGoal(type, quantity));
                            break;
                        case HANDS:
                            goals.add(new GiveUsAHandGoal(type, quantity));
                            break;
                        case CARDS:
                            goals.add(new CardCollectorGoal(type, quantity));
                            break;
                        case PAIR:
                            goals.add(new SeeingDoubleGoal(type, quantity));
                            break;
                        case TWO_PAIRS:
                            goals.add(new TheDoubleDoubleGoal(type, quantity));
                            break;
                        case THREE_OF_A_KIND:
                            goals.add(new ThreesCompanyGoal(type, quantity));
                            break;
                        case FULL_HOUSE:
                            goals.add(new TheHouseIsFullGoal(type, quantity));
                            break;
                        case SCORE:
                            goals.add(new Goal(type, quantity));
                            break;
                    }
                }
                levels.add(new Level(level, goals));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return levels;
    }
}
