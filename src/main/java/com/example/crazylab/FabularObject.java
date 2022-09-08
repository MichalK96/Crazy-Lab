package com.example.crazylab;

public enum FabularObject {
    MICROSCOPE (0,0),
    SEQUENCER (0,0),
    SUPERCOMPUTER (0,0),
    DONOR (0,0);

    private int posX;
    private int posY;

    FabularObject(int x, int y){
        this.posX = x;
        this.posY = y;
    }
}
