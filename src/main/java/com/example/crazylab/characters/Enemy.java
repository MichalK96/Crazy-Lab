package com.example.crazylab.characters;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Enemy extends Character {


    protected Enemy() throws IOException {
    }

    public abstract void move(ArrayList<Infected> characters);

    public abstract String getFXMLfile();
}
