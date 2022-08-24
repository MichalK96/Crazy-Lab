package com.example.crazylab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
    Circle player;


    @FXML
    Rectangle s1;
    @FXML
    Rectangle s2;
    @FXML
    Rectangle s3;
    @FXML
    Rectangle s4;
    @FXML
    Polygon item;


    // warunki na x =>0 && mniejsze niz rozmiar naszej planszy
    int x;
    int y;
    final int GRIDSIZE = 10;

    @FXML
    GridPane grid;

   private boolean checkIfEnemy(Integer row, Integer column) {
       System.out.println(row+"  "+column);
        for (Node node : grid.getChildren()) {
            if(GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column){
                System.out.println(GridPane.getRowIndex(node)+"  " +GridPane.getColumnIndex(node));
//                tu wywołanie waliki
                if (node instanceof Rectangle){// tu sprawdzam czy przeciwnik
                    System.out.println("walka!!!");
                    return (node instanceof Rectangle);
                } else if (node instanceof Polygon ) {
                    System.out.println("item!!");
                    return true;
//                    podnoszenie itemu
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
        if (x > 0&& ( !checkIfEnemy(x-1, y))) {
            grid.getChildren().remove(player);
            grid.add(player, x -= 1, y);
        }

    }

    public void hihi() {
        Image im = new Image("F:\\CP.png");
        player.setFill(new ImagePattern(im));
        Image ss = new Image("F:\\SQ.png");

        s4.setFill(new ImagePattern(ss));


    }

    public void move(Scene scene) throws IOException {

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println(keyEvent.getCode());
                switch (keyEvent.getCode()) {
                    case UP:
                        moveUp();
                        break;
                    case RIGHT:
                        moveRight();
                        break;
                    case LEFT:
                        moveLeft();
                        break;
                    case DOWN:
                        moveDown();
                        break;
                    default:
                        System.out.println(keyEvent.getCode());
                        break;
                }

            }

        });


    }
}


















