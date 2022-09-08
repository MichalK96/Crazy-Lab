package com.example.crazylab;

public enum FabularObject {
    MICROSCOPE (11, 12, 4),
    SEQUENCER (11, 12, 20),
    SUPERCOMPUTER (4, 5, 5),
    DONOR (16, 17, 3);

    private int x1;
    private int x2;
    private int y;

    FabularObject(int x1, int x2, int y){
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
    }
}
