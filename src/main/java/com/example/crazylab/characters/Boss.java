package com.example.crazylab.characters;

import java.io.IOException;
import java.util.ArrayList;

public class Boss extends Enemy {
    public Boss() throws IOException {
    }

    @Override
    public void move() {

    }

    @Override
    public String getFXMLfile() {
        return "boss_popup.fxml";
    }
}
