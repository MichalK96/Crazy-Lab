package com.example.crazylab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import java.io.IOException;

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
// warunki na x =>0 && mniejsze niz rozmiar naszej planszy
    int x;
    int y;

    @FXML
    GridPane grid;

    public void moveUp(){
       grid.getChildren().remove(player);
        grid.add( player,x,y-=1);
    }
    public void moveDown(){
        grid.getChildren().remove(player);
        grid.add( player,x,y+=1);
    }
    public void moveRight(){
        grid.getChildren().remove(player);
        grid.add( player,x+=1,y);
    }
    public void moveLeft(){
        grid.getChildren().remove(player);
        grid.add( player,x-=1,y);
    }


    public  void move(Scene scene, Stage stage)throws IOException{

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


















