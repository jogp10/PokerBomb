package com.pokerbomb.model;

import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Player implements Model {
    private static Player instance;
    String name;
    int coins;
    int level;

    private Player(){
        try{
            Scanner myReader = new Scanner(new File("src/main/resources/Player.txt"));
            myReader.nextLine();
            name = myReader.nextLine();
            myReader.nextLine();
            level = Integer.parseInt(myReader.nextLine());
            myReader.nextLine();
            coins = Integer.parseInt(myReader.nextLine());
            myReader.nextLine();
            JunglePowerUp junglePowerUp = JunglePowerUp.getInstance();
            junglePowerUp.setNumberOfPowerUp(Integer.parseInt(myReader.nextLine()));
            junglePowerUp.setPrice(Integer.parseInt(myReader.nextLine()));
            myReader.nextLine();
            DynamitePowerUp dynamitePowerUp = DynamitePowerUp.getInstance();
            dynamitePowerUp.setNumberOfPowerUp(Integer.parseInt(myReader.nextLine()));
            dynamitePowerUp.setPrice(Integer.parseInt(myReader.nextLine()));
            myReader.nextLine();
            FrozenPowerUp frozenPowerUp = FrozenPowerUp.getInstance();
            frozenPowerUp.setNumberOfPowerUp(Integer.parseInt(myReader.nextLine()));
            frozenPowerUp.setPrice(Integer.parseInt(myReader.nextLine()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Player getInstance(){
        if(Player.instance == null){
            Player.instance = new Player();
        }
        return Player.instance;
    }
    public int getLevel() {
        return level;
    }

    public int getCoins() {
        return coins;
    }

    public void addCoins(int coins) {
        this.coins += coins;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void end() {
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/Player.txt");
            fileWriter.write("Name\n");
            fileWriter.write(getName());
            fileWriter.write("\nLevel\n");
            fileWriter.write(Integer.toString(getLevel()));
            fileWriter.write("\nCoins\n");
            fileWriter.write(Integer.toString(Player.getInstance().getCoins()));
            fileWriter.write("\nJungle\n");
            fileWriter.write(Integer.toString(JunglePowerUp.getInstance().getNumberOfPowerUp()));
            fileWriter.write("\n");
            fileWriter.write(Integer.toString(JunglePowerUp.getInstance().getPrice()));
            fileWriter.write("\nDynamite\n");
            fileWriter.write(Integer.toString(DynamitePowerUp.getInstance().getNumberOfPowerUp()));
            fileWriter.write("\n");
            fileWriter.write(Integer.toString(DynamitePowerUp.getInstance().getPrice()));
            fileWriter.write("\nFrozen\n");
            fileWriter.write(Integer.toString(FrozenPowerUp.getInstance().getNumberOfPowerUp()));
            fileWriter.write("\n");
            fileWriter.write(Integer.toString(FrozenPowerUp.getInstance().getPrice()));
            fileWriter.close();
        } catch (IOException e) {}
    }

    public boolean buy(int i){
        if(i>coins) return false;
        coins -= i;
        return true;
    }
}
