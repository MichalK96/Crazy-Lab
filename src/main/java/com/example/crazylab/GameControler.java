package com.example.crazylab;

import com.example.crazylab.characters.Boss;
import com.example.crazylab.characters.Coworker;
import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import com.example.crazylab.items.*;
import com.example.crazylab.tiles.Tiles;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

import com.example.crazylab.tiles.Doors;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class GameControler {
    Player player = new Player("name");
    private final ArrayList<ArrayList<Integer>> disallowedFields = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");

    private Doors doors;

    final int GRIDSIZE = 15;

    private ArrayList<Item> items = new ArrayList<>();


    Player user = new Player(SceneController.userName);
    Boss theBoss = new Boss();
    Coworker coworker1 = new Coworker();
    Coworker coworker2 = new Coworker();
    Infected infected1 = new Infected();
    Infected infected2 = new Infected();

    @FXML
    private Label labelUserName;

    @FXML
    GridPane floor;

    @FXML
    private Label textWelcome;

    private Stage gameBoard;

    public GameControler() throws IOException { }

    void setName(String name) {
        textWelcome.setText("Welcome, dr " + name);
    }

    private void generateItemsList() {
        items.add(new Weapon(WeaponType.SPRAY, 7, 8));
        items.add(new Weapon(WeaponType.SANDWICH, 6, 8));
    }

    private void addItemIfExist() {
        for (Item item : items) {
            if (item.getPosX() == player.getPosX() &&  item.getPosY() == player.getPosY()) {
                System.out.println("Item added to inventory (ArrayList)");
                player.addItemToInventory(item);
                items.remove(item);
            }
    }
    }

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


    private boolean checkIfEnemy(Integer column, Integer row) throws IOException {

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
                            case 'B' -> {
                                showPopupWindow("BOSS");
                                user.fightWithBoss();
                            }
                            case 'C' -> {
                                showPopupWindow("COWORKER");
                                user.fightWithCoworker();
                            }
                            case 'I' -> {
                                showPopupWindow("INFECTED");
                                user.fightWithInfected();
                            }
                            default -> System.out.println("Unknown enemy");
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void showPopupWindow(String character) throws IOException {
        String fxmlFile = null;
        if(character.equals("BOSS")) {fxmlFile = "boss_popup.fxml";};
        if(character.equals("COWORKER"))  {fxmlFile = "coworker_popup.fxml"; };
        if(character.equals("INFECTED"))  {fxmlFile = "infected_popup.fxml"; };

        Stage stage = new Stage();
        assert fxmlFile != null;
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(gameBoard);
        stage.showAndWait();
    }


    public void moveUp() {
        if (checkIfWall(player.getPosX(), player.getPosY() - 1) &&
                doors.canMove(player.getPosX(), player.getPosY() - 1)) {
            moveVertically(-1);
        }
    }


    public void moveDown() {
        if (checkIfWall(player.getPosX(), player.getPosY() + 1) &&
                doors.canMove(player.getPosX(), player.getPosY() + 1)) {
            moveVertically(1);
        }
    }


    public void moveRight() {
        if (checkIfWall(player.getPosX() + 1, player.getPosY()) &&
                doors.canMove(player.getPosX() + 1, player.getPosY())) {
            moveHorizontally(1);
        }
    }


    public void moveLeft() {
        if (checkIfWall(player.getPosX() - 1, player.getPosY()) &&
                doors.canMove(player.getPosX() - 1, player.getPosY())) {
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
        generateItemsList();
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
                System.out.println("X: " + player.getPosX());
                System.out.println("Y: " + player.getPosY());
                addItemIfExist();
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
        doors.onMove(player.getPosX(), player.getPosY());
    }

    @FXML
    private void startNewGame(ActionEvent event) throws IOException {
        //showPopupWindow("BOSS");
        //showPopupWindow("COWORKER");
        //showPopupWindow("INFECTED");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        Parent root = loader.load();
        GameControler controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        gameBoard = stage;
        Scene scene = new Scene(root);
        controller.paintMap();
        controller.move(scene);
        stage.setScene(scene);


        stage.setWidth(32*20);
        stage.setHeight(32*20);
        stage.setMaxWidth(32*20);
        stage.setMaxHeight(32*20);
        stage.setMinWidth(32*20);
        stage.setMinHeight(32*20);

        stage.show();
    }

}


















