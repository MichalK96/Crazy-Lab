package com.example.crazylab;

import com.example.crazylab.characters.Player;

public enum FabularObject {
    MICROSCOPE (11, 12, 4),
    SEQUENCER (11, 12, 20),
    SUPERCOMPUTER (4, 5, 4),
    DONOR (28, 29, 22),
    ELEVATOR (16, 17, 3);

    private int x1;
    private int x2;
    private int y;

    FabularObject(int x1, int x2, int y){
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
    }

    public int getX1(){
        return x1;
    }

    public int getX2(){
        return x2;
    }

    public int getY(){
        return y;
    }

    public boolean isPlayerNextToMachine(Player player) {
        int playerX = player.getPosXBottom();
        int playerY = player.getPosYBottom();
        System.out.println("x" + playerX + " y" + playerY);
        return y == playerY && x1 == playerX+1 ||
                y == playerY && x1 == playerX-1||
                x1 == playerX && y == playerY+1 ||
                x1 == playerX && y == playerY-1 ||
                x2 == playerX && y == playerY+1 ||
                x2 == playerX && y == playerY-1;
    }
}
