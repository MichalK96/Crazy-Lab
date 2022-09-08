package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Infected extends Enemy {

    int speed = 2;
    int health = 20;



    ImageView imageTop = new ImageView(Tiles.getParticularImage(618));
    ImageView imageBottom = new ImageView(Tiles.getParticularImage(633));
    Boolean neutralized = false;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    public Infected(int poxXBottom, int poxYBottom) throws IOException {
        super(poxXBottom,poxYBottom);

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
                nextPosition.add(getPosYBottom());
                nextPosition.add(getPosXBottom() - 1);
                return nextPosition;
            case 1:
                nextPosition.add(getPosYBottom());
                nextPosition.add(getPosXBottom() + 1);
                return nextPosition;
            case 2:
                nextPosition.add(getPosYBottom() + 1);
                nextPosition.add(getPosXBottom());
                return nextPosition;
            case 3:
                nextPosition.add(getPosYBottom() - 1);
                nextPosition.add(getPosXBottom());
                return nextPosition;
            default:
                return nextPosition;
        }

    }

    @Override
    public void move(ArrayList<Character> characters) {
        List<Integer> nextPosition;
        do {
            nextPosition = getNextPosition();
        }
        while (!checkIfWall(nextPosition.get(1),nextPosition.get(0),characters)) ;
        setPosXBottom(nextPosition.get(1));
        setPosYBottom(nextPosition.get(0));
    }

    @Override
    public void move(Player player, ArrayList<Character> characters) {

    }

    @Override
    public String getFXMLfile() {
        return "infected_popup.fxml";
    }

    public void removeInfectedFromMap(Infected character) {
        character.getImageBottom().setVisible(false);
        character.getImageTop().setVisible(false);
    }


    public boolean checkContactWithPlayer(int playerPosX, int playerPosY) {
        return getPosXBottom() == playerPosX && getPosYBottom() == playerPosY;
    }
    public void addInfectedToMap(GridPane floor){
            floor.add(getImageBottom(),getPosXBottom(),getPosYBottom());
            floor.add(getImageTop(), getPosXTop(), getPosYTop() );

    }
}
