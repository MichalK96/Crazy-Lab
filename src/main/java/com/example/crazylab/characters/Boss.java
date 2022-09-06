package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;

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

    ImageView imageBottom = new ImageView(Tiles.getParticularImage(468));
    ImageView imageTop = new ImageView(Tiles.getParticularImage(483));

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


    public Boss() throws IOException {
        super();
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
            if (Math.abs(getPosYBottom() - player.getPosY()) <= howClose &&  // góra - dół
                Math.abs(getPosXBottom() - player.getPosX()) <= howClose  // prawo - lewo

            ) {
                int currentX = getPosXBottom();
                int currentY = getPosYBottom();
                nextPosition = getNextPosition();
                while (((Math.abs(player.getPosX() - nextPosition.get(1)) > Math.abs(currentX - player.getPosX())) ||
                        (Math.abs(player.getPosY() - nextPosition.get(0)) > Math.abs(currentY - player.getPosY()))
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
}
