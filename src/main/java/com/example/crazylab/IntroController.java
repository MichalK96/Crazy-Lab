package com.example.crazylab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class IntroController {

    @FXML
    private Label textWelcome;

    @FXML
    private void startNewGame(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        Parent root = loader.load();
        GameControler controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        controller.addCharactersToList();
        controller.setGame();
        GameControler.sceneSettings(controller, stage, scene);
    }

    // test commit

    void setName(String name) {
        textWelcome.setText("Welcome, dr " + name);
    }

}
