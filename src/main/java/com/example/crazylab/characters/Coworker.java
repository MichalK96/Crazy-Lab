package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

public class Coworker extends Enemy{


    ImageView imageBottom = new ImageView(Tiles.getParticularImage(483));
    ImageView imageTop = new ImageView(Tiles.getParticularImage(468));


    Boolean neutralized = false;

    public Coworker(int posXBottom, int posYBottom) throws IOException {
        super(posXBottom,posYBottom);

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
    public void move() {

    }



    @Override
    public void move(Player player) {

    }

    @Override
    public String getFXMLfile() {
        return "coworker_popup.fxml";
    }
    public void addCoworkersToMap(GridPane floor) {
            floor.add(getImageBottom(), getPosXBottom(),getPosYBottom());
            floor.add(getImageTop(), getPosXTop(), getPosYTop());
    }

}
