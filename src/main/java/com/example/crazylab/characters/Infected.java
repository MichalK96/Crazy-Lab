package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Infected extends Enemy {
    int posX2;
    int posY2;

    public int getPosX2() {
        return posX2;
    }

    public void setPosX2(int posX2) {
        this.posX2 = posX2;
    }

    public int getPosY2() {
        return posY2;
    }

    public void setPosY2() {
        this.posY2 = this.posY - 1;
    }

    int posX;
    int posY;

    ImageView imageTop = new ImageView(Tiles.getParticularImage(618));
    ImageView imageBottom = new ImageView(Tiles.getParticularImage(633));
    Boolean neutralized = false;
    int speed = 2;

    public Infected(int posX, int posY) throws IOException {
        super();
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
        this.posX2=posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
        this.posY2= posY -1;
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

    public Boolean getNeutralized() {
        return neutralized;
    }

    public void setNeutralized(Boolean neutralized) {
        this.neutralized = neutralized;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int getRandom() {
        Random rand = new Random();
        return rand.nextInt(0, 4);

    }

    private List<Integer> getNextPosition() {
        int direction = getRandom();
        List<Integer> nextPosition = new ArrayList<>();
        switch (direction) {
            case 0:
                nextPosition.add(getPosY());
                nextPosition.add(getPosX() - 1);
                return nextPosition;
            case 1:
                nextPosition.add(getPosY());
                nextPosition.add(getPosX() + 1);
                return nextPosition;
            case 2:
                nextPosition.add(getPosY() + 1);
                nextPosition.add(getPosX());
                return nextPosition;
            case 3:
                nextPosition.add(getPosY() - 1);
                nextPosition.add(getPosX());
                return nextPosition;
            default:
                return nextPosition;
        }

    }

    @Override
    public void move() {
        List<Integer> nextPosition;
        do {
            nextPosition = getNextPosition();
        }
        while (  !checkIfWall(nextPosition.get(1),nextPosition.get(0))) ;
        setPosX(nextPosition.get(1));
        setPosY(nextPosition.get(0));

    }

    @Override
    public void move(Player player) {
    }


}
