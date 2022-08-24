package com.example.crazylab;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class GameControler {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("gameScreen.fxml"));
    private Stage stage;
    Parent root ;
    Scene scene ;
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



    @FXML
    public  void move()throws IOException{
        System.out.println("aisndiansdinasdopkinasopdni");
        root = loader.load();
        scene = new Scene(root);
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
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    } {








    }








}
