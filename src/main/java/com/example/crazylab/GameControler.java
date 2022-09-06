package com.example.crazylab;


import com.example.crazylab.characters.Boss;
import com.example.crazylab.characters.Enemy;
import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import com.example.crazylab.items.*;
import com.example.crazylab.tiles.Tiles;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

import com.example.crazylab.tiles.Doors;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

import static java.time.zone.ZoneRulesProvider.refresh;

import java.util.List;
import java.util.Random;
import java.util.Objects;

public class GameControler {
    Player player = new Player("name");
    private final ArrayList<ArrayList<Integer>> disallowedFields = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");


    private Doors doors;
    private final ArrayList<Item> items = new ArrayList<>();
    private final ArrayList<Infected> characters = new ArrayList<>();

    Player user = new Player(SceneController.userName);

    @FXML
    private Label labelUserName;

    @FXML
    GridPane floor;
    @FXML
    private Label textWelcome;
    @FXML
    private ImageView img_foundItem;
    @FXML
    private Text text_foundItem;
    private Stage gameBoard;
    boolean popup = false;

    public GameControler() throws IOException {
    }


    public void addCharactersToList() throws IOException {
        characters.add(new Infected(7, 6));
        characters.add(new Infected(7, 14));
        characters.add(new Infected(23, 24));
        characters.add(new Infected(15, 24));
        characters.add(new Infected(4, 25));
    }


    void setName(String name) {
        textWelcome.setText("Welcome, dr " + name);
    }


    private List<Integer> generateRandomCoordinates() {
        Random random = new Random();
        List<Integer> coordinates = new ArrayList<>();
        while (true) {
            int x = random.nextInt(3, 29);     // range: 3 - 29
            int y = random.nextInt(4, 35);     // range: 4 - 35
            if (checkIfWall(x, y)) {
                coordinates.add(x);
                coordinates.add(y);
                return coordinates;
            }
        }
    }

    private void generateItemsList() {
        List<Integer> randomCords;
        for(ItemType item: ItemType.values()){
            randomCords = generateRandomCoordinates();
            if(item.getType().equals("TOOL")) {addItemToInventory(new Tool(item, randomCords.get(0), randomCords.get(1)));}
            if(item.getType().equals("ARMOR")) {addItemToInventory(new Armour(item, randomCords.get(0), randomCords.get(1)));}
            if(item.getType().equals("WEAPON")) {addItemToInventory(new Weapon(item, randomCords.get(0), randomCords.get(1)));}
        }
    }

    private void addItemToInventory(Item item) {
        items.add(item);
        int imageId;
        if (item instanceof Tool) {
            imageId = ((Tool) item).getType().getImageId();
        } else if (item instanceof Weapon) {
            imageId = ((Weapon) item).getType().getImageId();
        } else {
            imageId = ((Armour) item).getType().getImageId();
        }
        if (imageId != 0) {
            ImageView image = new ImageView(Tiles.getParticularImage(imageId));
            floor.add(image, item.getPosX(), item.getPosY());
            item.setImage(image);
        }
    }

    private void removeItemFromMap(Item item) {
        System.out.println("Remove item from map");
        item.getImage().setVisible(false);
        items.remove(item);

    }

    private void addItemIfExist() {
        for (Item item : items) {
            if (item.getPosX() == player.getPosX() && item.getPosY() == player.getPosY()) {
                System.out.println("Item added to inventory (ArrayList)");
                player.addItemToInventory(item);
                removeItemFromMap(item);
                player.displayItems();       // TODO to remove
            }
        }
    }

    private boolean checkIfWall(int x, int y) {
        return disallowedFields.get(y).get(x) != 77 &&
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

    private void showPopupWindowEnemy(Enemy enemy) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(enemy.getFXMLfile())));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(gameBoard);
        stage.showAndWait();
    }

    private void showPopupWindoItem(ItemType item) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(item.getFxmlFile())));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(gameBoard);
        stage.showAndWait();
        popup=true;
    }


    public void moveUp() {
        if (player.checkIfWall(player.getPosX(), player.getPosY() - 1) && doors.canMove(player.getPosX(),
                player.getPosY() - 1
        )) {
            moveVertically(-1);
        }
    }


    public void moveDown() {
        if (player.checkIfWall(player.getPosX(), player.getPosY() + 1) && doors.canMove(player.getPosX(),
                player.getPosY() + 1
        )) {
            moveVertically(1);
        }
    }


    public void moveRight() {
        if (player.checkIfWall(player.getPosX() + 1, player.getPosY()) && doors.canMove(player.getPosX() + 1,
                player.getPosY()
        )) {
            moveHorizontally(1);
        }
    }


    public void moveLeft() {
        if (player.checkIfWall(player.getPosX() - 1, player.getPosY()) && doors.canMove(player.getPosX() - 1,
                player.getPosY()
        )) {
            moveHorizontally(-1);
        }
    }

    public void addInfectedToMap() throws IOException {
        addCharactersToList();
        for (int i = 0; i < characters.size(); i++) {
            floor.add(characters.get(i).getImageBottom(), characters.get(i).getPosX(), characters.get(i).getPosY());
            floor.add(characters.get(i).getImageTop(), characters.get(i).getPosX(), characters.get(i).getPosY() - 1);
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
        addInfectedToMap();
    }

    public void enemyMoves() {
        for (Infected character : characters) {
            floor.getChildren().remove(character.getImageBottom());
            floor.getChildren().remove(character.getImageTop());
            character.move();
            floor.add(character.getImageBottom(), character.getPosX(), character.getPosY());
            floor.add(character.getImageTop(), character.getPosX2(), character.getPosY2());
        }


    }

    public void initialize() {
        Thread movement = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.currentThread().sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("cos poszło nie tak ;/");
                    }
                    Platform.runLater(() -> {
                        if(!popup){
                            enemyMoves();
                            refresh();
                        }

                    });
                }
            }
        });
        movement.start();
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

                addItemIfExist();

            }
        });
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

    @FXML
    private void startNewGame(ActionEvent event) throws IOException {
        //showPopupWindoItem(ItemType.SANDWICH);
        //Boss boss = new Boss();
        //showPopupWindowEnemy(boss);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        Parent root = loader.load();
        GameControler controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        gameBoard = stage;
        Scene scene = new Scene(root);
        controller.paintMap();

        controller.move(scene);
        stage.setScene(scene);
        stage.setWidth(32 * 20);
        stage.setHeight(32 * 20);
        stage.setMaxWidth(32 * 20);
        stage.setMaxHeight(32 * 20);
        stage.setMinWidth(32 * 20);
        stage.setMinHeight(32 * 20);
        stage.show();
    }


}


















