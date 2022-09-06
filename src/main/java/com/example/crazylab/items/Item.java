package com.example.crazylab.items;

import javafx.scene.image.ImageView;

public abstract class Item {

    private ItemType itemType;

    private int posX;
    private int posY;
    private ImageView image;

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public abstract ItemType getItemType();
}
