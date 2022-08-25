package com.example.crazylab;

import com.example.crazylab.characters.Player;
import com.example.crazylab.items.Armour;
import com.example.crazylab.items.Tool;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import java.io.IOException;
import java.lang.reflect.Array;

public class GameControler {

    @FXML
    private ImageView C_boss;

    @FXML
    private ImageView C_coworker;

    @FXML
    private ImageView C_infected;

    @FXML
    private ImageView I_enzymeKit;

    @FXML
    private ImageView I_mask;

    @FXML
    private ImageView I_spray;

    @FXML
    private ImageView I_syringe;

    @FXML
    private ImageView I_virusSample;

    @FXML
    private GridPane grid;

    @FXML
    private ImageView player;


    // warunki na x =>0 && mniejsze niz rozmiar naszej planszy
    int x;
    int y;
    final int GRIDSIZE = 10;

    Player user = new Player();


   private boolean checkIfEnemy( Integer column,Integer row) {
       //System.out.println(row+"  "+column);
       for (Node node : grid.getChildren()) {
           if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
               System.out.println(GridPane.getRowIndex(node) + "  " + GridPane.getColumnIndex(node));
               if (node instanceof ImageView) {
                   String id = node.getId();
                   if (id.charAt(0)=='I'){
                       System.out.println(id);
                       user.addItem(id);
                       grid.getChildren().remove(node);
                       user.displayItems();
                       return false;
                   } else if (id.charAt(0)=='C'){
                        System.out.println("walka!!!");
                        return true;
                   }
                   }
               }
           }
       return false;
   }


    public void moveUp() {

        if (y > 0&&( !checkIfEnemy(x, y - 1))) {
            grid.getChildren().remove(player);

            grid.add(player, x, y -= 1);
        }
    }

    public void moveDown() {
        if (y < GRIDSIZE&&( !checkIfEnemy(x, y + 1))) {
            grid.getChildren().remove(player);
            grid.add(player, x, y += 1);
        }
    }

    public void moveRight() {
        if (x < GRIDSIZE&&( !checkIfEnemy(x+1, y ))) {
            grid.getChildren().remove(player);
            grid.add(player, x += 1, y);
        }
    }

    public void moveLeft() {
        if (x > 0 && ( !checkIfEnemy(x-1, y))) {
            grid.getChildren().remove(player);
            grid.add(player, x -= 1, y);
        }

    }


    public void move(Scene scene) throws IOException {

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                //System.out.println(keyEvent.getCode());
                switch (keyEvent.getCode()) {
                    case UP -> moveUp();
                    case RIGHT -> moveRight();
                    case LEFT -> moveLeft();
                    case DOWN -> moveDown();
                    default -> System.out.println(keyEvent.getCode());
                }

            }

        });


    }
}


















