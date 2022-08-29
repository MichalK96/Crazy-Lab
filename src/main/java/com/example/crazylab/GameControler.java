package com.example.crazylab;

import com.example.crazylab.characters.Boss;
import com.example.crazylab.characters.Coworker;
import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import com.example.crazylab.tiles.Tiles;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;


import java.io.IOException;

public class GameControler {

//    @FXML
//    private ImageView CB_boss;
//
//    @FXML
//    private ImageView CC_coworker;
//
//    @FXML
//    private ImageView CC_coworker1;
//
//    @FXML
//    private ImageView CI_infected;
//
//    @FXML
//    private ImageView CI_infected1;
//
//    @FXML
//    private ImageView I_enzymeKit;
//
//    @FXML
//    private ImageView I_mask;
//
//    @FXML
//    private ImageView I_spray;
//
//    @FXML
//    private ImageView I_syringe;
//
//    @FXML
//    private ImageView I_virusSample;
//
//    @FXML
//    private GridPane grid;
//
//    @FXML
//    private ImageView player;
//
//    @FXML
//    public ListView<String> inventoryBox;

//    private void addItemToTable(String item) {
//        inventoryBox.getItems().add(item);
//    }


    @FXML
    Rectangle player;
    int x = 5;
    int y = 1;
    final int GRIDSIZE = 15;


    Player user = new Player(SceneController.userName);
    Boss theBoss = new Boss();
    Coworker coworker1 = new Coworker();
    Coworker coworker2 = new Coworker();
    Infected infected1 = new Infected();
    Infected infected2 = new Infected();

//    @FXML
//    GridPane grid;
    @FXML
    private Label labelUserName;

    @FXML
    GridPane floor;



   private boolean checkIfEnemy( Integer column,Integer row) {
       //System.out.println(row+"  "+column);
       for (Node node : floor.getChildren()) {
           if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
               if (node instanceof ImageView) {
                   System.out.println("imageview");
                   String id = node.getId();
                   if (id.charAt(0)=='I'){
                       System.out.println(id + " added to equipment");
//                       addItemToTable(id.substring(2));
//                       user.addItem(id);
//                       floor.getChildren().remove(node);
//                       user.displayItems();
//                       return false;
                   } else if (id.charAt(0)=='C'){
                       System.out.println(id);
                       switch (id.charAt(1)){
                           case 'B' -> user.fightWithBoss();
                           case 'C' -> user.fightWithCoworker();
                           case 'I' -> user.fightWithInfected();
                           default -> System.out.println("Unknown enemy");
                       }
                        return true;
                   }
                   }
               }
           }
       return false;
   }


    public void moveUp() {
        floor.getChildren().remove(player);

        floor.add(player, x, y -= 1);
//        if (y > 0 && (!checkIfEnemy(x, y - 1))) {
//            floor.getChildren().remove(player);
//
//            floor.add(player, x, y -= 1);
//        }
    }

    public void moveDown() {
        floor.getChildren().remove(player);
        floor.add(player, x, y += 1);
//        if (y < GRIDSIZE && (!checkIfEnemy(x, y + 1))) {
//            floor.getChildren().remove(player);
//            floor.add(player, x, y += 1);
//        }
    }

    public void moveRight() {
        floor.getChildren().remove(player);
        floor.add(player, x += 1, y);
//        if (x < GRIDSIZE && (!checkIfEnemy(x+1, y ))) {
//            floor.getChildren().remove(player);
//            floor.add(player, x += 1, y);
//        }
    }

    public void moveLeft() {
        floor.getChildren().remove(player);
        floor.add(player, x -= 1, y);
//        if (x > 0 && ( !checkIfEnemy(x-1, y))) {
//            floor.getChildren().remove(player);
//            floor.add(player, x -= 1, y);
//        }

    }
    public void paintMap() throws IOException {
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_floor.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_doors.csv");
    }


    public void move(Scene scene) throws IOException {
//       labelUserName.setText(user.getName());

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println(keyEvent.getCode());
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


















