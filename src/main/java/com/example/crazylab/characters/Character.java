package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Character {
    private int posXTop;
    private int posXBottom;
    private int posYBottom;
    private int posYTop;


    private final ArrayList<ArrayList<Integer>> disallowedFieldsFloor = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");
    private final ArrayList<ArrayList<Integer>>
            disallowedFieldsFurniture = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_furniture1.csv");

    public Character(int posXTop, int posXBottom, int posYBottom,int posYTop) throws IOException {

        this.posXTop = posXTop;
        this.posXBottom= posXBottom;
        this.posYTop = posYTop;
        this.posYBottom = posYBottom;

    }

    public int getPosXTop() {
        return posXTop;
    }

    public int getPosXBottom() {
        return posXBottom;
    }

    public void setPosXBottom(int posXBottom) {
        this.posXBottom = posXBottom;
        this.posXTop = posXBottom;
    }

    public int getPosYBottom() {
        return posYBottom;
    }

    public void setPosYBottom(int posYBottom) {
        this.posYBottom = posYBottom;
        this.posYTop = posYBottom-1;
    }

    public int getPosYTop() {
        return posYTop;
    }



    public boolean checkIfWall(int x, int y) {
        return disallowedFieldsFloor.get(y).get(x) != 77 &&
                disallowedFieldsFloor.get(y).get(x) != 28 &&
                disallowedFieldsFloor.get(y).get(x) != 76 &&
                disallowedFieldsFloor.get(y).get(x) != 84 &&
                disallowedFieldsFloor.get(y).get(x) != 75 &&
                disallowedFieldsFloor.get(y).get(x) != 78 &&
                disallowedFieldsFloor.get(y).get(x) != 63 &&
                disallowedFieldsFloor.get(y).get(x) != 14 &&
                disallowedFieldsFloor.get(y).get(x) != 69 &&
                disallowedFieldsFloor.get(y).get(x) != 83 &&
                disallowedFieldsFloor.get(y).get(x) != 64 &&
                disallowedFieldsFloor.get(y).get(x) != 67 &&
                disallowedFieldsFloor.get(y).get(x) != 82 &&
                (x !=6 || y!=8) &&
                (x !=11 || y!=4) &&
                (x !=12 || y!=4) &&
                (x !=7 || y!=8) &&
                (x !=8 || y!=8) &&
                (x !=9 || y!=8) &&
                (x !=4 || y!=4) &&
                (x !=6 || y!=17) &&
                (x !=6 || y!=16) &&
                (x !=3 || y!=16) &&
                (x !=3 || y!=15) &&
                (x !=3 || y!=14) &&
                (x !=4 || y!=14) &&
                (x !=4 || y!=13) &&
                (x !=3 || y!=13) &&
                (x !=3 || y!=17) &&
                (x !=5 || y!=17) &&
                (x !=4 || y!=17) &&
                (x !=29 || y!=22) &&
                (x !=28 || y!=22) &&
                (x !=28 || y!=25) &&
                (x !=29 || y!=25) &&
                (x !=21 || y!=27) &&
                (x !=22 || y!=27) &&
                (x !=19 || y!=24) &&
                (x !=19 || y!=25) &&
                (x !=19 || y!=28) &&
                (x !=15 || y!=29) &&
                (x !=15 || y!=30) &&
                (x !=16 || y!=30) &&
                (x !=16 || y!=29) &&
                (x !=17 || y!=31) &&
                (x !=18 || y!=31) &&
                (x !=24 || y!=30) &&
                (x !=25 || y!=30) &&
                (x !=26 || y!=30) &&
                (x !=27 || y!=30) &&
                (x !=28 || y!=30) &&
                (x !=29 || y!=30) &&
                (x !=12 || y!=20)&&
                (x != 22 || y != 34) &&
                (x != 23 || y != 34) &&
                (x != 24 || y != 34)&&
                (x != 6 || y != 20)&&
                (x != 6 || y != 21)&&
                (x != 3 || y != 20)&&
                (x != 4 || y != 20)&&
                (x != 3 || y != 24)&&
                (x != 3 || y != 23)&&
                (x != 11 || y != 20)&&
                (x != 12 || y != 24)&&
                (x != 11 || y != 24)&&
                (x != 10 || y != 24)&&
                (x != 30 || y != 34)&&
                (x != 9 || y != 24);
    }



}
