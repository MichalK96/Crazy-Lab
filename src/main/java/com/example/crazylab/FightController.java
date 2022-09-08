package com.example.crazylab;

import com.example.crazylab.characters.Infected;
import com.example.crazylab.characters.Player;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class FightController {

    private Scene scene;
    private Stage fightingStage;
    private Player player;
    private Infected infected;

    private FightController controller;

    private static boolean FightOver = false;

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
        fightingStage = new Stage();
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("fight_with_infected.fxml"));
        scene = new Scene(loader.load());
        controller = loader.getController();
        controller.setInfected(infected);
        controller.setPlayer(player);
        fightingStage.setTitle("Fight with infected");
        fightingStage.setScene(scene);
        fightingStage.initModality(Modality.APPLICATION_MODAL);
        fightingStage.initOwner(GameControler.gameBoard);
        fightingStage.addEventHandler(KeyEvent.KEY_PRESSED, (e) -> {
            if(FightOver) {
                System.out.println("closing the stage");
                fightingStage.close();}
        });
        controller.fightHandler(scene);
        fightingStage.show();
    }

    private void fightHandler(Scene scene) throws IOException {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

                switch (keyEvent.getCode()) {
                    case ENTER -> {
                        if(!FightOver) {attackEnemy();}
                    }
                    default -> System.out.println(keyEvent.getCode());
                }
            }
        });
    }

    private void updateEnemyStatsDisplay(int randomAttack) {
        String toDisplay = showPlayerAttack.getText();
        toDisplay += "\n" + "Attack:  -" + randomAttack;
        showPlayerAttack.setText(toDisplay);
        if (infected.getHealth() > 0) enemyHealth.setText(String.valueOf(infected.getHealth()));
        else enemyHealth.setText("0");

    }

    private void updatePlayerStatsDisplay(int randomAttack) {
        String toDisplay = showEnemyAttack.getText();
        toDisplay += "\n" + "Attack:  -" + randomAttack;
        showEnemyAttack.setText(toDisplay);
        if (player.getHealth() > 0) playerHealth.setText(String.valueOf(player.getHealth()));
        else playerHealth.setText("0");
    }

    private void handlePlayerWinner() {
        showEnemyAttack.setText("YOU WIN!\n\nPres Enter\nto continue");
        FightOver = true;
    }

    private void handleEnemyWinner() {
        showPlayerAttack.setText("YOU LOST\n\nPres Enter\nto continue");
        FightOver = true;
    }


    private void attackPlayer() {
        int playerHealth = player.getHealth();
        int randomAttack = (int) (Math.random() * (8 - 2));  // TODO dobrać losowanie siły ataku
        playerHealth -= randomAttack;
        player.setHealth(playerHealth);
        updatePlayerStatsDisplay(randomAttack);
        if (playerHealth <= 0) handleEnemyWinner();
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
