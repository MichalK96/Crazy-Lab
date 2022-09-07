package com.example.crazylab.characters;

import com.example.crazylab.tiles.Tiles;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Character {



    private final ArrayList<ArrayList<Integer>> disallowedFields = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");

    protected Character() throws IOException { }



    public boolean checkIfWall(int x, int y) {
        return    disallowedFields.get(y).get(x) != 77 &&
                disallowedFields.get(y).get(x) != 28 &&
                disallowedFields.get(y).get(x) != 76 &&
                disallowedFields.get(y).get(x) != 84 &&
                disallowedFields.get(y).get(x) != 75 &&
                disallowedFields.get(y).get(x) != 78 &&
                disallowedFields.get(y).get(x) != 63 &&
                disallowedFields.get(y).get(x) != 14 &&
                disallowedFields.get(y).get(x) != 69 &&
                disallowedFields.get(y).get(x) != 83 &&
                disallowedFields.get(y).get(x) != 64 &&
                disallowedFields.get(y).get(x) != 67 &&
                disallowedFields.get(y).get(x) != 82 &&
                (x !=22 || y!=34) &&
                (x !=23 || y!=34) &&
                (x !=24 || y!=34) ;

    }



}
