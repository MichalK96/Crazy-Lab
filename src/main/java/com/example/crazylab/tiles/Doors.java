package com.example.crazylab.tiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Doors {

    ArrayList<ArrayList<Integer>> mapTiles;
    public int KeyCount = 1;

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
        // can't move through closed door
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

        // we have doors in front/back of us
        // let's open it if we have key
        if (KeyCount <= 0) {
            return;
        }
        KeyCount--;

        // find the starting tile of doors
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

                // redraw the floor
                var img = Tiles.getParticularImage(17);
                gp.add(new ImageView(img), x, y);

                // draw open doors item
                img = Tiles.getParticularImage(_newImg);
                gp.add(new ImageView(img), x, y);
            }
        }

        System.out.printf("Door opened at: %d, %d ... Keys left: %d\n", x2, y2, KeyCount);
    }
}
