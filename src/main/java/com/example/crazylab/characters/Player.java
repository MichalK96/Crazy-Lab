package com.example.crazylab.characters;

import com.example.crazylab.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player extends Character {

    private final List<Item> items = new ArrayList<>();
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void addItem(String item) {
        switch (item) {
            case "mask" -> items.add(new Armour(ArmourType.MASK));
            case "diyMask" -> items.add(new Armour(ArmourType.DIY_MASK));
            case "syringe" -> items.add(new Tool(ToolType.SYRINGE));
            case "staningKit" -> items.add(new Tool(ToolType.STANING_KIT));
            case "enzymeKit" -> items.add(new Tool(ToolType.ENZYME_KIT));
            case "usbKey" -> items.add(new Tool(ToolType.USB_KEY));
            case "dnaSample" -> items.add(new Tool(ToolType.DNA_SAMPLE));
            case "virusSample" -> items.add(new Tool(ToolType.VIRUS_SAMPLE));
            case "report" -> items.add(new Tool(ToolType.REPORT));
            case "microscopeImage" -> items.add(new Tool(ToolType.MICROSCOPE_IMAGE));
            case "sandwich" -> items.add(new Weapon(WeaponType.SANDWICH));
            case "spray" -> items.add(new Weapon(WeaponType.SPRAY));
            default -> System.out.println("Wrong item type");
        }

    }

    public void fightWithEnemy(String id) {
        switch (id) {
            case "boss" -> System.out.println("Fight with boss");
            case "coworker" -> System.out.println("Fight with coworker");
            case "infected" -> System.out.println("Fight with infected");
        }
    }


}
