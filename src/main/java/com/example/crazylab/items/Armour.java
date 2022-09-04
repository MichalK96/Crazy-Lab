package com.example.crazylab.items;

public class Armour extends Item {

    ArmourType type;

    private int posX;
    private int posY;

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Armour(ArmourType type) {
        this.type = type;
    }


}
