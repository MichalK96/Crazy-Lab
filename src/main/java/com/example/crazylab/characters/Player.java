package com.example.crazylab.characters;

import com.example.crazylab.FightController;
import com.example.crazylab.items.*;
import com.example.crazylab.tiles.Doors;
import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

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
    private final String name;

    public Player(String name, int posXBottom, int posYBottom) throws IOException {
        super(posXBottom, posXBottom, posYBottom, posYBottom - 1);
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
        System.out.println(character);
        System.out.println("Fighting with infected");
        System.out.println(character);
        try {
            FightController fightController = new FightController();
            fightController.showPopupWindowFightWithInfected(player, character);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addPlayerToMap(GridPane floor) {
        floor.add(getImageBottom(), getPosXBottom(), getPosYBottom());
        floor.add(getImageTop(), getPosXTop(), getPosYTop());
    }

    public boolean checkIfItemInInventory(ItemType itemType) {
        return inventory.stream().map(Item::getItemType).anyMatch(type -> type.equals(itemType));
    }

    public Infected findInfected(ArrayList<Infected> infecteds) {
        for (Infected infected : infecteds) {
            if (infected.getPosXBottom() == getPosXBottom() && infected.getPosYBottom() == getPosYBottom())
                return infected;
        }
        return null;
    }

    public void moveHorizontally(int moveBy, GridPane floor) {

        floor.getChildren().remove(getImageBottom());
        floor.getChildren().remove(getImageTop());
        floor.add(getImageTop(), getPosXTop() + moveBy, getPosYTop());
        floor.add(getImageBottom(), getPosXBottom() + moveBy, getPosYBottom());
        setPosXBottom(getPosXBottom() + moveBy);

    }


    public void moveVertically(int moveBy, GridPane floor) {

        floor.getChildren().remove(getImageBottom());
        floor.getChildren().remove(getImageTop());
        floor.add(getImageTop(), getPosXTop(), getPosYTop() + moveBy);
        floor.add(getImageBottom(), getPosXBottom(), getPosYBottom() + moveBy);
        setPosYBottom(getPosYBottom() + moveBy);

    }

    public void moveUp(Doors doors, GridPane floor,ArrayList<Character> characters) {
        if (checkIfWall(getPosXBottom(), getPosYBottom() - 1,characters) && doors.canMove(getPosXBottom(),
                getPosYBottom() - 1
        )) {
            moveVertically(-1, floor);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }


    public void moveDown(Doors doors, GridPane floor,ArrayList<Character> characters) {
        if (checkIfWall(getPosXBottom(), getPosYBottom() + 1,characters) && doors.canMove(getPosXBottom(),
                getPosYBottom() + 1
        )) {
            moveVertically(1, floor);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }


    public void moveRight(Doors doors, GridPane floor,ArrayList<Character> characters) {
        if (checkIfWall(getPosXBottom() + 1, getPosYBottom(), characters) && doors.canMove(getPosXBottom() + 1,
                getPosYBottom()
        )) {
            moveHorizontally(1, floor);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }


    public void moveLeft(Doors doors, GridPane floor, ArrayList<Character> characters) {
        if (checkIfWall(getPosXBottom() - 1, getPosYBottom(), characters) && doors.canMove(getPosXBottom() - 1,
                getPosYBottom()
        )) {
            moveHorizontally(-1, floor);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }

    public void heal(){
        for(Item item: inventory){
            if(item.getItemType()== ItemType.SANDWICH){
                System.out.println("leczonq");
                setHealth(getHealth() +4);
                inventory.remove(item);
                break;
            }
        }

    }

}
