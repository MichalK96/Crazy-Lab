package com.example.crazylab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


import java.io.IOException;

public class GameControler {


    @FXML
    Circle player;

    int x;
    int y;

    @FXML
    GridPane grid;

    private void moveUp(){
       grid.getChildren().remove(player);
        grid.add( player,x,y-=1);
    }
    private void moveDown(){
        grid.getChildren().remove(player);
        grid.add( player,x,y+=1);
    }
    private void moveRight(){
        grid.getChildren().remove(player);
        grid.add( player,x+=1,y);
    }
    private void moveLeft(){
        grid.getChildren().remove(player);
        grid.add( player,x-=1,y);
    }


    public  void move(Scene scene, Stage stage)throws IOException{
        System.out.println("aisndiansdinasdopkinasopdni");

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent keyEvent) {
            System.out.println(keyEvent.getCode());
            switch (keyEvent.getCode()) {

                case UP:
                    moveUp();

                    System.out.println("up");
                    break;
                case RIGHT:
                    System.out.println("prawo");
                    System.out.println(player);
                    System.out.println(x);
                    System.out.println(y);
                    moveRight();
                    break;
                case LEFT:
                    System.out.println("up");

                    moveLeft();
                    break;
                case DOWN:
                    moveDown();
                    break;
                default:
                    System.out.println(keyEvent.getCode());
                    break;

            }
            stage.setScene(scene);
            stage.show();
        }

        });



    }
}


















