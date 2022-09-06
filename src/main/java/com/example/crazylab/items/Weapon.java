package com.example.crazylab.items;

public class Weapon extends Item {

    ItemType type;
    public int posX;
    private int posY;

    public ItemType getType() {
        return type;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Weapon(ItemType type, int posX, int posY) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public ItemType getItemType() {
        return this.type;
    }
}



