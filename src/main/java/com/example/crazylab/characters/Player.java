package com.example.crazylab.characters;

import com.example.crazylab.items.Armour;
import com.example.crazylab.items.ArmourType;
import com.example.crazylab.items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player extends Character {

    private final List<Item> items = new ArrayList<>();

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void addItem(String item) {
        switch (item) {
            case "mask" -> items.add(new Armour(ArmourType.MASK));
            case "diyMask" -> items.add(new Armour(ArmourType.DIY_MASK));
            case "spray" -> items.add(new Armour(ArmourType.SPRAY));
        }

    }

}
