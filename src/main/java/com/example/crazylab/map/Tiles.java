package com.example.crazylab.map;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class Tiles {


    public static int TILE_WIDTH = 32;
    private static final Image hospitalTileSet = new Image("/hospitalDesign.png", 480 * 2, 240 * 2, true, false);
    private static final Map<String, Tile> tileMap = new HashMap<>();

    public static class Tile {
        public final int x, y, w, h;

        Tile(int i, int j) {
            x = i * (TILE_WIDTH + 2);
            y = j * (TILE_WIDTH + 2);
            w = TILE_WIDTH;
            h = TILE_WIDTH;
        }


    }

    static {
        Integer tileIndex = 0;
        int i = 0;
        int j = 0;
        for (int y = 0; y < 489; y++) {

            tileMap.put(String.valueOf(tileIndex), new Tile(i, j));
            i++;
            j++;
            tileIndex++;

        }

    }

    public static void drawTile(GraphicsContext context, Drawable d, int x, int y) {
        Tile tile = tileMap.get(d.getTileName());
        context.drawImage(hospitalTileSet, tile.x, tile.y, tile.w, tile.h,
                x * TILE_WIDTH, y * TILE_WIDTH, TILE_WIDTH, TILE_WIDTH);
    }

}
