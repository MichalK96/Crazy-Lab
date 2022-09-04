package com.example.crazylab;

import com.example.crazylab.characters.Boss;
import com.example.crazylab.characters.Coworker;
import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import com.example.crazylab.items.Armour;
import com.example.crazylab.items.Tool;
import com.example.crazylab.tiles.Tiles;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
import java.util.ArrayList;

public class GameControler {
    Player player = new Player("name");
    private final ArrayList<ArrayList<Integer>> disallowedFields = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");


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

    public GameControler() throws IOException { }

    private boolean checkIfWall(int x, int y) {
          return    disallowedFields.get(y).get(x) != 77 &&
                    disallowedFields.get(y).get(x) != 28 &&
                    disallowedFields.get(y).get(x) != 76 &&
                    disallowedFields.get(y).get(x) != 84 &&
                    disallowedFields.get(y).get(x) != 75 &&
                    disallowedFields.get(y).get(x) != 78 &&
                    disallowedFields.get(y).get(x) != 63 &&
                    disallowedFields.get(y).get(x) != 14 &&
                    disallowedFields.get(y).get(x) != 69 &&
                    disallowedFields.get(y).get(x) != 83 &&
                    disallowedFields.get(y).get(x) != 64 &&
                    disallowedFields.get(y).get(x) != 67 &&
                    disallowedFields.get(y).get(x) != 82;

    }


    private boolean checkIfEnemy(Integer column, Integer row) {

        for (Node node : floor.getChildren()) {
            if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
                if (node instanceof ImageView) {
                                       String id = node.getId();
                    if (id.charAt(0) == 'I') {
//                       System.out.println(id + " added to equipment");
//                       addItemToTable(id.substring(2));
//                       user.addItem(id);
//                       floor.getChildren().remove(node);
//                       user.displayItems();
//                       return false;
                    } else if (id.charAt(0) == 'C') {
                        System.out.println(id);
                        switch (id.charAt(1)) {
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
        if (checkIfWall(player.getPosX(), player.getPosY() - 1)) {
            moveVertically(-1);
        }
    }


    public void moveDown() {
        if (checkIfWall(player.getPosX(), player.getPosY() + 1)) {
            moveVertically(1);
        }
    }


    public void moveRight() {
        if (checkIfWall(player.getPosX() + 1, player.getPosY())) {
            moveHorizontally(1);
        }
    }


    public void moveLeft() {
        if (checkIfWall(player.getPosX() - 1, player.getPosY())) {
            moveHorizontally(-1);
        }
    }


    public void paintMap() throws IOException {
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_floor.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_doors.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_furniture1.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_items.csv");

        floor.add(player.getImage1(), player.getPosX(), player.getPosY());
        floor.add(player.getImage2(), player.getPosX(), player.getPosTopY());
    }


    public void move(Scene scene) throws IOException {
//       labelUserName.setText(user.getName());
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

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


    public void moveHorizontally(int moveBy){
        floor.getChildren().remove(player.getImage1());
        floor.getChildren().remove(player.getImage2());
        floor.add(player.getImage2(), player.getPosX() + moveBy, player.getPosTopY());
        floor.add(player.getImage1(), player.getPosX() + moveBy, player.getPosY());
        player.setPosX(player.getPosX() + moveBy);

        this.onPlayerMove();
    }


    public void moveVertically(int moveBy){
        floor.getChildren().remove(player.getImage1());
        floor.getChildren().remove(player.getImage2());
        floor.add(player.getImage2(), player.getPosX(), player.getPosTopY() + moveBy);
        floor.add(player.getImage1(), player.getPosX(), player.getPosY() + moveBy);
        player.setPosY(player.getPosY() + moveBy);

        this.onPlayerMove();
    }

    private void onPlayerMove()
    {
        var x = (double) player.getPosX();
        var y = (double) player.getPosY();

        x = -10 + ((20/2) - (x/2))*2;
        y = -10 + ((20/2) - (y/2))*2;

        x = Math.min(0, x);
        y = Math.min(0, y);
        x = Math.max(x, -(floor.getColumnCount()-20));
        y = Math.max(y, -(floor.getRowCount()-20)); // row count is incorrect for current map

        floor.setLayoutX(x*32);
        floor.setLayoutY(y*32);
    }
}


















