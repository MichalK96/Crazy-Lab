package com.example.crazylab.characters;

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

    public void addItem(Item item) {
        items.add(item);
    }
}
