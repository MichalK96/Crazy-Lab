package com.example.crazylab.items;

public class Armour extends Item {

    ItemType type;

    private int posX;
    private int posY;

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Armour(ItemType type, int posX, int posY) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
    }

    public ItemType getType() {
        return type;
    }
}
