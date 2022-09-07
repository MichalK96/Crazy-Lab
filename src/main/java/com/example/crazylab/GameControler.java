package com.example.crazylab;


import com.example.crazylab.characters.Boss;
import com.example.crazylab.characters.Coworker;
import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import com.example.crazylab.items.*;
import com.example.crazylab.tiles.Tiles;
import javafx.event.ActionEvent;
import javafx.application.Platform;
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

import com.example.crazylab.tiles.Doors;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import java.util.List;
import java.util.Random;

public class GameControler {
    Player player = new Player("name");
    Boss boss = new Boss();
    private final ArrayList<ArrayList<Integer>> disallowedFieldsFloor = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");
    private final ArrayList<ArrayList<Integer>> disallowedFieldsFurniture = Tiles.csvAsArray(
            "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_furniture1.csv");


    private Doors doors;
    private final ArrayList<Item> items = new ArrayList<>();
    private final ArrayList<Infected> infected = new ArrayList<>();
    private final ArrayList<Coworker> coworkers = new ArrayList<>();

    Player user = new Player(SceneController.userName);
    Infected example = new Infected(0,0);

    @FXML
    private Label labelUserName;
    @FXML
    private Label equipment;
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
        infected.add(new Infected(7, 6));
        infected.add(new Infected(7, 14));
        infected.add(new Infected(23, 24));
        infected.add(new Infected(15, 24));
        infected.add(new Infected(4, 25));

