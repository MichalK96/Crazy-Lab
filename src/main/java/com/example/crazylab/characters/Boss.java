package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boss extends Enemy {
    private Boolean questGiven = false;
    private final int howClose = 6;
    private final int speed = 5;
    public int getSpeed() {
        return speed;
    }

    ImageView imageTop = new ImageView(Tiles.getParticularImage(783));
    ImageView imageBottom = new ImageView(Tiles.getParticularImage(768));


    public ImageView getImageTop() {
        return imageTop;
    }


    public ImageView getImageBottom() {
        return imageBottom;
    }


    public Boss(int posXBottom, int posYBottom) throws IOException {
        super(posXBottom, posYBottom);
    }



    @Override
    public void move(ArrayList<Character> characters) {}

    public Boolean getQuestGiven() {
        return questGiven;
    }

    public void setQuestGiven(Boolean questGiven) {
        this.questGiven = questGiven;
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
    public void move(Player player,ArrayList<Character> characters) {
        List<Integer> nextPosition;
        do {
            if (Math.abs(getPosYBottom() - player.getPosYBottom()) <= howClose &&  // góra - dół
                    Math.abs(getPosXBottom() - player.getPosXBottom()) <= howClose  // prawo - lewo
            ) {
                int currentX = getPosXBottom();
                int currentY = getPosYBottom();
                nextPosition = getNextPosition();
                while (((Math.abs(player.getPosXBottom() - nextPosition.get(1)) > Math.abs(currentX - player.getPosXBottom())) ||
                        (Math.abs(player.getPosYBottom() - nextPosition.get(0)) > Math.abs(currentY - player.getPosYBottom()))
                )) {
                    nextPosition = getNextPosition();
                    if (checkIfWall(nextPosition.get(1), nextPosition.get(0),characters)) {
                        nextPosition = getNextPosition();
                        break;
                    }
                }
            } else {
                nextPosition = getNextPosition();
            }
        }
        while (!checkIfWall(nextPosition.get(1), nextPosition.get(0),characters));

        setPosXBottom(nextPosition.get(1));
        setPosYBottom(nextPosition.get(0));


    }

    @Override
    public String getFXMLfile() {
        return "boss_popup.fxml";
    }

    public void addBossToMap(GridPane floor) {
        if (floor != null) {
            floor.add(getImageTop(), getPosXBottom(), getPosYBottom());
            floor.add(getImageBottom(), getPosXTop(), getPosYTop());

        }

    }

    public void removeBossFromMap(GridPane floor) {
        if (floor != null) {
            floor.getChildren().remove(getImageTop());
            floor.getChildren().remove(getImageBottom());
        }
    }


    public void bossMove(GridPane floor, Player player,ArrayList<Character> characters) {

        removeBossFromMap(floor);
        move(player,characters);

        addBossToMap(floor);
    }
}
