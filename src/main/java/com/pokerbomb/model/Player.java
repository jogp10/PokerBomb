package com.pokerbomb.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Player {
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
}
