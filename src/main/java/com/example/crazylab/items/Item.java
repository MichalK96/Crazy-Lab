package com.example.crazylab.items;

import com.example.crazylab.characters.Player;
import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public abstract class Item {


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

    public boolean isItemNextToPlayer(Player player) {
        int itemX = getPosX();
        int itemY = getPosY();
        int playerX = player.getPosXBottom();
        int playerY = player.getPosYBottom();
        return itemX == playerX && itemY == playerY ||
                itemX + 1 == playerX && itemY == playerY ||
                itemX - 1 == playerX && itemY == playerY ||
                itemX == playerX && itemY + 1 == playerY ||
                itemX == playerX && itemY - 1 == playerY ||
                itemX + 1 == playerX && itemY + 1 == playerY ||
                itemX - 1 == playerX && itemY - 1 == playerY ||
                itemX + 1 == playerX && itemY - 1 == playerY ||
                itemX - 1 == playerX && itemY + 1 == playerY;
    }

    public void removeItemFromMap(ArrayList<Item> items ){
        System.out.println("Remove item from map");
        getImage().setVisible(false);
        items.remove(this);

    }
    public void addItemToMapAndList(GridPane floor, ArrayList<Item> items)  {
        items.add(this);
        int imageId;
        if (this instanceof Tool) {
            imageId = ((Tool) this).getType().getImageId();
        } else if (this instanceof Weapon) {
            imageId = ((Weapon) this).getType().getImageId();
        } else {
            imageId = ((Armour) this).getType().getImageId();
        }
        if (imageId != 0) {
            ImageView image = new ImageView(Tiles.getParticularImage(imageId));
            floor.add(image, getPosX(), getPosY());
            setImage(image);
        }
    }
}
