package com.example.crazylab.characters;

import com.example.crazylab.items.*;
import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Player extends Character {
    private int posX1 = 6;
    private int posY1 = 6;
    private int posX2 = 6;
    private int posY2 = 5;

    public void setPosX2(int posX2) {
        this.posX2 = posX2;
    }

    public void setPosY2(int posY2) {
        this.posY2 = posY2;
    }

    public int getPosTopX() {
        return posX2;
    }

    public int getPosTopY() {
        return posY2;
    }


    private final ImageView image1 = new ImageView(Tiles.getParticularImage(333));
    private final ImageView image2 = new ImageView(Tiles.getParticularImage(318));

    public ImageView getImage2() {
        return image2;
    }

    public ImageView getImage1() {
        return image1;
    }

    public int getPosX() {
        return posX1;
    }

    public void setPosX(int posX) {
        this.posX1 = posX;
        this.posX2 = posX;
    }

    public int getPosY() {
        return posY1;
    }

    public void setPosY(int posY) {
        this.posY1 = posY;
        this.posY2 = posY - 1;
    }

    private final List<Item> inventory = new ArrayList<>();
    private String name;

    public Player(String name) throws IOException {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String prepareItemsToDisplay() {
        StringBuilder inventoryToDisplay = new StringBuilder();
        for (Item item : inventory) {
            if (item instanceof Tool) {
                inventoryToDisplay.append("\n").append(((Tool) item).getType());
            } else if (item instanceof Weapon) {
                inventoryToDisplay.append("\n").append(((Weapon) item).getType());
            } else {
                inventoryToDisplay.append("\n").append(((Armour) item).getType());
            }
        }
        return "Inventory:" + inventoryToDisplay.toString().replace("_", " ").toLowerCase();
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void fightWithBoss() {
        System.out.println("Fighting with boss");
    }

    public void fightWithCoworker() {
        System.out.println("Fighting with coworker");
    }

    public void fightWithInfected() {
        System.out.println("Fighting with infected");
    }

    public boolean checkIfItemInInventory(ItemType itemType){
        return inventory.stream().map(item -> item.getItemType()).anyMatch(type -> type.equals(itemType));
    }

    public boolean isContactWithInfected(ArrayList<Infected> infecteds) {
        for (Infected infected : infecteds) {
            if (infected.posX == posX1 && infected.posY == posY1) return true;
        }
        return false;
    }


}
