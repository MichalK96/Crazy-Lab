package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boss extends Enemy {
    int howClose =6;

    int posXTop = 23;
    int posYTop = 32;
    int posYBottom = posYTop - 1;
    int posXBottom = posXTop;
    int speed = 5;

    public int getSpeed() {
        return speed;
    }

    ImageView imageTop = new ImageView(Tiles.getParticularImage(783));
    ImageView imageBottom = new ImageView(Tiles.getParticularImage(768));

    public int getPosXTop() {
        return posXTop;
    }


    public int getPosYTop() {
        return posYTop;
    }


    public int getPosXBottom() {
        return posXBottom;
    }


    public int getPosYBottom() {
        return posYBottom;
    }

    public void setPosXBottom(int posXBottom) {
        this.posXBottom = posXBottom;
        this.posXTop = posXBottom;

    }

    public void setPosYBottom(int posYBottom) {
        this.posYBottom = posYBottom;
        this.posYTop = posYBottom - 1;
    }

    public ImageView getImageTop() {
        return imageTop;
    }


    public ImageView getImageBottom() {
        return imageBottom;
    }


    public Boss(int posXBottom,int posYBottom) throws IOException {
        super(posXBottom,posYBottom);
    }

    @Override
    public void move() {
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
    public void move(Player player) {
        List<Integer> nextPosition = getNextPosition();

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
                    if(checkIfWall(nextPosition.get(1),nextPosition.get(0)))
                    {
                        break;
                    }
                }

            } else {
                nextPosition = getNextPosition();
            }
        }
        while (!checkIfWall(nextPosition.get(1), nextPosition.get(0)));

        setPosXBottom(nextPosition.get(1));
        setPosYBottom(nextPosition.get(0));


    }

    @Override
    public String getFXMLfile() {
        return "boss_popup.fxml";
    }

    public void putBossOnMap(GridPane floor) {
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


    public void bossMove(GridPane floor,Player player) {
        removeBossFromMap(floor);
        move(player);
        putBossOnMap(floor);
    }
}
