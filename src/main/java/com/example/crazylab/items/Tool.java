package com.example.crazylab.items;

public class Tool extends Item {

    ToolType type;

    private int posX;
    private int posY;

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Tool(ToolType type) {
        this.type = type;
    }
}