        coworkers.add(new Coworker(12,21));
        coworkers.add(new Coworker(12,5));
        coworkers.add(new Coworker(4,5));
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
            if (player.checkIfWall(x, y)) {
                coordinates.add(x);
                coordinates.add(y);
                return coordinates;
            }
        }
    }

    private void generateItemsList() {
        addItemToMap(new Tool(ItemType.SYRINGE, 28, 25));
        addItemToMap(new Tool(ItemType.STANING_KIT, 19, 9));
        addItemToMap(new Tool(ItemType.ENZYME_KIT, 21, 19));
        addItemToMap(new Tool(ItemType.USB_KEY, 10, 13));
        addItemToMap(new Tool(ItemType.KEY, 27, 30));
        addItemToMap(new Armour(ItemType.DIY_MASK, 18, 31));
        addItemToMap(new Armour(ItemType.ATEST_MASK, 5, 16));
        addItemToMap(new Weapon(ItemType.SPRAY, 29, 32));
        addItemToMap(new Weapon(ItemType.SANDWICH, 5, 21));
        addItemToMap(new Weapon(ItemType.SANDWICH, 22, 11));
    }

    private void addItemToMap(Item item) {
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

    private boolean isItemNextToPlayer(Item item) {
        int itemX = item.getPosX();
        int itemY = item.getPosY();
        int playerX = player.getPosX();
        int playerY = player.getPosY();
        return itemX == playerX && itemY == playerY ||
               itemX + 1 == playerX && itemY == playerY ||
               itemX - 1 == playerX && itemY == playerY ||
               itemX == playerX && itemY + 1 == playerY ||
               itemX == playerX && itemY - 1 == playerY ||
               itemX + 1 == playerX && itemY + 1 == playerY ||
               itemX - 1 == playerX && itemY - 1 == playerY ||
               itemX + 1 == playerX && itemY - 1 == playerY ||
               itemX - 1 == playerX && itemY + 1 == playerY;
    }

    private void addItemIfExistToInventory() {
        for (Item item : items) {
            if (isItemNextToPlayer(item)) {
                player.addItemToInventory(item);
                try {
                    showPopupWindowItem(item.getItemType());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                removeItemFromMap(item);
                refreshInventoryDisplay();
                break;
            }
        }
    }

    private void refreshInventoryDisplay() {
        System.out.println("Set text in inventory label");
        equipment.setText(player.prepareItemsToDisplay());
    }

    private void showPopupWindowItem(ItemType itemType) throws IOException {
        popup=true;
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(itemType.getFxmlFile())));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(gameBoard);
        stage.addEventHandler(KeyEvent.KEY_PRESSED,  (event) -> {
            stage.close();
        });
        stage.showAndWait();

    }

    private void showPopupWindowFabularEvent(FabularEvent event) throws IOException {
        popup=true;
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(event.getFxmlFile())));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(gameBoard);
        stage.addEventHandler(KeyEvent.KEY_PRESSED,  (e) -> {
            stage.close();
        });
        stage.showAndWait();

    }

    private void collectSample() throws IOException {
        if ((player.getPosX()==28 || player.getPosX()==29) && player.getPosY()==22) {
            if (!player.checkIfItemInInventory(ItemType.SYRINGE)){
                showPopupWindowFabularEvent(FabularEvent.SAMPLE_NOT_COLLECTED);
            } else {
                Tool virusSample = new Tool(ItemType.VIRUS_SAMPLE);
                showPopupWindowFabularEvent(FabularEvent.SAMPLE_COLLECTED);
                player.addItemToInventory(virusSample);
                refreshInventoryDisplay();
            }
        }
    }

    private void takeMicroscopePicture() throws IOException {
        if ((player.getPosX()==11 || player.getPosX()==12) && player.getPosY()==4) {
            if (player.checkIfItemInInventory(ItemType.VIRUS_SAMPLE) && player.checkIfItemInInventory(ItemType.STANING_KIT)){
                Tool microscopeImage = new Tool(ItemType.MICROSCOPE_IMAGE);
                showPopupWindowFabularEvent(FabularEvent.MICROSCOPE_PICTURE_TAKEN);
                player.addItemToInventory(microscopeImage);
            } else {
                showPopupWindowFabularEvent(FabularEvent.MICROSCOPE_PICTURE_NOT_TAKEN);
            }
        }
    }


    public void moveUp() {
        if (player.checkIfWall(player.getPosX(), player.getPosY() - 1) && doors.canMove(player.getPosX(),
                player.getPosY() - 1
        )) {
            moveVertically(-1);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }


    public void moveDown() {
        if (player.checkIfWall(player.getPosX(), player.getPosY() + 1) && doors.canMove(player.getPosX(),
                player.getPosY() + 1
        )) {
            moveVertically(1);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }


    public void moveRight() {
        if (player.checkIfWall(player.getPosX() + 1, player.getPosY()) && doors.canMove(player.getPosX() + 1,
                player.getPosY()
        )) {
            moveHorizontally(1);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }


    public void moveLeft() {
        if (player.checkIfWall(player.getPosX() - 1, player.getPosY()) && doors.canMove(player.getPosX() - 1,
                player.getPosY()
        )) {
            moveHorizontally(-1);
//            System.out.println(player.getPosX()+"        "+ player.getPosY());
        }
    }

    public void addInfectedToMap() throws IOException {
        addCharactersToList();
        for (int i = 0; i < infected.size(); i++) {
            floor.add(infected.get(i).getImageBottom(), infected.get(i).getPosX(), infected.get(i).getPosY());
            floor.add(infected.get(i).getImageTop(), infected.get(i).getPosX(), infected.get(i).getPosY() - 1);
        }
    }
    public void addCoworkersToMap(){
        for (int i = 0; i < coworkers.size(); i++) {
            floor.add(coworkers.get(i).getImageBottom(), coworkers.get(i).getPosX(), coworkers.get(i).getPosY());
            floor.add(coworkers.get(i).getImageTop(), coworkers.get(i).getPosX(), coworkers.get(i).getPosY() - 1);
        }

    }
    public void putBossOnMap(){
        if(floor!=null){
            floor.add(boss.getImageTop(), boss.getPosXBottom(), boss.getPosYBottom());
            floor.add(boss.getImageBottom(), boss.getPosXTop(), boss.getPosYTop());

        }

    }
    public void removeBossFromMap(){
        if(floor!=null){floor.getChildren().remove(boss.getImageTop());
            floor.getChildren().remove(boss.getImageBottom());}


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
        addCoworkersToMap();
        floor.add(boss.getImageTop(), boss.getPosXTop(), boss.getPosYTop());
        floor.add(boss.getImageBottom(), boss.getPosXBottom(), boss.getPosYBottom());
    }


    public void bossMove(){
        removeBossFromMap( );
        boss.move(player);
        putBossOnMap();
    }

    public void enemyMoves() {
        for (Infected character : infected) {
            floor.getChildren().remove(character.getImageBottom());
            floor.getChildren().remove(character.getImageTop());
            character.move();
            if (character.checkContactWithPlayer(player.getPosX(), player.getPosY())) player.fightWithInfected();
            floor.add(character.getImageBottom(), character.getPosX(), character.getPosY());
            floor.add(character.getImageTop(), character.getPosX2(), character.getPosY2());
        }



    }
    public void initialize1() {
        Thread movement = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000 / boss.getSpeed());
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    Platform.runLater(() -> {
                        if(!popup){
                            bossMove();
                        }

//                            refresh();
                    });
                }
            }
        });
        movement.start();
    }

    public void initialize() {
        Thread movement = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000 / example.getSpeed() );
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    Platform.runLater(() -> {
                        if(!popup){
                            enemyMoves();
                        }
//                            refresh();
                    });
                }
            }
        });
        movement.start();
    }


    public void move(Scene scene) throws IOException {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

                switch (keyEvent.getCode()) {
                    case UP -> moveUp();
                    case RIGHT -> moveRight();
                    case LEFT -> moveLeft();
                    case DOWN -> moveDown();
                    case X -> addItemIfExistToInventory();
                    default -> System.out.println(keyEvent.getCode());
                }
                try {
                    collectSample();
                    takeMicroscopePicture();
                    if (player.isContactWithInfected(infected)) player.fightWithInfected();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        });
    }


    public void moveHorizontally(int moveBy) {
        popup=false;
        floor.getChildren().remove(player.getImage1());
        floor.getChildren().remove(player.getImage2());
        floor.add(player.getImage2(), player.getPosX() + moveBy, player.getPosTopY());
        floor.add(player.getImage1(), player.getPosX() + moveBy, player.getPosY());
        player.setPosX(player.getPosX() + moveBy);
        this.onPlayerMove();
    }


    public void moveVertically(int moveBy) {
        popup=false;
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
        controller.initialize1();
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


















