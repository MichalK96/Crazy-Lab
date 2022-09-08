package com.example.crazylab;


import com.example.crazylab.characters.Boss;
import com.example.crazylab.characters.Character;
import com.example.crazylab.characters.Coworker;
import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import com.example.crazylab.items.*;
import com.example.crazylab.save.Save;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

import com.example.crazylab.tiles.Doors;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class GameControler {
    private final int playerInitialPosX = 22;
    private final int playerInitialPosY = 31;
    private final int initialBossPosX = 23;
    private final int initialBossPosY = 32;
    Player player = new Player("name", playerInitialPosX, playerInitialPosY);
    Boss boss = new Boss(initialBossPosX, initialBossPosY);
    private Doors doors;
    private final ArrayList<Item> items = new ArrayList<>();
    private final ArrayList<Infected> infected = new ArrayList<>();
    private final ArrayList<Coworker> coworkers = new ArrayList<>();
    private final ArrayList<Character> allCharacters = new ArrayList<>();

    Player user = new Player(SceneController.userName, playerInitialPosX, playerInitialPosY);
    Infected example = new Infected(0, 0);

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
    public static Stage gameBoard;
    boolean popup = false;

    public GameControler() throws IOException {
    }


    public void addCharactersToList() throws IOException {
        infected.add(new Infected(7, 6));
        infected.add(new Infected(7, 14));
        infected.add(new Infected(23, 24));
        infected.add(new Infected(15, 24));
        infected.add(new Infected(4, 25));
        coworkers.add(new Coworker(12, 21));
        coworkers.add(new Coworker(12, 5));
        coworkers.add(new Coworker(4, 5));
        allCharacters.addAll(coworkers);
//        allCharacters.addAll(infected);
//        allCharacters.add(player);
//        allCharacters.add(boss);


    }


    void setName(String name) {
        textWelcome.setText("Welcome, dr " + name);
    }

    private void generateItemsList() {
        new Tool(ItemType.SYRINGE, 28, 25).addItemToMap(floor, items);
        new Tool(ItemType.STANING_KIT, 19, 9).addItemToMap(floor, items);
        new Tool(ItemType.ENZYME_KIT, 21, 19).addItemToMap(floor, items);
        new Tool(ItemType.USB_KEY, 10, 13).addItemToMap(floor, items);
        new Tool(ItemType.KEY, 27, 30).addItemToMap(floor, items);
        new Armour(ItemType.DIY_MASK, 18, 31).addItemToMap(floor, items);
        new Armour(ItemType.ATEST_MASK, 5, 16).addItemToMap(floor, items);
        new Weapon(ItemType.SPRAY, 29, 32).addItemToMap(floor, items);
        new Weapon(ItemType.SANDWICH, 5, 21).addItemToMap(floor, items);
        new Weapon(ItemType.SANDWICH, 22, 11).addItemToMap(floor, items);
    }

    private void addItemIfExistToInventory() {
        for (Item item : items) {
            if (item.isItemNextToPlayer(player)) {
                player.addItemToInventory(item);
                try {
                    showPopupWindowItem(item.getItemType());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                item.removeItemFromMap(items);
                refreshInventoryDisplay();
                break;
            }
        }
    }

    private void refreshInventoryDisplay() {
        equipment.setText(player.prepareItemsToDisplay());
    }

    private void showPopupWindowItem(ItemType itemType) throws IOException {
        popup = true;
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(itemType.getFxmlFile())));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(gameBoard);
        stage.addEventHandler(KeyEvent.KEY_PRESSED, (event) -> {
            stage.close();
        });
        stage.showAndWait();

    }
