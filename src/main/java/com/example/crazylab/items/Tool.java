package com.example.crazylab.items;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;

public class Tool extends Item {

    ItemType type;

    public ItemType getType() {
        return type;
    }

    private int posX;
    private int posY;

    public Tool(ItemType type, int posX, int posY) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }



}
