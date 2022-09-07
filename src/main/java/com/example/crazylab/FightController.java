package com.example.crazylab;

import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class FightController {

    private Scene scene;
    private Player player;
    private Infected infected;


    @FXML
    private Label enemyHealth;

    @FXML
    private Label playerHealth;

    @FXML
    private Label showEnemyAttack;

    @FXML
    private Label showPlayerAttack;


    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setInfected(Infected infected) {
        this.infected = infected;
        System.out.println(this.infected);
    }

    public void showPopupWindowFightWithInfected(Player player, Infected infected) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("fight_with_infected.fxml"));
        Scene scene = new Scene(loader.load());
        FightController controller = loader.getController();
        controller.setInfected(infected);
        controller.setPlayer(player);
        stage.setTitle("Fight with infected");
        stage.setScene(scene);
        controller.fightHandler(scene);
        stage.show();

    }

    private void fightHandler(Scene scene) throws IOException {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

                switch (keyEvent.getCode()) {
//                    case UP -> moveUp();
//                    case RIGHT -> moveRight();
//                    case LEFT -> moveLeft();
//                    case DOWN -> moveDown();
                    case ENTER -> attackEnemy();
                    default -> System.out.println(keyEvent.getCode());
                }
            }
        });
    }

    private void updateEnemyStatsDisplay(int randomAttack) {
        String toDisplay = showPlayerAttack.getText();
        toDisplay += "\n" + "Attack:  -" + randomAttack;
        showPlayerAttack.setText(toDisplay);
        enemyHealth.setText(String.valueOf(infected.getHealth()));

    }

    private void updatePlayerStatsDisplay(int randomAttack) {
        String toDisplay = showEnemyAttack.getText();
        toDisplay += "\n" + "Attack:  -" + randomAttack;
        showEnemyAttack.setText(toDisplay);
        playerHealth.setText(String.valueOf(player.getHealth()));
    }

    private void handlePlayerWinner() {
        showEnemyAttack.setText("YOU WIN!\n\nPres Enter\nto continue");
    }

    private void handleEnemyWinner() {
        showPlayerAttack.setText("YOU LOST\n\nPres Enter\nto continue");
    }

    private void attackPlayer() {
        int playerHealth = player.getHealth();
        int randomAttack = (int) (Math.random() * (8 - 2));  // TODO dobrać losowanie siły ataku
        playerHealth -= randomAttack;
        player.setHealth(playerHealth);
        updatePlayerStatsDisplay(randomAttack);
    }

    private void attackEnemy() {
        int infectedHealth = this.infected.getHealth();
        int randomAttack = (int) (Math.random() * (10 - 4));  // TODO dobrać losowanie siły ataku
        infectedHealth -= randomAttack;
        infected.setHealth(infectedHealth);
        updateEnemyStatsDisplay(randomAttack);
        if (infectedHealth <= 0) handlePlayerWinner();
        attackPlayer();

    }

}
