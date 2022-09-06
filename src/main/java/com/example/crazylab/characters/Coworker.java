package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;

public class Coworker extends Enemy{
    int posX;
    int posY;

    ImageView imageTop = new ImageView(Tiles.getParticularImage(468));
    ImageView imageBottom = new ImageView(Tiles.getParticularImage(483));
    Boolean neutralized = false;

    public Coworker(int posX, int posY) throws IOException {
        super();
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }


    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public ImageView getImageTop() {
        return imageTop;
    }

    public void setImageTop(ImageView imageTop) {
        this.imageTop = imageTop;
    }

    public ImageView getImageBottom() {
        return imageBottom;
    }

    public void setImageBottom(ImageView imageBottom) {
        this.imageBottom = imageBottom;
    }

    public Boolean getHungry() {
        return neutralized;
    }

    public void setHungry(Boolean hungry) {
        this.neutralized = hungry;
    }

    @Override
    public void move(ArrayList<Infected> characters) {

    }

    @Override
    public String getFXMLfile() {
        return "coworker_popup.fxml";
    }

}
