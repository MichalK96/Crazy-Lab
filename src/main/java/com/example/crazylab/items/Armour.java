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

    public Armour(ItemType type) {
        this.type = type;
    }


}
