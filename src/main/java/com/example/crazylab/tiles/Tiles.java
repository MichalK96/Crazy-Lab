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


public class Tiles {
    public static int TILE_WIDTH = 32;
    public static String PATH_TO_HOSPITAL_TILES
            = "src/main/resources/com/example/crazylab/designElements/hospitalDesign.png";

    public static int MAX_ID = 1214;
    public static HashMap<String, BufferedImage> PARTICULAR_IMAGES;

    static {
        try {
            PARTICULAR_IMAGES = getFieldPictures();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static HashMap<String, BufferedImage> getFieldPictures() throws IOException {
        HashMap<String, BufferedImage> images = new HashMap<>();
        BufferedImage wholeImage = ImageIO.read(new File((PATH_TO_HOSPITAL_TILES)));
        BufferedImage image;
        for (int i = 0; i < MAX_ID; i++) {
            int x = (i / 15) * TILE_WIDTH;
            int y = (i % 15) * TILE_WIDTH;
            image = wholeImage.getSubimage(y, x, TILE_WIDTH, TILE_WIDTH);
            images.put(String.valueOf(i), image);
        }

        return images;
    }


    public static ArrayList<ArrayList<Integer>> csvAsArray(String path) throws IOException {
        ArrayList<ArrayList<Integer>> tab = new ArrayList<>();
        Scanner sc = new Scanner(new File(path));
        while (sc.hasNextLine()) {
            ArrayList<Integer> nextLine = new ArrayList<>();
            String[] line = sc.nextLine().split(",");
            for (String s : line) {
                nextLine.add(Integer.parseInt(s));
            }
            tab.add(nextLine);
        }
        sc.close();
        return tab;
    }

    private static Image convertToFxImage(BufferedImage image) {
        WritableImage wr = null;
        if (image != null) {
            wr = new WritableImage(image.getWidth(), image.getHeight());
            PixelWriter pw = wr.getPixelWriter();
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    ((PixelWriter) pw).setArgb(x, y, image.getRGB(x, y));
                }
            }
        }
        return new ImageView(wr).getImage();
    }

    // w tej funkcji EWIDENTNIE zmienic nazwenictow bo to jest ochydne
    public static void addToGrid(GridPane grid, int i, int j, ArrayList<ArrayList<Integer>> mapTiles) throws IOException {
        BufferedImage image = (BufferedImage) PARTICULAR_IMAGES.get(String.valueOf(mapTiles.get(i).get(j)));
        Image convertedImage = convertToFxImage(image);
        grid.add(new ImageView(convertedImage), j, i);
    }

    public static void drawMap(GridPane grid, String path) throws IOException {
        ArrayList<ArrayList<Integer>> mapTiles = csvAsArray(path);
        for (int i = 0; i < mapTiles.size(); i++) {
            for (int j = 0; j < mapTiles.get(i).size(); j++) {
                addToGrid(grid, i, j, mapTiles);
            }
        }
    }

    public static Image getParticularImage(int ID) {
        BufferedImage image = PARTICULAR_IMAGES.get(String.valueOf(ID));
        return convertToFxImage(image);
    }
}
