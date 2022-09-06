package com.example.crazylab.characters;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Enemy extends Character {


    protected Enemy() throws IOException {
    }

    public abstract String getFXMLfile();


    public abstract void move();

    public abstract void move(Player player);
}
