package com.example.crazylab.characters;

import com.example.crazylab.FightController;
import com.example.crazylab.items.*;
import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Player extends Character {

    private int health = 32;
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private final ImageView imageBottom = new ImageView(Tiles.getParticularImage(333));
    private final ImageView imageTop = new ImageView(Tiles.getParticularImage(318));

    public ImageView getImageTop() {
        return imageTop;
    }

    public ImageView getImageBottom() {
        return imageBottom;
    }

    private final List<Item> inventory = new ArrayList<>();
    private String name;

    public Player(String name,int posXBottom, int posYBottom) throws IOException {
        super(posXBottom,posXBottom,posYBottom,posYBottom-1);
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

    public List<Item> getInventory() {
        return inventory;
    }

    public void fightWithBoss() {
        System.out.println("Fighting with boss");
    }

    public void fightWithCoworker() {
        System.out.println("Fighting with coworker");
    }

    public void fightWithInfected(Player player, Infected character) {
        System.out.println("Fighting with infected");
        System.out.println(character);
        try {
            FightController fightController = new FightController();
            //fightController.setPlayer(player);
            //fightController.setInfected(character);
            fightController.showPopupWindowFightWithInfected(player, character);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkIfItemInInventory(ItemType itemType){
        return inventory.stream().map(item -> item.getItemType()).anyMatch(type -> type.equals(itemType));
    }

    public Infected findInfected(ArrayList<Infected> infecteds) {
        for (Infected infected : infecteds) {
            if (infected.getPosXBottom() == getPosXBottom() && infected.getPosYBottom() == getPosYBottom()) return infected;
        }
        return null;
    }



}
