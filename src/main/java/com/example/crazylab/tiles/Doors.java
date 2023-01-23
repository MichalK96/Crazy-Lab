package com.example.crazylab.tiles;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.io.IOException;
import java.util.ArrayList;

public class Doors {

    ArrayList<ArrayList<Integer>> mapTiles;
    public int KeyCount = 2;

    private GridPane gp;
    public Doors(GridPane grid, String path) throws IOException {
        gp = grid;
        mapTiles = Tiles.csvAsArray(path);
        for (int i = 0; i < mapTiles.size(); i++) {
            for (int j = 0; j < mapTiles.get(i).size(); j++) {
                Tiles.addToGrid(grid, i, j, mapTiles);
            }
        }
    }

    public boolean canMove(int x, int y) {
        int el = mapTiles.get(y).get(x);
        return el != 92 && el != 93 && el != 107 && el != 108;
    }

    public void onMove(int x, int y) {
        if (!canMove(x, y - 1))
            y = y - 1;
        else if (!canMove(x, y + 1)) {
            y = y + 1;
        } else
            return;
        if (KeyCount <= 0) {
            return;
        }
        KeyCount--;
        int x2 = x;
        int y2 = y;
        while (x2 >= 0 && !canMove(x2, y)) {
            x2--;
        }
        while (y2 >= 0 && !canMove(x, y2)) {
            y2--;
        }
        x2++;
        y2++;

        for (y = y2; y <= y2 + 1; y++) {
            var line = mapTiles.get(y);
            for (x = x2; x <= x2 + 1; x++) {
                int _newImg = line.get(x) - 2;
                line.set(x, _newImg);
                var img = Tiles.getParticularImage(17);
                gp.add(new ImageView(img), x, y);
                img = Tiles.getParticularImage(_newImg);
                gp.add(new ImageView(img), x, y);
            }
        }
    }
}
