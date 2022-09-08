package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monkey extends Enemy {

    int howClose =6;
    int posXTop = 23;
    int posYTop = 32;
    int posYBottom = posYTop - 1;
    int posXBottom = posXTop;
    int speed = 5;

    public int getSpeed() {
        return speed;
    }

    ImageView imageTop = new ImageView(Tiles.getParticularImage(468));
    ImageView imageBottom = new ImageView(Tiles.getParticularImage(483));



    public ImageView getImageTop() {
        return imageTop;
    }


    public ImageView getImageBottom() {
        return imageBottom;
    }


    protected Monkey(int posXBottom,int posYBottom) throws IOException {
        super(posXBottom,posYBottom);
    }



    @Override
    public void move(ArrayList<Character> characters) {

    }

    @Override
    public String getFXMLfile() {
        return null;
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
        List<Integer> nextPosition = getNextPosition();

        do {
            if (Math.abs(getPosYBottom() - player.getPosYBottom()) <= howClose &&  // góra - dół
                    Math.abs(getPosXBottom() - player.getPosXBottom()) <= howClose  // prawo - lewo

            ) {
                int currentX = getPosXBottom();
                int currentY = getPosYBottom();
                nextPosition = getNextPosition();
                while (((Math.abs(player.getPosXBottom() - nextPosition.get(1)) < Math.abs(currentX - player.getPosXBottom())) ||
                        (Math.abs(player.getPosYBottom() - nextPosition.get(0)) < Math.abs(currentY - player.getPosYBottom()))
                )) {
                    nextPosition = getNextPosition();
                    if(checkIfWall(nextPosition.get(1),nextPosition.get(0),characters))
                    {
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
}
