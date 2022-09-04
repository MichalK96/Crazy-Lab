package com.example.crazylab.items;

public class Weapon extends Item {

    WeaponType type;
    public int posX;
    private int posY;

    public WeaponType getType() {
        return type;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Weapon(WeaponType type, int posX, int posY) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
    }
}



