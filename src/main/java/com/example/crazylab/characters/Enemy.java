package com.example.crazylab.characters;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Enemy extends Character {


    protected Enemy(int posXBottom, int  poxYBottom) throws IOException {
        super(posXBottom,posXBottom,poxYBottom,poxYBottom-1);
    }

    public abstract void move(ArrayList<Character> characters);

    public abstract void move(Player player, ArrayList<Character> characters);

    public abstract String getFXMLfile();

}
