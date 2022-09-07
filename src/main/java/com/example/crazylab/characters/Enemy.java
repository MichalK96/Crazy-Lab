package com.example.crazylab.characters;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Enemy extends Character {


    protected Enemy(int posXBottom, int  poxYBottom) throws IOException {
        super(posXBottom,posXBottom,poxYBottom,poxYBottom-1);
    }

    public abstract String getFXMLfile();


    public abstract void move();

    public abstract void move(Player player);
}
