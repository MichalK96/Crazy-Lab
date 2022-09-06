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

    public void printItems() {
        for (Item item : inventory) {
            System.out.println(item);
        }
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

//    public void addItem(String item) {
//        switch (item) {
//            case "I_mask" -> items.add(new Armour(ArmourType.ATEST_MASK));
//            case "I_diyMask" -> items.add(new Armour(ArmourType.DIY_MASK));
//            case "I_syringe" -> items.add(new Tool(ToolType.SYRINGE));
//            case "I_staningKit" -> items.add(new Tool(ToolType.STANING_KIT));
//            case "I_enzymeKit" -> items.add(new Tool(ToolType.ENZYME_KIT));
//            case "I_usbKey" -> items.add(new Tool(ToolType.USB_KEY));
//            case "I_dnaSample" -> items.add(new Tool(ToolType.DNA_SAMPLE));
//            case "I_virusSample" -> items.add(new Tool(ToolType.VIRUS_SAMPLE));
//            case "I_report" -> items.add(new Tool(ToolType.REPORT));
//            case "I_microscopeImage" -> items.add(new Tool(ToolType.MICROSCOPE_IMAGE));
//            case "I_sandwich" -> items.add(new Weapon(WeaponType.SANDWICH));
//            case "I_spray" -> items.add(new Weapon(WeaponType.SPRAY));
//            default -> System.out.println("Wrong item type");
//        }
//    }


    public void fightWithBoss() {
        System.out.println("Fighting with boss");
    }

    public void fightWithCoworker() {
        System.out.println("Fighting with coworker");
    }

    public void fightWithInfected() {
        System.out.println("Fighting with infected");
    }
}
