package com.example.crazylab;


import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import com.example.crazylab.tiles.Tiles;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import com.example.crazylab.tiles.Doors;


import java.io.IOException;
import java.util.ArrayList;

import static java.time.zone.ZoneRulesProvider.refresh;

public class GameControler {
    Player player = new Player("name");
    private final ArrayList<ArrayList<Integer>> disallowedFields = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");

    private Doors doors;


    Player user = new Player(SceneController.userName);
    Infected infected1 = new Infected(7, 6);
    Infected infected2 = new Infected(7, 14);
    Infected infected3 = new Infected(23, 24);
    Infected infected4 = new Infected(15, 24);
    Infected infected5 = new Infected(4, 25);
    ArrayList<Infected> characters = new ArrayList<>() {
    };

    public void addCharactersToList() {
        characters.add(infected1);
        characters.add(infected2);
        characters.add(infected3);
        characters.add(infected4);
        characters.add(infected5);
    }


    //    @FXML
//    GridPane grid;
    @FXML
    private Label labelUserName;

    @FXML
    GridPane floor;

    public GameControler() throws IOException { }


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
        if (player.checkIfWall(player.getPosX(), player.getPosY() - 1) && doors.canMove(
                player.getPosX(),
                player.getPosY() - 1
                                                                                       )) {
            moveVertically(-1);
        }
    }


    public void moveDown() {
        if (player.checkIfWall(player.getPosX(), player.getPosY() + 1) && doors.canMove(
                player.getPosX(),
                player.getPosY() + 1
                                                                                       )) {
            moveVertically(1);
        }
    }


    public void moveRight() {
        if (player.checkIfWall(player.getPosX() + 1, player.getPosY()) && doors.canMove(
                player.getPosX() + 1,
                player.getPosY()
                                                                                       )) {
            moveHorizontally(1);
        }
    }


    public void moveLeft() {
        if (player.checkIfWall(player.getPosX() - 1, player.getPosY()) && doors.canMove(
                player.getPosX() - 1,
                player.getPosY()
                                                                                       )) {
            moveHorizontally(-1);
        }
    }


    public void paintMap() throws IOException {


        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_floor.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_furniture1.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_items.csv");
        doors = new Doors(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_doors.csv");

        floor.add(player.getImage1(), player.getPosX(), player.getPosY());
        floor.add(player.getImage2(), player.getPosX(), player.getPosTopY());
        floor.add(infected1.getImageBottom(), infected1.getPosX(), infected1.getPosY());
        floor.add(infected1.getImageTop(), infected1.getPosX(), infected1.getPosY() - 1);
        floor.add(infected2.getImageBottom(), infected2.getPosX(), infected2.getPosY());
        floor.add(infected2.getImageTop(), infected2.getPosX(), infected2.getPosY() - 1);
        floor.add(infected3.getImageBottom(), infected3.getPosX(), infected3.getPosY());
        floor.add(infected3.getImageTop(), infected3.getPosX(), infected3.getPosY() - 1);

    }


    public void move(Scene scene) throws IOException {
//       labelUserName.setText(user.getName());
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case UP:
                        moveUp();
                    case RIGHT:
                        moveRight();
                    case LEFT:
                        moveLeft();
                    case DOWN:
                        moveDown();
                    default:
                        System.out.println(keyEvent.getCode());
                }
            }
        });
    }

    public void enemyMoves() {
        for (int i = 0; i < characters.size(); i++) {
            floor.getChildren().remove(characters.get(i).getImageBottom());
            floor.getChildren().remove(characters.get(i).getImageTop());
            characters.get(i).move(characters);
            floor.add(characters.get(i).getImageBottom(), characters.get(i).getPosX(), characters.get(i).getPosY());
            floor.add(characters.get(i).getImageTop(), characters.get(i).getPosX2(), characters.get(i).getPosY2());
        }


    }

    public void initialize() {
        Thread movement = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.currentThread().sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Platform.runLater(() -> {
                        enemyMoves();
                        refresh();
                    });


                }
            }
        });
        movement.start();
    }


    public void moveHorizontally(int moveBy) {
        floor.getChildren().remove(player.getImage1());
        floor.getChildren().remove(player.getImage2());
        floor.add(player.getImage2(), player.getPosX() + moveBy, player.getPosTopY());
        floor.add(player.getImage1(), player.getPosX() + moveBy, player.getPosY());
        player.setPosX(player.getPosX() + moveBy);

        this.onPlayerMove();
    }


    public void moveVertically(int moveBy) {
        floor.getChildren().remove(player.getImage1());
        floor.getChildren().remove(player.getImage2());
        floor.add(player.getImage2(), player.getPosX(), player.getPosTopY() + moveBy);
        floor.add(player.getImage1(), player.getPosX(), player.getPosY() + moveBy);
        player.setPosY(player.getPosY() + moveBy);

        this.onPlayerMove();
    }

    private void onPlayerMove() {
        var x = (double) player.getPosX();
        var y = (double) player.getPosY();

        x = -10 + ((20 / 2) - (x / 2)) * 2;
        y = -10 + ((20 / 2) - (y / 2)) * 2;

        x = Math.min(0, x);
        y = Math.min(0, y);
        x = Math.max(x, -(floor.getColumnCount() - 20));
        y = Math.max(y, -(floor.getRowCount() - 20)); // row count is incorrect for current map

        floor.setLayoutX(x * 32);
        floor.setLayoutY(y * 32);
        doors.onMove(player.getPosX(), player.getPosY());
    }
}


