//meeting boss fiorst time
    private void showPopupWindowFabularEvent(FabularEvent event) throws IOException {
        popup = true;
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(event.getFxmlFile())));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(gameBoard);
        stage.addEventHandler(KeyEvent.KEY_PRESSED, (e) -> {
            stage.close();
        });
        stage.showAndWait();
    }

    private void collectSample() throws IOException {
        if ((player.getPosXBottom() == 28 || player.getPosXBottom() == 29) && player.getPosYBottom() == 22) {
            if (!player.checkIfItemInInventory(ItemType.SYRINGE)) {
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
        if ((player.getPosXBottom() == 11 || player.getPosXBottom() == 12) && player.getPosYBottom() == 4) {
            if (player.checkIfItemInInventory(ItemType.VIRUS_SAMPLE) && player.checkIfItemInInventory(ItemType.STANING_KIT)) {
                Tool microscopeImage = new Tool(ItemType.MICROSCOPE_IMAGE);
                showPopupWindowFabularEvent(FabularEvent.MICROSCOPE_PICTURE_TAKEN);
                player.addItemToInventory(microscopeImage);
            } else {
                showPopupWindowFabularEvent(FabularEvent.MICROSCOPE_PICTURE_NOT_TAKEN);
            }
        }
    }

    public void setGame() throws IOException {
        addCharactersToList();
        generateItemsList();
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_floor.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_walls.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_furniture1.csv");
        Tiles.drawMap(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_items.csv");
        doors = new Doors(floor, "src/main/resources/com/example/crazylab/designElements/CrazyLabLvl1_doors.csv");
        player.addPlayerToMap(floor);
        boss.addBossToMap(floor);
        infected.forEach(e -> e.addInfectedToMap(floor));
        coworkers.forEach(coworker -> coworker.addCoworkersToMap(floor));
    }


    public void enemyMoves(ArrayList<Character> characters) {
        for (Infected character : infected) {
            floor.getChildren().remove(character.getImageBottom());
            floor.getChildren().remove(character.getImageTop());
            character.move(characters);
            if (character.checkContactWithPlayer(player.getPosXBottom(), player.getPosYBottom())) {
                System.out.println(character);
                player.fightWithInfected(player, character);
                popup = true;
            }
            floor.add(character.getImageBottom(), character.getPosXBottom(), character.getPosYBottom());
            floor.add(character.getImageTop(), character.getPosXTop(), character.getPosYTop());
        }


    }

    public void initializeBoss() {
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

                        if (!popup) {
                            boss.bossMove(floor, player,allCharacters);
                            if(!boss.getQuestGiven()&&
                                player.getPosXBottom()==boss.getPosXBottom()&&
                                player.getPosYBottom()==boss.getPosYBottom()){
                                try {
                                    showPopupWindowFabularEvent(FabularEvent.MEETING_BOSS_FIRST_TIME);
                                    boss.setQuestGiven(true);
                                    boss.setPosYBottom(7);
                                    boss.setPosXBottom(7);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }

                            }
                        }
                    });
                }
            }
        });
        movement.start();
    }

    public void initializeEnemy() {
        Thread movement = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000 / example.getSpeed());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Platform.runLater(() -> {
                    if (!popup) {
                        enemyMoves(allCharacters);
                    }
                });
            }
        });
        movement.start();
    }


    public void move(Scene scene)  {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

                if (keyEvent.getCode() == KeyCode.S && keyEvent.isControlDown()) {
                    String inventory = "";
                    for (Item item : player.getInventory()) {
                        inventory += String.format("%d,", item.getItemType().ordinal());
                    }
                    if (inventory.length() > 0)
                        inventory = inventory.substring(0, inventory.length() - 1);

                    var s = new Save();
                    String pos = String.format("%d:%d", player.getPosXTop(), player.getPosYTop());
                    s.saveProgress("1", pos, inventory);
                }

                switch (keyEvent.getCode()) {
                    case UP -> {
                        player.moveUp(doors, floor,allCharacters);
                        popup = false;
                        onPlayerMove();
                    }
                    case RIGHT -> {
                        player.moveRight(doors, floor,allCharacters);
                        popup = false;
                        onPlayerMove();
                    }
                    case LEFT -> {
                        player.moveLeft(doors, floor,allCharacters);
                        popup = false;
                        onPlayerMove();
                    }
                    case DOWN -> {
                        player.moveDown(doors, floor,allCharacters);
                        popup = false;
                        onPlayerMove();
                    }
                    case X -> addItemIfExistToInventory();
                    default -> System.out.println(keyEvent.getCode());
                }
                try {
                    collectSample();
                    takeMicroscopePicture();
                    Infected opponent = player.findInfected(infected);
                    if (opponent != null) {
                        player.fightWithInfected(player, opponent);
                        System.out.println(opponent);
                        popup = true;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private void onPlayerMove() {
        var x = (double) player.getPosXBottom();
        var y = (double) player.getPosYBottom();

        x = -10 + ((20 / 2) - (x / 2)) * 2;
        y = -10 + ((20 / 2) - (y / 2)) * 2;

        x = Math.min(0, x);
        y = Math.min(0, y);
        x = Math.max(x, -(floor.getColumnCount() - 20));
        y = Math.max(y, -(floor.getRowCount() - 20)); // row count is incorrect for current map

        floor.setLayoutX(x * 32);
        floor.setLayoutY(y * 32);
        doors.onMove(player.getPosXBottom(), player.getPosYBottom());
    }


    @FXML
    private void startNewGame(ActionEvent event) throws IOException {
        //showPopupWindoItem(ItemType.SANDWICH);

        //showPopupWindowEnemy(boss);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        MusicPlayer.playSound(MusicPlayer.opening, (float) 0.6);
        Parent root = loader.load();
        GameControler controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        gameBoard = stage;
        Scene scene = new Scene(root);
        controller.setGame();
        controller.initializeBoss();
        controller.initializeEnemy();
        sceneSettings(controller, stage, scene);
    }


    static void sceneSettings(GameControler controller, Stage stage, Scene scene) throws IOException {
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
