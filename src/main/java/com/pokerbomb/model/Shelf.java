package com.pokerbomb.model;

public class Shelf implements Model{
    private int height;
    private int width;



    public Shelf (int h, int w) {
        this.height = h;
        this.width = w;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
