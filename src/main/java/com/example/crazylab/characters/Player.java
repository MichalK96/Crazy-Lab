package com.example.crazylab.characters;

import com.example.crazylab.items.*;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

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
            case "I_mask" -> items.add(new Armour(ArmourType.ATEST_MASK));
            case "I_diyMask" -> items.add(new Armour(ArmourType.DIY_MASK));
            case "I_syringe" -> items.add(new Tool(ToolType.SYRINGE));
            case "I_staningKit" -> items.add(new Tool(ToolType.STANING_KIT));
            case "I_enzymeKit" -> items.add(new Tool(ToolType.ENZYME_KIT));
            case "I_usbKey" -> items.add(new Tool(ToolType.USB_KEY));
            case "I_dnaSample" -> items.add(new Tool(ToolType.DNA_SAMPLE));
            case "I_virusSample" -> items.add(new Tool(ToolType.VIRUS_SAMPLE));
            case "I_report" -> items.add(new Tool(ToolType.REPORT));
            case "I_microscopeImage" -> items.add(new Tool(ToolType.MICROSCOPE_IMAGE));
            case "I_sandwich" -> items.add(new Weapon(WeaponType.SANDWICH));
            case "I_spray" -> items.add(new Weapon(WeaponType.SPRAY));
            default -> System.out.println("Wrong item type");
        }
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
}
